/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexample;

/**
 *
 * @author s540549
 */
public class BankAccount {
    private double balance;
    
    public BankAccount (double balance){
        this.balance = balance;
    }
    
    public void deposit (double amount){
        balance = balance + amount;
    }
    
    public void withdraw (double amount){
        balance = balance - amount ;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public String toString(){
        return "Balance: " + this.balance;
    }
}
