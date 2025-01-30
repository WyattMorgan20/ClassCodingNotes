/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab3.pkg2;
import java.util.*;
/**
 *
 * @author s540549
 */
public class MorganWLab32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String p1Name;
        String p2Name;
        
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Welcome to Dice Match!");
        System.out.print("What is Player 1's first name? ");
        p1Name = input.nextLine();
        System.out.print("What is Player 2's first name? ");
        p2Name = input.nextLine();
        
        int again;
        
        do{
            int randomNumber1 = rand.nextInt(6) + 1;
            int randomNumber2 = rand.nextInt(6) + 1;
            int randomNumber3 = rand.nextInt(6) + 1;
            int randomNumber4 = rand.nextInt(6) + 1;
            System.out.println(" ");
            System.out.println("Here we go!");
            System.out.println(" ");
            
            System.out.println(p1Name + " " + randomNumber1 + " " + randomNumber2);
            int p1Total = (randomNumber1 + randomNumber2);
            
            System.out.println(p2Name + " " + randomNumber3 + " " + randomNumber4);
            int p2Total = (randomNumber3 + randomNumber4);
            
            System.out.println("And the winner is...");
            
            if(p1Total > p2Total){
                System.out.println(p1Name + " with a total of " + p1Total);
            }
            else if(p1Total < p2Total){
                System.out.println(p2Name + " with a total of " + p2Total);
            }
            else{
                System.out.println("Its a tie! You both have " + p1Total);
            }
            
            System.out.print("Enter 1 to play again, or 0 to quit: ");
            again = input.nextInt();
            
            
        }while(again != 0);
        System.out.println(" ");
        System.out.println("Thanks for playing, goodbye!");
        
        
    }
    
}
