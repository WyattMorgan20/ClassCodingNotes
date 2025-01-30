/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.test.pkg2;
import java.util.*;
/**
 *
 * @author s540549
 */
public class ExerciseTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int integer, positives = 0, negatives = 0, total = 0, averageInt = 0;
        double average;
        System.out.println("Enter an integer, or 0 to quit: ");
        integer = input.nextInt();
        while(integer != 0){
            if(integer > 0){
                positives += 1;
                total += integer;
                averageInt += 1;
            }
            else if(integer<0){
                negatives += 1;
                total += integer;
                averageInt += 1;
            }
            else{
                System.out.println("Wrong Input");
            }
            System.out.println("Enter an integer, or 0 to quit: ");
            integer = input.nextInt();
        }
        if(integer == 0 && total == 0){
            System.out.println("No numbers are entered except 0");
        }
        average = total / averageInt;
        System.out.println("The number of positives is " + positives);
        System.out.println("The number of negatives is " + negatives);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);

        Random rand = new Random();
        int numbers = 100;
        for(int count = 0; count < numbers; count++)
        {
            int randNum = rand.nextInt(50);
            System.out.print(randNum + " ");
        }
    }
}

