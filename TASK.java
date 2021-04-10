import java.util.*;
	class Bankaccount{
		String Name;
		double Balance;
		String address;
		String gender;
		String getname() {
			return Name;
		}
		
		void setName(String s) {
			s="SYED SAAD ALI";
			Name=s;
		}	
		void setPassword(int pass) {
			if(pass==1234) {
				System.out.println("CORRECT PASSWORD!");
				}
			else {
				System.out.println("WRONG PASSWORD PROCESS TERMINATE!");
				System.exit(0);
			}
				
			}
		double getBalance() {
			return Balance;
		
		}
		
		void setBalance(double bal) {
			Balance= bal;
		}
		void deposit(double atm) {
			if(atm<0) {
				System.out.println("INVALID OPREATION");
			}
			else {
				Balance+=atm;
				
			}
		}void withdraw(double atm){
			if(atm<0 || atm>Balance) {
				System.out.println("NOT VALID OPREATION");
				
			}
			else {
				Balance-=atm;
				
			}
		}void showBalance(){
			System.out.println("BALANCE IS;"+Balance);
		}
		
		
	}	
	
	public class TASK{
		public static void main(String[]args) {
			System.out.println("A-B-C BANKING(LTD)BANK ACCOUNT"+" (WELCOME DEAR USER!)");
			Scanner NAME=new Scanner(System.in);
			System.out.print("ENTER YOUR NAME:");
		
			
			Bankaccount acc;
			acc=new Bankaccount();
			acc.setName(NAME.nextLine());
			Scanner PASSWORD=new Scanner(System.in);
			System.out.print("ENTER YOUR PASSWORD:");
			acc.setPassword(PASSWORD.nextInt());
			Scanner CHOICE=new Scanner(System.in);
			System.out.print("DO YOU WANT TO DEPOSIT AMOUNT OR WITH DRAW(PRESS:1 FOR DEPOSIT:PRESS 2 FOR WITH DRAW):");
			int choice=CHOICE.nextInt();
			acc.setBalance(20000);
			if(choice==1) {
				Scanner DEPOSITS=new Scanner(System.in);
				System.out.print("ENTER THE AMOUNT YOU WANT TO DEPOSIT:");
				acc.deposit(DEPOSITS.nextFloat());
				}else if(choice==2) {
				Scanner DRAWING=new Scanner(System.in);
				System.out.print("ENTER THE AMOUNT YOU WANT TO WITH-DRAW;");
				acc.withdraw(DRAWING.nextDouble());
			}
			
			
			acc.showBalance();
		}
			
		
	}
	
	
		
		
			
	
	 
       
       

