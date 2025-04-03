/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inclassregex;

import java.util.*;
import java.util.regex.*;

/**
 *
 * @author S540549
 */
public class MobileNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the input: ");
        String mobile = input.nextLine();
        
        String regex1 = "^\\d{10}$"; // setting up number for __________
        String regex2 = "^[(]\\d{3}[)]\\d{3}[-]\\d{4}$"; // setting up number for (___)___-____
        String regex3 = "^(\\d{3}[-]){2}\\d{4}$"; // the {2} is repeating d{3} twice for ___-___-____
        
        System.out.println("Test 1:");
        if(Pattern.matches(regex1, mobile)){
            System.out.println("It matches");
        }
        else{
            System.out.println("It does not match");
        }
        
        System.out.println("Test 2:");
        if(Pattern.matches(regex2, mobile)){
            System.out.println("It matches");
        }
        else{
            System.out.println("It does not match");
        }
        System.out.println("Test 3:");
        if(Pattern.matches(regex3, mobile)){
            System.out.println("It matches");
        }
        else{
            System.out.println("It does not match");
        }
        
    }
    
}
