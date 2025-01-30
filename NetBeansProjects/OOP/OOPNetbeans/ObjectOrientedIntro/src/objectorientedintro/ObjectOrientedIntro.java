/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectorientedintro;

import java.util.*;

/**
 *
 * @author S540549
 */
public class ObjectOrientedIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Wyatt Morgan");
        
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input 1:");
        String answer = input.next();
        System.out.println("Your answer was " + answer + " very nice great success");
        
        System.out.println("Input 2:");
        int answer2 = input.nextInt();
        
        if(answer2 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        input.close();
    }
    
}
