/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab2;
import java.util.Scanner;
/**
 *
 * @author s540549
 */
public class MorganWLab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Part 1
        Scanner input = new Scanner(System.in);
        System.out.println("How long is side 1?");
        double side1 = input.nextInt();
        System.out.println("How long is side 2?");
        double side2 = input.nextInt();
        // calculating hypotnuse c=(a2+b2)^1/2
        double hypotenuse = Math.sqrt((side1*side1) + (side2 * side2));
        double hypRound = Math.round(hypotenuse * 100.0) / 100.0;
        System.out.println("The length of the hypotenuse is " + hypRound);
        System.out.println(" ");
        //Break
        //Part 2
        System.out.println("Please enter your grade Percentage: ");
        int grade = input.nextInt();
        if (grade >= 90 && grade <=100){
            System.out.println("Your letter grade is A");
        }
        else if(grade >= 80 && grade < 90){
            System.out.println("Your letter grade is B");
        }
        else if(grade >= 70 && grade <=79){
            System.out.println("Your letter grade is C");
        }
        else if(grade >= 60 && grade <=69){
            System.out.println("Your letter grade is D");
        }
        else if(grade < 60){
            System.out.println("Your letter grade is F");
        }
        else{
            System.out.println("Wrong Input");
        }
    }
    
}
