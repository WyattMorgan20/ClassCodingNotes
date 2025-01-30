/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printfexample;

/**
 *
 * @author s540549
 */
public class PrintfExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("%5d\n", 10); //Default will right justify
        System.out.printf("%-5d\n", 10); //Negative will left justify
        
        //String
        System.out.printf("%10s\n", "Hello");
        
        //Zero-filled
        System.out.printf("%05d\n", 10);
        
        //Precision
        System.out.printf("%10.3f\n", 34.29485);
        System.out.printf("'%10.3f'\n", 34.29485); //Single quotes puts quotes in output
        
        
    }
    
}
