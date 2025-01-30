/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method2example;
import java.util.*;

/**
 *
 * @author s540549
 */
public class Method2Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Setup random generator
        Random rand = new Random();
        
        //Generate 2 random numbers
        int start = rand.nextInt(20);
        int stop = rand.nextInt(20) + 50;
        
        //Calling a value Returning method
        int sum = sumNumber(start, stop); //One way is to store the returned value in a variable
        System.out.println("The sum from " + start + " to " + stop + " is: " + sum);
        
        //Calling a non-value returning method
        sumNumber(5.5, 10.5); //Nothing to return, so not set to an object
        System.out.println("The End");
    }
    
     //Value returning Method
    //Method to sum the numbers between start and stop
    public static int sumNumber(int start, int stop){
        int sum = 0;
        for(int i = start; i < stop; i++){
            sum += i;
        }
        return sum;
    }
    
     //Non-Value returning Method
    //Method to sum the numbers between start and stop
    public static void sumNumber(double start, double stop){ //Adding another perameter or changing the object type
                                                            //will allow you to have the same name
        double sum = 0;
        for(double i = start; i < stop; i++){
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }
    
}
