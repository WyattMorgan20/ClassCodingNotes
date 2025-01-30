/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingexceptionexample;

/**
 *
 * @author s540549
 */
public class NegativeStartingBalanceException extends Exception {
    
    public NegativeStartingBalanceException(){
        super("Error: Negative Starting Balance");
    }
    
    public NegativeStartingBalanceException(double balance){
        super("Error: Negative Starting Balance " + balance);
    }
}
