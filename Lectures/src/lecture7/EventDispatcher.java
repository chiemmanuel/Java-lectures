package lecture7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventDispatcher {
	
	private final Map<Class<?>, List<Object>>  eventHandlers = new HashMap<>();
	
	private void invokeEventHandler(Object handler, Object event) {
		Method method;
		try {
			method = handler.getClass().getMethod("onTransaction", event.getClass());
			method.invoke(handler, event);
		} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException |SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void registerEventHandler(Class<?> eventType, Object eventHandler) {
		eventHandlers.computeIfAbsent(eventType, key -> new ArrayList<>()).add(eventHandler);
	}
	
	public void dispatchEvent(Object event) {
		List<Object> handlers = eventHandlers.getOrDefault(event.getClass(), new ArrayList<>());
		handlers.stream().forEach(handler -> invokeEventHandler(handler, event));
	}


}
