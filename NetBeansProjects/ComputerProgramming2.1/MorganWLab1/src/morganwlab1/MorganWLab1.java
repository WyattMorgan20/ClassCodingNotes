/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab1;

/**
 *
 * @author s540549
 */
import java.util.*;
        
public class MorganWLab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("I can wirte Java now!");
        System.out.println();
        System.out.println("Isn't that wonderful?");
        System.out.println();
        int x = 5;
        System.out.print("The square of x is ");
        System.out.println(x * x);
        System.out.println();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Hello! What is your age? ");
        String age = input.next();
        System.out.println("Cool, " + age + " is a great age!");
        System.out.println("Bubbye!");
    }
    
}
