package module2;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		final int SIZE = 3;
		
		BankAccount [] wellsFargo = new BankAccount[SIZE] ;  //declare an array of BankAccounts

		System.out.println("Load City Bank with BankAccount objects");
		//**call the fillAccounts method and pass wellFargo Array to it*/
		//Arrays are objects in Java and  always passed by Object reference
		fillAccounts(wellsFargo);
		
		System.out.println( "\n Wells Fargo  Bank Accounts");
		System.out.println("\n-------------------------");
		/** display all the account information in wellsFargo */
		wellsFargo[2].toString();
		wellsFargo[0].toString();
		wellsFargo[1].toString();
		
		/** display the total cash in wellsFargo */
		
		for (int i = 0; i < wellsFargo.length; i++) {
			double sum = 0;
			sum = sum + wellsFargo[i].getBalance();
			System.out.println(sum);
		}

		/**display all accounts in the bank. Use for each loop*/
		for (BankAccount acct : wellsFargo) {
			System.out.println(acct);
		}
		
		
		System.out.println( "\nBank Closed\n");

	}

	public static void fillAccounts(BankAccount accts[])
	{
		int acctNo;
		double initBalance;
		String owner;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < accts.length; i++)
		{
			System.out.print("Enter the account number: ");
		    //read in the account number here
			acctNo = scan.nextInt();
		    System.out.print("Enter the account balance: ");
		    //read in the balance 
		    initBalance = scan.nextDouble();
		    System.out.print("Enter the account name: ");
	        //read in the name
		    owner = scan.next();
		    scan.nextLine();
		    System.out.println();
	        //create a new BankAccount object use the constructor with parameters.
			//and load it into the array

	        BankAccount userAcct = new BankAccount(acctNo, owner, initBalance);
		    accts[0] = new BankAccount(acctNo, owner, initBalance);
		    accts[1] = new BankAccount(acctNo, owner, initBalance);
		    accts[2] = new BankAccount(acctNo, owner, initBalance);
		}
	}
	

}
