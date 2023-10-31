package lecture7;

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
		final Map <Integer, Account> accounts = new HashMap<>();
		for (int i = 0; i < 5; i++) {
			accounts.put(i, new Account(rnd.nextInt(1000),  i, "customer"+i));
		}
		creditService.setAccounts(accounts);
		debitService.setAccounts(accounts);
		eventDispatcher.registerEventHandler(TransactionEvent.class, creditService);
		eventDispatcher.registerEventHandler(TransactionEvent.class, debitService);
		eventDispatcher.registerEventHandler(TransactionEvent.class, new AccountHistoryService());
		for (int i = 0; i < 3; i++) {
			Account account = accounts.get(rnd.nextInt(5));
			int amount = rnd.nextInt(200);
			TransactionEvent transactionEvent = new TransactionEvent(account.getAccountNo(),
					amount, LocalDateTime.now(), account.getCustomerName());
			eventDispatcher.dispatchEvent(transactionEvent);
		}
		
		
	}

}
