/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name;
import java.util.*;
/**
 *
 * @author user
 */
public class TestClass {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float amount,balance,rate;
        String cardNumber;
        int select;
        
        System.out.print("Enter Name: ");
        String firstName = scan.next();
        String middleName = scan.next();
        String lastName = scan.next();
        Name Name = new Name(firstName,middleName,lastName);
        
        System.out.print("Enter Account Number: ");
        cardNumber = scan.next();
        
        System.out.print("Enter beginning balance: ");
        balance = scan.nextFloat();
        DebitCard dbt = new DebitCard(Name,cardNumber, balance);
        
        System.out.println("\nDEBIT CARD TRANSACTION");
        System.out.println("[1] Deposit Cash");
        System.out.println("[2] Withdraw Cash");
        System.out.println("[3] Inquire Balance");
        System.out.println("[4] Calculate Interest Rate");
        System.out.println("[5] Exit");
        
        System.out.print("Your Choice: ");
        select = scan.nextInt();
        
        switch(select){
            case 1:
                System.out.print("Enter Amount: ");
                amount = scan.nextFloat();
                dbt.depositCash(amount);
                System.out.print(dbt);
                break;
            case 2:
                System.out.print("Enter Amount: ");
                amount = scan.nextFloat();
                dbt.withdrawCash(amount);
                System.out.print(dbt);
                break;
            case 3:
                System.out.print(dbt.inquireBalance());
            	System.out.print(dbt);
            	break;
            case 4: 
            	System.out.print("\nEnter rate: \n");
            	rate = scan.nextFloat();
            	System.out.print("Interest Inquired: \n");
            	System.out.print(dbt.interest(rate));
            	System.out.println();
            	break;
            case 5:
            	System.out.print("\nEnd of Transaction");
        }
    }
}

