package lecture3;
// A class that gives the balance

public class Account {
	private int balance;
	private int accountNo;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	void displayBalance() {
		System.out.println("Account number: " +   accountNo +   " Balance " +   balance);
	}
	synchronized void deposit(int amount) {
		balance = balance + amount;
		System.out.println(amount +  " is deposited into account number " +   accountNo );
		displayBalance();
	}
	synchronized void withdraw(int amount) {
		balance = balance - amount;
		System.out.println(amount +   " is withdrawed from account number " +   accountNo);
		displayBalance();
	}
}

