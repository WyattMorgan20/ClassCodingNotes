/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method1example;
import java.util.*;

/**
 *
 * @author s540549
 */
public class Method1Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //============ local constants ============
      int number;
      int min;
      int max;
      
      //Instantiate a Scanner object 
      Scanner keyboardInput = new Scanner( System.in );
            
      //============= logic for main ============
     
      //Priming read
      System.out.print( "Enter a number or 0 to quit: " );
      number = keyboardInput.nextInt();
      
      //remember first number as min
      min = number;
      
      //remember first number as max
      max = number;
      
      //Sentinel loop with condition of 0 to exit
      while ( number != 0 ){
           
           min = findMin(number, min); //calling method findMin
           max = findMax(number, max); //calling method findMax
           
           //Gather more input
           System.out.print( "Enter a number or 0 to quit: " );
           number = keyboardInput.nextInt();
      }
      
      //print the min number
      System.out.println( "The smallest number is: " + min );
      
      //print the max number
      System.out.println( "The largest number is: " + max );
    }
    
    public static int findMin(int num1, int num2){
        //test for lower number
        if (num1 < num2 ){
            return num1;
        }
        else{
            return num2;
        }
    }
    
    public static int findMax(int num1, int num2){
        //test for higher number
        if (num1 > num2 ){
            return num1;
        }
        else{
            return num2;
        }
    }
    
    
}
