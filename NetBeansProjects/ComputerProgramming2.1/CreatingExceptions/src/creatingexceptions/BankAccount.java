/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingexceptions;

/**
 *
 * @author s540549
 */
public class BankAccount {
    private double balance;
    
    public BankAccount (double balance) throws NegativeStartingBalanceException{
        if (balance < 0)
            throw new NegativeStartingBalanceException();
        this.balance = balance;
    }
    
    public double getBalance(){
        return this.balance;
    }
}
