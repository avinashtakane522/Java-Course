package citibank;

import java.util.*;

public class CitiBankApplication {
	public static void main(String args[]) {
		List<Account> accounts = new LinkedList<Account>();
		String file = "D:\\NewBankAccounts.csv";

		List<String[]> newAccountHolder = utilities.CSV.read(file);
		for (String[] ac : newAccountHolder) {
			String name = ac[0];
			String sSN = ac[1];
			String accType = ac[2];
			double initialDeposite = Double.parseDouble(ac[3]);
//			System.out.println(name+" "+sSN+" "+accType);
			if (accType.equals("Savings")) {
				accounts.add(new Saving(name, sSN, initialDeposite));
			} else if (accType.equals("Checking")) {
				accounts.add(new Checking(name, sSN, initialDeposite));
			} else {
				System.out.println("The given file data is incorrect");
			}
		}
		for (Account acc : accounts) {
			acc.showInfo();
		}
	}
}
