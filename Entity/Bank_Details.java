package Entity;
import java.util.Scanner;
public class Bank_Details {
   
	String Account_No;
	String First_name,Last_name;
	String Account_Type;
	long balance=0;
	
	public void openAccount() { 
		Scanner scan=new Scanner(System.in);
        System.out.print("Enter Account No: ");  
        Account_No = scan.next();  
        System.out.print("Enter Account type: ");  
        Account_Type= scan.next();  
        System.out.print("Enter First Name: ");  
        First_name= scan.next(); 
        System.out.print("Enter Last Name: ");  
        Last_name= scan.next();
        System.out.print("Enter Balance: ");  
        balance = scan.nextLong();  
    }  
	public void showAccount() {  
        
        System.out.println("Account no: " + Account_No);  
        System.out.println("Account type: " +Account_Type); 
        System.out.println("account Holder name: " +First_name+" "+Last_name);  
        System.out.println("Balance: " + balance);  
    }  
	
	public void searchByAccount_No(Bank_Details[] arr,String Account_No, int total,Bank_Details[] returnarr) {
	
		int matchedcount = 0;
		for (int i = 0, j = 0; i < total; i++) {

			if (arr[i].Account_No.equals(Account_No))// 110
			{
                
				returnarr[matchedcount] = arr[i];
				
			}

		}
	}
	public void searchByCheck_Balance(Bank_Details[] arr,String Account_No,int total,Bank_Details[] returnarr) {
		
		int matchedcount = 0;
		for (int i = 0, j = 0; i < total; i++) {

			if (arr[i].Account_No.equals(Account_No))// 110
			{
				
		              
		            System.out.println("Balance: " + arr[i].balance);  
		            System.out.println("**********   ***********");
				returnarr[matchedcount] = arr[i];
				
			}
		}
    }
    public void searchByDeposit(Bank_Details[] arr,String Account_No,int total,long amount,Bank_Details[] returnarr) {
		
		int matchedcount = 0;
		for (int i = 0, j = 0; i < total; i++) {

			if (arr[i].Account_No.equals(Account_No))// 110
			{
				
		            arr[i].balance= arr[i].balance + amount;  
		            System.out.println("Balance after deposit: " + arr[i].balance);  
		            System.out.println("**********   ***********");
				returnarr[matchedcount] = arr[i];
				
			}
		}

		}
	public void searchByWithDrawn(Bank_Details[] arr,String Account_No,int total,long amount,Bank_Details[] returnarr) {
		
		int matchedcount = 0;
		for (int i = 0, j = 0; i < total; i++) {

			if (arr[i].Account_No.equals(Account_No))// 110
			{
				if (arr[i].balance >= amount) {  
		            arr[i].balance= arr[i].balance - amount;  
		            System.out.println("Balance after withdrawal: " + arr[i].balance);  
		        } else {  
		            System.out.println("Your balance is less than " + amount + "\tTransaction failed...!!" );  
		        }  
				System.out.println("**********   ***********");
				returnarr[matchedcount] = arr[i];
				
			}

		}
	}
	
	public void displayarr(Bank_Details[] arr,int total) {
			boolean isRecordPresent = false;
			for (int i = 0; i < total; i++) {
				
				if (arr[i] != null) {
					isRecordPresent = true;
					arr[i].showAccount();
					System.out.println("**********   ***********");
				}
			}
			if (isRecordPresent == false) {
				System.out.println("Search failed! Account doesn't exist..!!");
				System.out.println("**********   ***********");
			}
		}
	}
