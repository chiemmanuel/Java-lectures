package lecture7;

import java.util.HashMap;
import java.util.Map;

public class DebitService implements TransactionHandler {
	
	private Map<Integer, Account> accounts = new HashMap<>();
	
	

	public Map<Integer, Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Map<Integer, Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public void onTransaction(TransactionEvent event) {
		int accountNo = event.getAccountNo();
		try {
			if (accounts.containsKey(accountNo)) {
				debitToAccount(accountNo, event.getAmount());
			} else {
				String msg = "Account " + accountNo + " is not registered";
				throw new TransactionException(msg);
			}
			
		} catch (TransactionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void debitToAccount(int accountNo, int amount) {
		System.out.println("=== Debiting of account "+ accountNo + " ===");
		accounts.get(accountNo).debit(amount);
	}
	


}
