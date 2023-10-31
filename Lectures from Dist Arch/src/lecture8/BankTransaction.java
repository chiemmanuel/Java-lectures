package lecture8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class BankTransaction {
    public static void main(String args[]) {
        EventDispatcher eventDispatcher = new EventDispatcher();
        CreditService creditService = new CreditService();
        DebitService debitService = new DebitService();
        Random rnd = new Random();
        AccountHistoryService historyService = new AccountHistoryService();
        final Map<Integer, Account> accounts = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            accounts.put(i, new Account(rnd.nextInt(1000), i, "customer" + i));
        }
        creditService.setAccounts(accounts);
        debitService.setAccounts(accounts);
        eventDispatcher.registerEventHandler(CreditEvent.class, creditService);
        eventDispatcher.registerEventHandler(DebitEvent.class, debitService);
        eventDispatcher.registerEventHandler(CreditEvent.class, historyService);
        eventDispatcher.registerEventHandler(DebitEvent.class, historyService);
        String[] eventClassList = new String[]{"lecture8.TransactionEvent", "lecture8.CreditEvent", "lecture8.DebitEvent"};
        for (int i = 0; i < 5; i++) {
            Account account = accounts.get(rnd.nextInt(5));
            int amount = rnd.nextInt(200);
            int indexClass = rnd.nextInt(3);

            try {
                Class<?> clazz = Class.forName((String) eventClassList[indexClass]);
                Class<?>[] parameterTypes = {int.class, int.class, LocalDateTime.class, String.class};
                Constructor<?> constructor = clazz.getConstructor(parameterTypes);
                Object event = constructor.newInstance(account.getAccountNo(), amount, LocalDateTime.now(), account.getCustomerName());
                eventDispatcher.dispatchEvent(event);
            } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException | ClassNotFoundException e) {
                // Handle exceptions here
                e.printStackTrace();
            }
        }
    }
}
