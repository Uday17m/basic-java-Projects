package EmailApp;

import java.util.Scanner;

public class Email {
	private String email;
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String companySuffix = "aeycompnay.com";
	
	// Constructor to receive the first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created : "+this.firstName + " "+ this.lastName);
	
	// call a method for the department return the department
		this.department = setDepartment(); 
		System.out.println("Department Codes:" + this.department);
		
		// call a method to return the department
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is:" + this.password);
	// ask for the department
		
		//combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is : "+ email);
	
	}
	private String setDepartment() {
	System.out.println("DepartmentCodes\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\n Enter department Code:");
	Scanner in = new Scanner(System.in);
	int depChoice = in.nextInt();
	if(depChoice == 1) {return "sales";}
	else if(depChoice == 2) { return "dev";}
	else if(depChoice == 3) { return "act"; }
	else { return ""; }
	}
	
	 private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			
			}
		return new String(password);
	}
		
	 public void setMailboxCapacity(int capacity) {
		 this.mailboxCapacity = capacity;
	 }
	 
	 public void setAlternateEmail(String altEmail) {
		 this.alternateEmail = altEmail;
		 
	 }
		public void changePassword(String password) {
			this.password = password;
		}
		
		public int getMailboxCapacity(){
			return mailboxCapacity;
			
		
		}
		public String getAlternateEmail() { 
			return alternateEmail;
		}
		public String getPassword() {
			return password;
		}
	public String showInfo() {
		return "DISPLAY NAME:" + firstName +  " " + lastName  +  
				"\nCOMPANY EMAIL: "   + email +
				"\nMAILBOXCAPACITY: "  + mailboxCapacity + "mb";
	}
}
