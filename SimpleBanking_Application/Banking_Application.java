package SimpleBanking_Application;

import java.util.Scanner;

import Entity.Bank_Details;

public class Banking_Application {
	
	public static int total=0;
	public static int record=0;
    public static Bank_Details[] arr = new Bank_Details[100]; 
	
public void option() {
	int option=0;
	do{
		System.out.println("1.Insert all account details");
        System.out.println("2. Display all account details");
        System.out.println("3.Search by Account number");
        System.out.println("4.Check balance");
        System.out.println("5.Deposit");
        System.out.println("6.withdraw");
        System.out.println("7.Exit");
        Scanner scan=new Scanner(System.in);
        option=scan.nextInt();
        
	    switch(option) {
	  
	    case 1:{
	    	
	    	
	    	System.out.println("Number of record");
             record = scan.nextInt();
            for(int i=total;i<total+record;i++) {
            	arr[i]=new Bank_Details();
                arr[i].openAccount();
                 System.out.println("**********   ***********");
            }
            total = total + record;
	    	
	    break;	
	    }
	    case 2:{
	    	
	    	for (int i = 0; i < total; i++) {

				arr[i].showAccount();
				System.out.println("**********   ***********");

			}
	      break;
	    }
	    case 3:{
	    	System.out.println("Enter the Account No:");
			String Account_No= scan.next();
			Bank_Details details= new Bank_Details();
			Bank_Details[] found = new Bank_Details[total];
             details.searchByAccount_No(arr,Account_No,total,found);
             details.displayarr(found,total);
	    	
	    break;
	    }
	    case 4:{
	    	 System.out.print("Enter the Account No : ");  
             String Account_No= scan.next();
             
             Bank_Details details= new Bank_Details();
             Bank_Details[] found= new Bank_Details[total];
 			 
             details.searchByCheck_Balance(arr,Account_No,total, found);
             details.displayarr(found,total); 
	    break;	
	    }
	    case 5:{
	    	 System.out.print("Enter the Account No : ");  
             String Account_No= scan.next();
             System.out.print("Enter Deposit amount: "); 
             long amount= scan.nextLong();
             Bank_Details details= new Bank_Details();
             Bank_Details[] found= new Bank_Details[total];
 			 
             details.searchByDeposit(arr,Account_No,total,amount,found);
             details.displayarr(found,total); 
	    	break;
	    }
	    	
	    case 6:{
	    	
	    	 System.out.print("Enter the Account No : ");  
             String Account_No= scan.next();
             System.out.print("Enter withdrawn amount: "); 
             long amount= scan.nextLong();
             Bank_Details details= new Bank_Details();
             Bank_Details[] found= new Bank_Details[total];
 			 
             details.searchByWithDrawn(arr,Account_No,total,amount,found);
             details.displayarr(found,total);
             break;	
	    	
	  
	    }
	    case 7:{
	    	System.out.println("**********   ***********");
			System.exit(0);
       break;
	    }
	    default:{
	    	System.out.println("Invalid Number");
	    	System.out.println("**********   ***********");
	    	System.exit(0);
	    }
	    }
	
	}while(option<7);
}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

