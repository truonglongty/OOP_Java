package tuan1.account;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	private final double RATE = 0.035;
	
	
	public Account() {
		this.accountNumber = 999999;
		this.name = "Chưa xác định";
		this.balance = 50000;
	}
	
	
	public Account(long accountNumber, String name, double balance) {
		if(accountNumber > 0 && !name.trim().equals("") && balance >= 50000) {
			this.accountNumber = accountNumber;
			this.name = name;
			this.balance = balance;
		}
		else {
			this.accountNumber = 999999;
			this.name = "Chưa xác định";
			this.balance = 50000;
		}
	}

	public Account(long accountNumber, String name) {
	        this(accountNumber, name, 50000);
	}

	public long getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	

	public boolean deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			return true;
		}
		else
			return false;
	}
	
	public boolean withdraw(double amount, double fee) {
		if(amount > 0 && amount + fee <= balance) {
			balance -= (amount + fee);
			return true;
		}
		else
			return false;
	}
	
	public void addInterest() {
		balance += balance*RATE; 
	}
	
	public boolean transfer(Account acc2, double amount) {
		if(amount > 0 && amount <= balance) {
			this.balance += amount;
			acc2.balance -= amount;
			return true;
		}
		else 
			return false;
	}
	
	@Override
	public String toString() {
		//DecimalFormat df = new DecimalFormat("#,##0.00");
		Locale local = new Locale("vi", "vn");
		NumberFormat nf = NumberFormat.getCurrencyInstance(local);
		return String.format("Số tài khoản: %d, Tên tài khoản: %s, Số dư: %s", accountNumber, name, nf.format(balance));
	}
}
