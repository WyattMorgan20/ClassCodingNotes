/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexample;
import java.util.*;

/**
 *
 * @author s540549
 */
public class ArrayListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1000.00);
        BankAccount acc2 = new BankAccount(2000.00);
        
        acc1.deposit(500.00);
        acc2.withdraw(300.00);
        
        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(new BankAccount(500.00));
        accounts.add(new BankAccount(1500.00));
        accounts.add(new BankAccount(3000.00));
        
        //Print objets in the ArrayList by the index number
        for(int i = 0; i < accounts.size(); i++){
            System.out.println(accounts.get(i).getBalance());
        }
        
        //Deposit an amount into a BankAccount
        accounts.get(2).deposit(200.00);
        printArrayList(accounts);
        
        //Add another account at a specific index
        accounts.add(1, new BankAccount(6789));
        printArrayList(accounts);
        
        //Override an account
        accounts.set(0, new BankAccount(1234));
        printArrayList(accounts);
        
        //Remove an account
        accounts.remove(2);
        printArrayList(accounts);
    }
    
    public static void printArrayList(ArrayList<BankAccount> temp){
        System.out.println("");
        System.out.println("Accounts");
        //Enhanced for loop to print ot accounts
        for(BankAccount acct: temp){
            System.out.println(acct);
        }
    }
    
}
