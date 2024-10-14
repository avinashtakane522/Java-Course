package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity=500;
	private int defaultPasswordLength=10;
	private String alternateEmail;
	private String companySuffix = "atcompany.com";

	// Const. to receive first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		//Call method asking for the department - return the department
		this.department = setDepartment();
		
		//Call method that return random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is : "+this.password);
		
		//Combine element to generate email
		email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}

	// Ask for department
	private String setDepartment() {
		System.out.print("New Worker : "+ firstName + "Department Codes: \n1 for Sales\n2 for Development\n3 for Accounting"
				+ "\n0 for none\n Enter Department Code: ");
		Scanner sc = new Scanner(System.in);
		int depChoice = sc.nextInt();
		if(depChoice == 1) {return "sales";}
		else if(depChoice == 2) {return "dev";}
		else if(depChoice == 3) {return "acct";}
		else {return "";}		
	}
	
	//Generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	// set mailbox capacity
	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}

	// set alternate email
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	// Change password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getmailboxCapacity() {
		return mailboxCapacity;
	}

	public String getPassword() {
		return password;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String showInfo() {
		return "\nDISPLAY NAME: " + firstName + " " + lastName + 
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOC CAPACITY: " + mailboxCapacity + "mb";
	}
	
}
