
//craete BankAccount class
class BankAccount{
	static String bankName="HDFC";
	String accountHolderName; 
	final String accountNumber;
	static int totalAccounts=0;
	
	//default constructor
	BankAccount(){
	   this("Guest");
	}
	
	//parameterized constructor
	BankAccount(String accountHolderName){
		this.accountHolderName=accountHolderName;
		totalAccounts++;
		accountNumber=Integer.toString(1000+totalAccounts);
	}
	
	//method to get Total number of accounts
	public static int getTotalAccounts(){
		return totalAccounts;
	}
	
	//method to display account details;
	public static void displayDetails(BankAccount account){
		if(account instanceof BankAccount){
		   System.out.println("\n-----Bank Account Details-----");
		   System.out.println("Account Holder Name   :" +account.accountHolderName);
		   System.out.println("Account Number        :" +account.accountNumber);
		   System.out.println("bank Name             :" +account.bankName);
		   System.out.println("------------------------------");
		}else{
			System.out.println("Given Object is not an instance of BankAccount class");
		}
	}
}

//create BankAccountSystem class
public class BankAccountSystem1{
	public static void main(String args[]){
		//creating objrcts
		BankAccount account1=new BankAccount();
		BankAccount account2=new BankAccount("Anush Sharma");
		
		BankAccount.displayDetails(account1);
		BankAccount.displayDetails(account2);
		
		System.out.println("Total Number of accounts in bank : "+BankAccount.getTotalAccounts());
	}
}