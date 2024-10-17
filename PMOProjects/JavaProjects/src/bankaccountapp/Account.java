package bankaccountapp;

public abstract class Account implements IBaseRate{
	// List the properties for saving and checking accounts
	String name;
	String accountNo;
	String sSN;
	double balance;
	double rate;
	
	public Account(String name, double balance, String sSN) {
		super();
		this.name = name;
		this.balance = balance;
		this.sSN = sSN;
	}
	
	
	

	// Constructor to initialize account properties

	// List any method specific to account
}
