package lecture8;

import java.time.LocalDateTime;

public class TransactionEvent {
	
	private int accountNo;
	private int amount;
	private LocalDateTime date;
	private String businessName;

	public TransactionEvent() {
		super();
	}


	public TransactionEvent(int accountNo, int amount, LocalDateTime date, String businessName) {
		super();
		this.accountNo = accountNo;
		this.amount = amount;
		this.date = date;
		this.businessName = businessName;
	}


	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	
	
	
}
