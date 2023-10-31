package lecture7;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountHistoryService implements TransactionHandler {
	
	private Map<Integer, List<TransactionEvent>> history = new HashMap<>();

	@Override
	public void onTransaction(TransactionEvent event) {
		int accountNo = event.getAccountNo();
		history.computeIfAbsent(accountNo, key ->new ArrayList<>()).add(event);
		
		displayCreditTransactions(accountNo);
		displayDebitTransactions(accountNo);
		
	}
	
	private void displayCreditTransactions(int accountNo) {
		System.out.println("=== History of account "+ accountNo + " ===");
		for (TransactionEvent event: history.getOrDefault(accountNo, new ArrayList<>())) {
			System.out.println( event.getBusinessName() + " has credited "
		        + event.getAmount() + " to account: " + event.getAccountNo() + " at: " + event.getDate().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) );
		}}
	private void displayDebitTransactions(int accountNo) {
			System.out.println("=== History of account "+ accountNo + " ===");
			for (TransactionEvent event: history.getOrDefault(accountNo, new ArrayList<>())) {
				System.out.println( event.getBusinessName() + " has debited "
			        + event.getAmount() + " to account: " + event.getAccountNo() + " at: " + event.getDate().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) );
			
		};
	}
}

