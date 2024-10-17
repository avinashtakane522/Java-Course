package citibank;

public abstract class Account implements IBaseRate {
	private String name;
	private String sSN;
	private double balance;
	protected String accountNo;
	private static int index = 10000;

	protected double rate;

	public Account(String name, String sSN, double balance) {
		super();
		this.name = name;
		this.sSN = sSN;
		this.balance = balance;
		this.accountNo = setAccountNo();
		index++;
		setRate();
	}

	public String setAccountNo() {
		String lastTwoDigit = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueNo = index;
		int randomNo = (int) (Math.random() * (Math.pow(10, 3)));
		return lastTwoDigit + uniqueNo + randomNo;
	}
	
	public void compound() {
		double accruedInterest = balance * (rate/100);
		balance = balance + accruedInterest;
	}
	
	public abstract void setRate();

	public void showInfo() {
		System.out.println("****\nNAME: "+ name +
				"\nACCOUNT NUMBER: "+ accountNo +
				"\nBALANCE: "+ balance +
				"\nRATE: "+ rate + "%\n");
	}

}
