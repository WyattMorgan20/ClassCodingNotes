/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.nwmissouri.fall24.cs44542.sec02.controlstructures;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
/**
 * Class: 44542-02 Object-Oriented Programming
 *
 * @author Wyatt Morgan 
 * Description: Lab 04 Control Structures 
 * Due: 10/02/2024
 */

/*
LoopDriver class is the main method class we are using to execute
the StringPatterns, Numbers, and Roulette classes and output/interact with them.
*/
public class LoopDriver {

    public static void main(String[] args) throws FileNotFoundException {
        // Question 1
        System.out.println("Q1:");
        // declaring input Strings, one even and one odd:
        String inputString1 = "Northwest Missouri State University";
        String inputString2 = "We Are Bearcats";
        
        // creating StringPatterns objects:
        StringPatterns pattern1 = new StringPatterns();
        StringPatterns pattern2 = new StringPatterns();
        
        // outputting the inputStrings based on the formatting in StringPatterns:
        pattern1.printPattern(inputString1);
        System.out.println("---------------------");
        pattern1.printPattern(inputString2);
        
        System.out.println(" ");
        System.out.println("---------------------");
        System.out.println(" ");
        
        //______________________________________________________________________
        // Question 2
        System.out.println("Q2:");
        Scanner file = new Scanner(new File("inputFileLab04.txt"));
        
        // declaring Number objects
        Numbers num1 = new Numbers();
        
        // creating printWriters
        PrintWriter kpw = new PrintWriter("kaprekar.txt");
        PrintWriter lpw = new PrintWriter("lucas.txt");
        PrintWriter ppw = new PrintWriter("polite.txt");
        
        // iterating over all number in the file
        while(file.hasNextInt()){
            int numberInput = file.nextInt();
            
            // checking if numbers are one of each method type and printing them to their designated file
            if(num1.kaprekarNumber(numberInput)){
                kpw.println(numberInput);
            }
            if(num1.lucasNumber(numberInput)){
                lpw.println(numberInput);
            }
            if(num1.politeNumber(numberInput)){
                ppw.println(numberInput);
            }
        }
        
        // Prompting user for S number without the S
        Scanner input = new Scanner(System.in);
        
        System.out.println("***************************");
        System.out.print("Enter your SID without 'S': ");
        
        // taking input and checking if it is any of the number types
        int sID = input.nextInt();
        boolean isK = num1.kaprekarNumber(sID);
        System.out.println("Kaprekar number: " + isK);
        
        boolean isL = num1.lucasNumber(sID);
        System.out.println("Lucas number: " + isL);
        
        boolean isP = num1.politeNumber(sID);
        System.out.println("Polite number: " + isP);
        
        
        System.out.println("***************************");
        
        // closing file scanner and printWriters
        file.close();
        kpw.close();
        lpw.close();
        ppw.close();
        
        System.out.println(" ");
        System.out.println("---------------------");
        System.out.println(" ");
        
        //______________________________________________________________________
        // Question 3
        Roulette roulettePlay = new Roulette();
        roulettePlay.Roulette();
    }

}
