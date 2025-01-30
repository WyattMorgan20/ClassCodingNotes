/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloops;
import java.util.*;

/**
 *
 * @author s540549
 */
public class WhileLoops {

    public static void main(String[] args) {
        //Declare Variables
        int guess;
        int randomNum;
        
        //Scanner and Random Objects
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        //Generate  a random number
        randomNum = rand.nextInt(10) + 1;
        
        //Gather Input
        System.out.print("Enter your guess from 1-10 or 0 to quit: ");
        guess = input.nextInt();
        
        while(guess != 0){
            if(guess == randomNum){
                System.out.println("You Win!");
                break;
            }
            else if(guess > 10 || guess < 1){
                System.out.println("Number out of range");
            }
            else if(guess > randomNum){
                System.out.println("Too High");
            }
            else{
                System.out.println("Too Low");
            }
            
            //Gather More Input (Ask Again)
            System.out.print("Enter your guess from 1-10 or 0 to quit: ");
            guess = input.nextInt();
        }
        System.out.println("Game 1 Over");
        
        //Do While Loop
        int randomNumber = rand.nextInt(10) + 1;
        do{
            //Ask for their guess
            System.out.print("Enter your guess from 1-10 or 0 to quit: ");
            guess = input.nextInt();
            
            if(guess == randomNumber){
                System.out.println("You Win!");
                break;
            }
            else if(guess > 10 || guess < 1 && guess != 0){
                System.out.println("Number out of range");
            }
            else if(guess > randomNumber){
                System.out.println("Too High");
            }
            else if(guess < randomNumber && guess != 0){
                System.out.println("Too Low");
            }
            else{
                System.out.println("Invalid Input");
            }
            
            
        }while(guess != 0);
    }
    
}
