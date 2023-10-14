package ATM_PROJECT;

import java.util.Scanner;

public class AtmOperation {
     
	double Balance;
	private int pin;
	
	AtmOperation(double Balance,int pin){
		this.Balance=Balance;
		this.pin=pin;
	}
	public void CheckPin() {
		System.out.println("Enter you pin :");
		Scanner sc = new Scanner(System.in);
		int enterPin = sc.nextInt();
		if(enterPin==pin) {
			mainMenu();
		}
		else {
			System.out.println("Eenter your valid pin number");
		}
		
		
	}
	 public void checkBalance() {
		// CheckPin();
		 
		 System.out.println("Your Available Balance is : "+Balance);
		 mainMenu();
	 }
	 
	 public void withdraw() {
		 System.out.println("Enter your Amount ");
		 Scanner sc = new Scanner(System.in);
		 int amount = sc.nextInt();
		 if(amount < Balance) {
			 Balance = Balance-amount;
			 System.out.println("your withdraral money is :" +amount);
			 
		 }
		 else {
			 System.out.println("Insufficient Funds");
		 
		 } 
		 mainMenu();
	 }
	 
	 public void DepositMoney() {
		 System.out.println("Enter your Amount :");
		 Scanner sc = new Scanner(System.in);
		 double amount= sc.nextInt();
		 Balance = Balance+ amount;
		 
		 System.out.println("Your money "+amount +"is credit in your account.");
		 mainMenu();
	 }
	 public void Exist() {
		return;
		 
	 }
	public void mainMenu() {
		System.out.println("select your option");
		System.out.println("1.Check A/c Balance");
		System.out.println("2.withdraw Money");
		System.out.println("3.Deposite Money");
		System.out.println("4.Exist");
		
		Scanner sc = new Scanner(System.in) ;
		int opt = sc.nextInt();
		if(opt==1) {
			checkBalance();
		}
		else if(opt==2){
			withdraw();
		}
		else if (opt == 3) {
			DepositMoney();
		}
		else if (opt==4) {
			Exist();
		}
		else {
			System.out.println("select your choice");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Plzz Enter your Atm Card");
		AtmOperation atm= new AtmOperation(1000.00,8888);
		atm.CheckPin();
		//atm.checkBalance();
		
	}
	
}
