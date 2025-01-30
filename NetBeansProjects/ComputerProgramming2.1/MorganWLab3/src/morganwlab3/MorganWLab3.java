/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab3;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author s540549
 */
public class MorganWLab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int p1d1, p1d2, p2d1, p2d2, choice=1;
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        
        //Intro
        System.out.println("Welcome to Dice Match!");
        System.out.println("What is Player 1's First Name?");
        String player1 = input.next();
        System.out.println("What is Player 2's First Name?");
        String player2 = input.next();
        
        do
        {
            System.out.println("\nHere we go!\n");
            p1d1 = r.nextInt(6)+1;
            p1d2 = r.nextInt(6)+1;
            System.out.println("\n" + player1 + " " + p1d1 + " " + p1d2);
            int totalP1 = p1d1 + p1d2;
            p2d1 = r.nextInt(6)+1;
            p2d2 = r.nextInt(6)+1;
            System.out.println("\n" + player2 + " " + p2d1 + " " + p2d2);
            int totalP2 = p2d1 + p2d2;
            System.out.println("And the Winner is...");
            if(totalP1>totalP2)
            {
                System.out.println(player1 + " with a total of " + totalP1);
            }
            else if(totalP1<totalP2)
            {
                System.out.println(player2 + " with a total of " + totalP2);
            }
            else
            {
                System.out.println("It's a tie!");
            }
            System.out.println("Enter 1 to play again, or 0 to quit: ");
            choice = input.nextInt();
        }
        
        while(choice !=0);
                
        System.out.println("\nThank you for playing! Goodbye!");
    }
    
}
