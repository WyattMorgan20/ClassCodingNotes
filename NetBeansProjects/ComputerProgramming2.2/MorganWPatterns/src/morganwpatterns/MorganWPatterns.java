/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwpatterns;
import java.util.*;
/**
 *
 * @author s540549
 */
public class MorganWPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int positive = 0;
        int negative = 0;
        int total = 0;
        int amt = 0;
        double average;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, or 0 to quit: ");
        num1 = input.nextInt();
        if(num1 != 0){
            while(num1 != 0){
                if(num1 > 0){
                    positive++;
                }
                else if(num1 < 0){
                    negative++;
                }
                amt++;
                total += num1;
                System.out.print("Enter an integer, or 0 to quit: ");
                num1 = input.nextInt();
            }
            average = total/amt;
            
            System.out.println("The number of positives is " + positive);
            System.out.println("The number of negatives is " + negative);
            System.out.println("The total is " + total);
            System.out.println("the average is " + average);
        }
        else{
            System.out.println("No numbers area entered except 0");
        }
    }
    
}
