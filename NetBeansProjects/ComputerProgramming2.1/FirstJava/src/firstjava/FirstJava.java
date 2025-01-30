/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjava;
import java.util.Scanner;
/**
 *
 * @author s540549
 */
public class FirstJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("Nice to meet you, " + name + "!");
        
        System.out.println("How old is your dog");
        int dogAge = input.nextInt();
        int dogAgeInHumanYears = dogAge * 7;
        System.out.println("Your dog is " + dogAgeInHumanYears + " years old in human years.");
    }
    
}
