import java.util.*;
 class Account{
	
	String customerName;
	String  accountNo;
	String accountType;
	
	Account(String customerName,String accountNo,String accountType){
	
		this.customerName = customerName;
		this.accountNo = accountNo;
		this.accountType = accountType;
		
	}
	
	 
}

class Sav_Acct extends Account{

	double savBalance = 0;
	
	double t;
	
	double r = 6/100;
	
	double n=2;
	

	Sav_Acct(String customerName,String accountNo,String accountType){
	
		super(customerName,accountNo,accountType);
		
	}

	void computeInterest(int t){
	 	
	 	double x = 1+(r/n);
	 	double interest = Math.pow(x,(n*t));
	 	savBalance*=interest;
	 	
	 }
	 
	
	void deposit(double deposit,int t){
	 	System.out.println("Amount " + deposit + "is deposited ");
	 	savBalance+=deposit;
	 	computeInterest(t);
	 }
	 
	 void balance(){
	 	System.out.println("Present Balance is "+ savBalance );
	 }
	 
	 
	 void withdraw(double withdraw){
	 	if(savBalance < withdraw){
	 		System.out.println("Withdraw is not possible");
	 		return;
	 	}
	 	System.out.println("Amount " + withdraw + "is withdrawed ");
	 	savBalance-=withdraw;
	 	
	 }
	 
	 
}

class Curr_Acct extends Account{

	float currBalance = 0;

	Curr_Acct(String customerName,String accountNo,String accountType){
	
		super(customerName,accountNo,accountType);
		
	}

	
	
	void deposit(double deposit){
	 	System.out.println("Amount " + deposit + "is deposited ");
	 	currBalance+=deposit;
	 }
	 
	 void balance(){
	 	System.out.println("Present Balance is "+ currBalance );
	 }
	
	 
	 void withdraw(double withdraw){
	 
	 	if(currBalance < withdraw){
	 		System.out.println("Withdraw is not possible");
	 		return;
	 	}
	 	System.out.println("Amount " + withdraw + "is withdrawed ");
	 	currBalance-=withdraw;
	 	if(currBalance < 1000 && currBalance >= 100){
	 		currBalance-=100;
	 		System.out.println("Due to low Balance service charges of RS 100 is imposed");
	 	}
	 }
	 
	 
	
}

class Test3{
	
	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name");
		String holderName=sc.nextLine();
		
		System.out.println("Enter the account no");
		String accountNo=sc.nextLine();
		
		System.out.println("Enter the account type SA or CA");
		String accountType=sc.nextLine();
		
		if(accountType.equals("SA")){
			Sav_Acct sa = new Sav_Acct(holderName,accountNo,accountType);
			
			while(true){
				System.out.println("\n");
				System.out.println("Saving Acoount options");
				System.out.println("1 Deposit");
				System.out.println("2 Balance");
				System.out.println("3 Withdraw");
				System.out.println("4 Exit");
				System.out.println("Enter your option");
				int op = sc.nextInt();
				
				switch(op){
					
					case 1:
						System.out.println("Enter the amount");
						double d1 = sc.nextDouble();
						
						System.out.println("Enter the t value");
						int t = sc.nextInt();
						
						sa.deposit(d1,t);
						break;
						
					case 2:
						sa.balance();
						break;
						
					case 3:
						System.out.println("Enter the amount tp withdraw");
						double d = sc.nextDouble();
						
						sa.withdraw(d);
						break;	
						
					case 4:
						System.exit(0);	
						
					default:
						System.out.println("Wrong Choice");
								
				}
			}
		}
		
		if(accountType.equals("CA")){
			Curr_Acct ca = new Curr_Acct(holderName,accountNo,accountType);
			
			while(true){
				System.out.println("\n");
				System.out.println("Current Acoount options");
				System.out.println("1 Deposit");
				System.out.println("2 Balance");
				System.out.println("3 Withdraw");
				System.out.println("4 Exit");
				System.out.println("Enter your option");
				int op = sc.nextInt();
				
				switch(op){
					
					case 1:
						System.out.println("Enter the amount");
						double d1 = sc.nextDouble();
						
						
						ca.deposit(d1);
						break;
						
					case 2:
						ca.balance();
						break;
						
					case 3:
						System.out.println("Enter the amount tp withdraw");
						double d = sc.nextDouble();
						
						ca.withdraw(d);
						break;	
						
					case 4:
						System.exit(0);	
						
					default:
						System.out.println("Wrong Choice");
								
				}
			}
		}
		
		
		//Curr_Acct ca = new Curr_Acct("Uha","2472114548","currentAccount");
		
		
		
		
	}
}	

