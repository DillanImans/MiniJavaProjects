import java.util.*;

public class BankAccount {
	// Initialize Class Variables
	private String bankNumber;
	private int pinCode;
	private int balance;
	private User bankUser;
	
	// Constructors
	BankAccount(String bankNumber, int pinCode, int balance, User bankUser){
		this.bankNumber = bankNumber;
		this.pinCode = pinCode;
		this.balance = balance;
		this.bankUser = bankUser;
	}
	
	// Get and Set for BankNum
	protected String getBankNumber() {
		return bankNumber;
	}
	protected void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	}

	// Get and Set for PinCode
	protected int getPinCode() {
		return pinCode;
	}
	protected void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	// Get and Set for Balance
	protected int getBalance() {
		return balance;
	}
	protected void setBalance(int balance) {
		this.balance = balance;
	}

	// Get and Set for BankUser
	protected User getBankUser() {
		return bankUser;
	}
	protected void setBankUser(User bankUser) {
		this.bankUser = bankUser;
	}
}


class User {
	// Initialize Class Variables
	private String name;
	
	// Constructor
	User(String name){
		this.name = name;
	}

	// Get and Set for Name
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	
	// To return name for BankAccount
	public String toString() {
        return name;
    }
	
}

