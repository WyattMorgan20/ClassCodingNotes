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
public class CreatingExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            BankAccount ac1 = new BankAccount(300.00);
            }
            BankAccount ac2 = new BankAccount(-100.00);
        
            System.out.println("AC1: " + ac1.getBalance());
            System.out.println("AC2: " + ac2.getBalance());
        }
        catch (NegativeStartingBalanceException ex){
            System.out.println(ex);
        }
    }
    
}
