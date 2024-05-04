package Bank;

public class BankingAPI {

public static void main(String[] args) {
 BankAccount account = new BankAccount(1000); // initial balance of ksh 1000
 
//Deposit ksh 500
 account.deposit(500);
 System.out.println("Current balance after deposit: ksh"+account.getBalance());
 
 //Withdraw 200
 account.withdraw(200);
 System.out.println("Current balance after withdraw: ksh"+account.getBalance());
 
 //withdraw 2000
 account.withdraw(2000);
 System.out.println("Current balance after withdraw: ksh"+account.getBalance());
	}

}
