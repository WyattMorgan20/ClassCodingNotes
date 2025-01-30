/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwrandomnumbers;
import java.util.*;
/**
 *
 * @author s540549
 */
public class MorganWRandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 0;
        
        while(count < 100){
            Random rand = new Random();
            int randomNumber = rand.nextInt(50) + 1;
            System.out.print(randomNumber + " ");
            count++;
        }
    }
    
}
