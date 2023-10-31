package lecture8;


public class Account {

	private int balance;
	private int accountNo;
	private String customerName; 
	
	public Account() {
		super();
	}
	
	public Account(int balance, int accountNo, String customerName) {
		this.balance = balance;
		this.accountNo = accountNo;
		this.customerName = customerName;
	}
	
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

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	void displayBalance() {
		System.out.println("Account No: " + accountNo + " blance is now = " + balance);
	}

	public void credit(int amount) {
		this.balance = this.balance + amount;
		System.out.println(customerName+ " has credited "+ amount  + " to account: " + this.accountNo );
		displayBalance();
   }
	
	public  void debit(int amount) {
		  balance = balance - amount;
		  System.out.println(customerName+ " has debited "+ amount  + " from account: " + this.accountNo );
		  displayBalance();
   }
}