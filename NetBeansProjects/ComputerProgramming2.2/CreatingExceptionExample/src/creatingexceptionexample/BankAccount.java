package creatingexceptionexample;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s540549
 */
public class BankAccount {
    private double balance;
    
    public BankAccount(){
        this.balance = 0.0;
    }
    
    public BankAccount(double balance) throws NegativeStartingBalanceException{
        if(balance < 0){
            throw new NegativeStartingBalanceException(balance);
        }
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    
}
