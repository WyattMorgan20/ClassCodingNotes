/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentaldatatypes;
import java.util.Scanner;

/**
 *
 * @author s540549
 */
public class FundamentalDatatypes {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int myVar = 3;
        double myDouble = 4.73;
        int myInt;
        int num1;
        double num2;
        
        num1 = 14;
        
        num2 = Math.sqrt(num1);
        System.out.println(num2);
        final double MY_CONSTANT = 5.17;
        
        String dogName1 = "Carmen";
        System.out.println(dogName1.toUpperCase());
        System.out.println(dogName1.toLowerCase());
        int length = dogName1.length();
        System.out.println(length);
        String dogName2 = "Midge";
        System.out.println(dogName1 + " " + dogName2);
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String studentName = input.next();
        System.out.print("How old are you? ");
        int studentAge = input.nextInt();
        System.out.println("Your name is " + studentName + " and you are " + studentAge + " years old!");
    }
    
}
