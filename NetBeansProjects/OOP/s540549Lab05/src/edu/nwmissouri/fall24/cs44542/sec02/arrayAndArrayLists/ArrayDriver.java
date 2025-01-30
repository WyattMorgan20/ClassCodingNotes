/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.nwmissouri.fall24.cs44542.sec02.arrayAndArrayLists;
import java.util.*;
/**
 * Class: 44542-02 Object-Oriented Programming
 *
 * @author Wyatt Morgan 
 * Description: Lab 05 Arrays Array List Scanner 
 * Due: 10/10/2024
 */

/*
The ArrayDriver class is a main method class we are simulating a grade book,
taking in grade values and ading them to user built arrays, then finding the min and 
max values within them to output with formatting.
*/
public class ArrayDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initializing rows and cols variables
        int rows;
        int cols;
        
        // taking input for the number of rows and columns
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students (rows): ");
        rows = input.nextInt();
        
        System.out.print("Enter the number of subjects (columns): ");
        cols = input.nextInt();
        
        // making a 2D array based on the number of rows and columns
        int[][] gradesArray = new int[rows][cols];
        
        // iterating through each value of the array and inputing grades according to user inputed values
        for(int i = 0; i < rows; i++){
            System.out.print("Enter grades for the students " + (i + 1) + ": ");
            for(int j = 0; j < cols; j++){
                System.out.print("\nGrade for Subject " + (j + 1) + ": ");
                gradesArray[i][j] = input.nextInt();
            }
        }
        
        // making num, max, and min arrays for finding and altering values and indexes to help add grade values easier
        // numArray takes the 2d array gradesArray and converts it to a 1d array so we can add the values to max and min
        int[] numArray = new int[rows * cols];
        int[] maxArray = new int[3];
        int[] minArray = new int[3];
        int numArrIndex = 0;
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                numArray[numArrIndex++] = gradesArray[i][j];
            }
        }
        
        // sorting the array from lowest to highest to make finding max and min easier
        Arrays.sort(numArray);
        
        // iterating through the array backwards to get the max values
        int maxCount = 0;
        for(int j = numArray.length -1; maxCount < 3 ; j--){
            maxArray[maxCount] = numArray[j];
            maxCount++;
        }
        
        // iterating through the array forwards to get the min values
        for(int j = 0; j < 3 ; j++){
            minArray[j] = numArray[j];
        }
        
        // Grade sheet output using format printing and loops
        System.out.println("*********************************");
        System.out.println("********** Grade Sheet **********");
        System.out.println("*********************************");
        
        System.out.printf("%10s", "");
        for(int i = 1; i <= cols; i++){
            System.out.printf("%10s", "Marks" + i);
        }
        System.out.println("");
        
        for(int i = 0; i < rows; i++){
            System.out.printf("%10s", "Student " + (i + 1));
            for(int j = 0; j < cols; j++){
                System.out.printf("%10d", gradesArray[i][j]);
            }
            System.out.println("");
        }
        System.out.println("*********************************");
        
        // iterating through maxArray and printing each value to show the max values
        System.out.print("Three highest grades:");
        for(int i = 0; i < 3 ; i++){
            System.out.print(" " + maxArray[i] + " ");
        }
        
        // iterating through minArray and printing each value to show the min values
        System.out.print("\nThree lowest grades:");
        for(int i = 0; i < 3 ; i++){
            System.out.print(" " + minArray[i] + " ");
        }
        System.out.println("\n*********************************");        
        
    }
    
}
