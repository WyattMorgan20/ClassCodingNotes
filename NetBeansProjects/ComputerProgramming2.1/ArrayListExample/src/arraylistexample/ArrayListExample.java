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
        //Create an ArrayList of BankAccount objects
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        
        //Add elements to the arraylist
        accounts.add(new BankAccount(1000));
        accounts.add(new BankAccount(2000));
        accounts.add(new BankAccount(3000));
        
        //Deposit into the 2nd account
        accounts.get(1).deposit(500);
        
        //Print the balance for 3rd account
        System.out.println(accounts.get(2).getBalance());
        //Add another BankAccount object at a specific index
        accounts.add(2, new BankAccount(1234));
        
        printArrayList(accounts);
        
        accounts.set(0, new BankAccount(5678));
        printArrayList(accounts);
        
        //Remove an element
        accounts.remove(1);
        printArrayList(accounts);
        
        //Write an enhanced for loop that will print the BankAccount objects
        for (BankAccount acct : accounts){
            System.out.println(acct.getBalance());
        }
        BankAccount[] arrayBank = {new BankAccount(123), new BankAccount(456)};
        accounts.addAll(Arrays.asList(arrayBank));
        printArrayList(accounts);
    }
    
    public static void printArrayList(ArrayList<BankAccount> temp){
        for(int i = 0; i < temp.size(); i++){
            System.out.println(temp.get(i));
        }
    }
    
}
