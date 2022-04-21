/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name;

/**
 *
 * @author user
 */
public class DebitCard extends Name{
    private Name Name;
    private String cardNumber;
    private float balance;
    
    public DebitCard(){ }
    
    public DebitCard(Name Name, String cardNumber, float balance){
        this.Name = Name;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }
    public String getCardNumber(){
        return cardNumber;
    }
    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }
    public float getBalance(){
        return balance;
    }
    public void setBalance(float balance){
        this.balance = balance;
    }
    float inquireBalance(){
        return this.balance;
    }
    float depositCash(float amount){
        return balance += amount;
    }
    boolean withdrawCash(float amount){
        if(amount <= getBalance()) {
            this.balance -= amount;
    		return true;
    	}else {
            System.out.println("INSUFFICIENT FUNDS");
    	}
        return  false;
    }
    float interest(float rate){
        float ans = (rate/100)/12;
        return balance*ans;
    }
    public String toString(){
        String str = String.format("%.02f", getBalance());
    	return Name.toString() + "\nAccount Number: " + getCardNumber() + "\nBalance: " + getBalance();
	}
    }
