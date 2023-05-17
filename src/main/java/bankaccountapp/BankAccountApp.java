package bankaccountapp;


public class BankAccountApp {
	public static void main(String[] args) { 
		
		Checking ck1 = new Checking("Tom Jerry", "564783926574", 1500);
		Savings sav1 = new Savings("Harry Brook", "46738437478", 2500);
		
		sav1.showInfo();
		ck1.showInfo();
	
	}
} 