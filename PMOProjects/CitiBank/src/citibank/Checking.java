package citibank;

public class Checking extends Account {

	private int debiteCardNo;
	private int debiteCardPin;

	public Checking(String name, String sSN, double initialDeposite) {
		super(name, sSN, initialDeposite);
		accountNo = "2" + accountNo;
		setDebiteCard();
	}

	public void setDebiteCard() {
		debiteCardNo = (int) ((Math.random() * Math.pow(10, 12)));
		debiteCardPin = (int) ((Math.random() * Math.pow(10, 4)));
	}

	@Override
	public void setRate() {
		rate = getRate() * 0.15;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account Features " + "\nDebiteCardNo: " + debiteCardNo + ",\nDebiteCardPin: "
				+ debiteCardPin);
	}

}
