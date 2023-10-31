package lecture3;

public class RunnableInterfaceThread implements Runnable {

@Override
public void run(){
	try {
		System.out.println("thread number" + Thread.currentThread().getId() + "is executing");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	
public static void main(String[] args) {
	for  (int i = 0; i < 3; i++) {
		Thread thread = new Thread(new RunnableInterfaceThread());
		thread.start();
		
	}
}
}
