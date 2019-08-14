package comm.second;

import java.io.Serializable;

public class Account implements Serializable{
	private String accountNumber;
	private double amount;
	public Account(String accountNumber2, double amount2) {
		// TODO Auto-generated constructor stub
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String toString() {
		return  "account(acc num = :" + accountNumber + "amount:" + amount  ;
	}
	
	public Account 
 throws AccountNotValidException {
		this.accountNumber = accountNumber;
		this.amount = amount;
		if(amount<1000) {
			throw new AccountNotValidException("not a valid acccount");
		}
		
		return new Account(accountNumber,amount);	
	}
}
