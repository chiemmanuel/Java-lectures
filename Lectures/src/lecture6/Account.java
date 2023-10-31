package lecture6;
// A class that gives the balance

import java.util.Objects;

public class Account {
	private int balance;
	private int accountNo;
	public Account(int balance, int i) {
		// TODO Auto-generated constructor stub
		this.balance = balance;
		this.accountNo = i;
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
	public void debit(int amount) {
		balance = balance - amount;
		System.out.println(amount +   " is debited" + " from account number " +   accountNo);
		displayBalance();
	}
	public void credit(int amount) {
		balance = balance + amount;
		System.out.println(amount +   " is credited into account number " +   accountNo);
		displayBalance();
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountNo, balance);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return accountNo == other.accountNo && balance == other.balance;
	}
}

