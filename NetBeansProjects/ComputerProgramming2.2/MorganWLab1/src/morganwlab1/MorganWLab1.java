/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab1;
import java.util.*;

public class MorganWLab1 {

    public static void main(String[] args) {
        //Variables
        int side1;
        int side2;
        double hypotenuse;
        int sqr1;
        int sqr2;
        double rounded;
        
        //Input
        Scanner input = new Scanner(System.in);
        System.out.print("How long is side 1? ");
        side1 = input.nextInt();
        System.out.print("How long is side 2? ");
        side2 = input.nextInt();
        sqr1 = side1 * side1;
        sqr2 = side2 * side2;
        
        hypotenuse = Math.sqrt(sqr1 + sqr2);
        rounded = Math.round(hypotenuse);
        System.out.println("The length of the hypotenuse is " + rounded);
        
        System.out.println(" ");
        
        
        //pt 2
        double gpa;
        
        System.out.print("Please enter your grade percentage: ");
        gpa = input.nextDouble();
        
        if(gpa >= 90){
            System.out.println("Your letter grade is A");
        }
        else if(gpa >= 80 && gpa < 90){
            System.out.println("Your letter grade is B");
        }
        else if(gpa >= 70 && gpa < 80){
            System.out.println("Your letter grade is C");
        }
        else if(gpa >= 60 && gpa < 70){
            System.out.println("Your letter grade is D");
        }
        else if(gpa < 60){
            System.out.println("Your letter grade is F");
        }
        else{
            System.out.println("Invalid number");
        }
        
    }
    
}
