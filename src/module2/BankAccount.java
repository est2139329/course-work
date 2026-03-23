package module2;

public class BankAccount {
	
	private double balance;
	private String name;
	private int acctNum;

/**----------------------------------------------
*Constructor -- initializes balance to, owner, and account number
*/
public BankAccount()
{
   balance = 0;
   name = "unknown";
   acctNum = 0;
}

public BankAccount(int aNum, String aName, double amount)
{
   balance = amount;
   name = aName;
   acctNum = aNum;
}
	   

	   public void setAcctNum(int aNum)
	   {
	      acctNum = aNum;
	   }

	   /**
	      The setName method stores a value in the
	      name field.
	      @param aName The value to store in width.
	   */

	   public void setName(String aName)
	   {
	      name = aName;
	   }

	   /**
	      The getAcctNum method returns the value of
	      BankAccount object's instance variable name.
	      @return The value in the name variable.
	   */

	   public String getName()
	   {
	      return name;
	   }

	   /**
	      The getBalance method returns a BankAccount
	      object's balance instance variable.
	      @return The value in the balance instance variable.
	   */
	   
	   public double getBalance()
	   {
	      return balance;
	   }

	   /**
	      The withdraw checks to see if balance is 
	      sufficient for withdrawal.If so, decrement 
	      balance by amount; if not prints message. 
	   */

		public void withdraw(double amount)
		{
		  if (balance >= amount)
		    balance = balance - amount;
		   else
		  System.out.println("Insufficient funds");
		}
		 /**
	      The deposit method adds amount to the 
	      balance 
	   */		
		public void deposit(double amount)
		{
		  balance = balance + amount;
		}
		
		 /**
	      Returns a string containing the name, account number, and balance
	   */
		public String toString()
		{
		  return 
			  "\tName: " + name +
			  "\n\tAccount Number: " + acctNum +
			  "\n\tBalance: " + balance;  
		}
	
	
	
	
	
	
	
	
	
	
	
	
}
