package bankaccountapp;
import java.util.*;

public class BankAccountApp {
	public static void main(String args[]) {
		String file = "D:\\NewBankAccounts.csv";
		List<Account> list = new LinkedList<Account>();
		
		//Read a CSV File then create new account based on that data
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for(String[] s : newAccountHolders) {
			System.out.println(s[0]);
			String name = s[0];
			String sSN = s[1];
			String accountType = s[2];
			double initDeposit = Double.parseDouble(s[3]);
//			if(accountType.equals("Savings")) {
//				list.add(new Savings(name, sSN, initDeposit));
//			}
			
		}
	}
}
