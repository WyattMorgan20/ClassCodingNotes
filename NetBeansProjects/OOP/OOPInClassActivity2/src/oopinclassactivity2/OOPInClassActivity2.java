/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oopinclassactivity2;
import java.util.*;
/**
 *
 * @author s540549
 */
public class OOPInClassActivity2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaring variables
        int min = 0;
        int max = 0;
        int sum = 0;
        int count = 0;
        int over = 0;
        
        // Asking question
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number or 0 to quit: ");
        int num = input.nextInt();
        
        // Initiating values based on input
        min = num;
        max = num;
        count += 1;
        
        // Looping through input and values
        while(num != 0){
            // Min
            if(num < min){
                min = num;
            }
            // Max
            if(num > max){
                max = num;
            }
            // Sum
            sum += num;
            // Count
            count += 1;
            // Over 50
            if(num > 50){
                over += num;
            }
            
            // Reask question
            System.out.print("Input a number or 0 to quit: ");
            num = input.nextInt();
        }
        
        // Outputs
        System.out.println("---------------");
        System.out.println("The smallest number is: " + min);
        System.out.println("The largest number is: " + max);
        System.out.println("The sum of all values is: " + sum);
        System.out.println("The number of inputs is: " + count);
        System.out.println("The sum of values over 50 is: " + over);  
    }
}
