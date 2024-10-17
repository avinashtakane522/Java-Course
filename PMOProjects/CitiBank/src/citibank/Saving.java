package citibank;

public class Saving extends Account {
	private int depositeBoxId;
	private int depositeBoxCode;

	public Saving(String name, String sSN, double initialDeposite) {
		super(name, sSN, initialDeposite);
		accountNo = "1" + accountNo;
		setDepositeBox();
	}

	public void setDepositeBox() {
		depositeBoxId = (int) ((Math.random() * Math.pow(10, 3)));
		depositeBoxCode = (int) ((Math.random() * Math.pow(10, 4)));
	}
	
	@Override
	public void setRate() {
		rate = getRate() * 0.25;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account Features" + "\nDepositeBoxId: " + depositeBoxId + ",\nDepositeBoxCode: "
				+ depositeBoxCode);
	}

	
}
