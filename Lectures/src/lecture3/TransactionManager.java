package lecture3;

public class TransactionManager {

	public static void main(String args[]) {
		Account myAccount = new Account();
		myAccount.setBalance(1000);
		myAccount.setAccountNo(1);
		Thread thread1 = new Thread(new Deposit(myAccount, 1500));
		Thread thread2 = new Thread(new Withdraw(myAccount, 500));
		thread1.start();
		thread2.start();
		
	}
}
