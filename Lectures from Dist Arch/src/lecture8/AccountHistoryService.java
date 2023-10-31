package lecture8;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountHistoryService {
	
	private Map<Integer, List<Object>> history = new HashMap<>();

	public void onTransaction(Object event) {
		if (event instanceof CreditEvent) {
			int accountNo = ((CreditEvent) event).getAccountNo();
			history.computeIfAbsent(accountNo, key ->new ArrayList<>()).add(event);
			displayCreditTransactions(accountNo);
		}
		
		if (event instanceof DebitEvent) {
			int accountNo = ((DebitEvent) event).getAccountNo();
			history.computeIfAbsent(accountNo, key ->new ArrayList<>()).add(event);
			displayDebitTransactions(accountNo);
		}
		
	}
	
	private void displayCreditTransactions(int accountNo) {
		System.out.println("=== History of account "+ accountNo + " ===");
		for (Object event: history.getOrDefault(accountNo, new ArrayList<>())) {
			System.out.println( ((CreditEvent) event).getBusinessName() + " has credited "
		        + ((CreditEvent) event).getAmount() + " to account: " + ((CreditEvent) event).getAccountNo() + " at: " + ((CreditEvent) event).getDate().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) );
		}}
	private void displayDebitTransactions(int accountNo) {
			System.out.println("=== History of account "+ accountNo + " ===");
			for (Object event: history.getOrDefault(accountNo, new ArrayList<>())) {
				System.out.println( ((DebitEvent) event).getBusinessName() + " has debited "
			        + ((DebitEvent) event).getAmount() + " to account: " + ((DebitEvent) event).getAccountNo() + " at: " + ((DebitEvent) event).getDate().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) );
			
		};
	}
}

