/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.fall24.cs44542.sec02.controlstructures;

import java.util.*;

/**
 * Class: 44542-02 Object-Oriented Programming
 *
 * @author Wyatt Morgan 
 * Description: Lab 04 Control Structures 
 * Due: 10/02/2024
 */

/*
Roulette is a class where we promt the user to play the game or not, then ask them for
how much they want to bet, and what value range they are betting on, then generate a random value
to simulate a roulette table, output that value and determine if it was within the user's range or not.
If not, they lose money, if so they win money, and we repeat this process until they say 'no' when prompted to play again.
*/
public class Roulette {

    public void Roulette() {
        // Initiallizing scanner and variables
        Scanner input = new Scanner(System.in);
        int playerRange = 0;
        int computerScore = 0;
        int moneyEntered = 0;
        int accountBalance = 1000;
        int total = 0;
        
        // Start of game and asking for initial input from user
        System.out.println("***********************************");
        System.out.println("********** Roulette Game **********");
        System.out.println("***********************************");
        System.out.print("Do you want to roll the ball? (yes/no): ");
        String ball = input.next();
        
        // Loop to go through the game unil the user says "no" when prompted to roll
        while(!"no".equals(ball)){
            // Getting bet amount and setting the balance to lost the money bet
            System.out.print("Enter the amount you want to bet: ");
            moneyEntered = input.nextInt();
            accountBalance -= moneyEntered;
            total += moneyEntered;
            
            // Getting the range from the user and setting playerRange to it
            System.out.print("Choose a number range: 0-12 (1), 13-24 (2), or 25-36 (3): ");
            playerRange = input.nextInt();
            
            System.out.println("***********************************");
            
            // Generating a random number for the roll between 0 and 36 and outputting it
            int randInt = (int)(Math.random() * 37);
            System.out.println("The ball landed on: " + randInt);
            
            // Checking playerRange and using that to see if they won or lost based on the number rolled
            if(playerRange == 1){
                if(0 <= randInt && randInt <= 12){
                    System.out.println("Congratulations! You won this round.");
                    accountBalance += moneyEntered * 2;
                }
                else if(13 <= randInt && randInt <= 24){
                    System.out.println("Sorry, you lost this round.");
                    computerScore += moneyEntered;
                }
                else if(25 <= randInt && randInt <= 36){
                    System.out.println("Sorry, you lost this round.");
                    computerScore += moneyEntered;
                }
            }
            else if(playerRange == 2){
                if(0 <= randInt && randInt <= 12){
                    System.out.println("Sorry, you lost this round.");
                    computerScore += moneyEntered;
                }
                else if(13 <= randInt && randInt <= 24){
                    System.out.println("Congratulations! You won this round.");
                    accountBalance += moneyEntered * 2;
                }
                else if(25 <= randInt && randInt <= 36){
                    System.out.println("Sorry, you lost this round.");
                    computerScore += moneyEntered;
                }
            }
            else if(playerRange == 3){
                if(0 <= randInt && randInt <= 12){
                    System.out.println("Sorry, you lost this round.");
                    computerScore += moneyEntered;
                }
                else if(13 <= randInt && randInt <= 24){
                    System.out.println("Sorry, you lost this round.");
                    computerScore += moneyEntered;
                }
                else if(25 <= randInt && randInt <= 36){
                    System.out.println("Congratulations! You won this round.");
                    accountBalance += moneyEntered * 2;
                }
            }
            
            // Prompting user to see if they want to play again and breaking the loop if they say no
            System.out.print("Do you want to play another round? (yes/no): ");
            String answer = input.next();
            if("no".equals(answer)){
                break;
            }
            
            // Re-prompting the user to answer the initial question to end/reset the loop
            System.out.print("Do you want to roll the ball? (yes/no): ");
            ball = input.next();
        }
        
        // Printing final output values of the game in the "game over screen"
        System.out.println(" ");
        System.out.println("************ Game Over ************");
        System.out.println("Total money entered into the slot maching: $" + total);
        System.out.println("Final account balance: $" + accountBalance);
        System.out.println("Total amount lost: $" + computerScore);
    }

}
