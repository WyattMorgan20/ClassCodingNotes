/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhileexample;
import java.util.*;
/**
 *
 * @author s540549
 */
public class DoWhileExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int guess;
        int randomNum;
        
        //Gather input
        System.out.println("Enter your guess or 0 to quit");
        guess = input.nextInt();
        randomNum = rand.nextInt(10);
        
        //While loop
        while(guess != 0)
        {
            if(guess == randomNum)
            {
                System.out.println("you win");
                break;
            }
            else if (guess > randomNum) {
                System.out.println("too high");
            } else {
                System.out.println("too low");
            }
            System.out.println("Enter your guess or 0 to quit");
            guess = input.nextInt();
        }
        
        do{
            System.out.println("enter your guess or 0 to quit");
            guess = input.nextInt();
            
            if(guess == randomNum)
            {
                System.out.println("you win");
                break;
            }
            else if (guess > randomNum) {
                System.out.println("too high");
            } else {
                System.out.println("too low");
            }
        } while (guess != 0);
        
        
    }
    
}
