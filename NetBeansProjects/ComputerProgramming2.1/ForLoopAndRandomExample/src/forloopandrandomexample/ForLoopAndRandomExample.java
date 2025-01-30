/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloopandrandomexample;
import java.util.*;
/**
 *
 * @author s540549
 */
public class ForLoopAndRandomExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare Variables
        int lessThan = 0;
        int between = 0;
        int greaterThan = 0;
        
        //Create Scanner and Random Objects
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        //Ask the user to enter number of random numbers to generate
        System.out.println("How many numbers would you like to generate");
        int numbers = input.nextInt();
        
        for(int count = 0; count < numbers; count++)
        {
            //Generate random integer
            int randNum = rand.nextInt(100);
            System.out.println(randNum);
            
            //Determine the range
            if (randNum < 20)
                lessThan++;
            else if (randNum >= 20 && randNum <70)
                between++;
            else
                greaterThan++;
        }
        //Output
        System.out.println("Less Than: " + lessThan);
        System.out.println("Between" + between);
        System.out.println("Greater Than: " + greaterThan);
    }
    
}
