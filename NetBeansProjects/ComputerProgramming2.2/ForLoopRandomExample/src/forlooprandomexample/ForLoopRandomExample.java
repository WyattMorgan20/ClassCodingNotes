/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forlooprandomexample;
//import java.util.Scanner;
//import java.util.Random;
import java.util.*;

public class ForLoopRandomExample {

    public static void main(String[] args) {
        //Declare Variables
        int lessThan = 0;
        int between = 0;
        int greaterThan = 0;
        
        //Create Scanner and gather input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of random numbers you would like to generate: ");
        int numbers = input.nextInt();
        
        //Random object to use to generate random numbers
        Random rand = new Random();
        
        for(int x = 0; x < numbers; x++){
            
            //Generate a random number
            int randomNumber = rand.nextInt(100) + 1;
            System.out.print(randomNumber + " ");
            
            //find valus in range to assign to variables
            if (randomNumber < 20){
                lessThan++;
            }
            else if (randomNumber >= 20 && randomNumber <= 70){
                between++;
            }
            else
                greaterThan++;
        }
        System.out.println("Less Than: " + lessThan);
        System.out.println("Between: " + between);
        System.out.println("Greater Than: " + greaterThan);
    }
    
}
