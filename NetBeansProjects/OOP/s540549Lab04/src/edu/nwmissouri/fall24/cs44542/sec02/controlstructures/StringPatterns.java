/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.fall24.cs44542.sec02.controlstructures;

/**
 * Class: 44542-02 Object-Oriented Programming
 *
 * @author Wyatt Morgan 
 * Description: Lab 04 Control Structures 
 * Due: 10/02/2024
 */

/*
StringPatterns class is the class that takes an input from the main method in LoopDriver
and outputs it in an hourglass shaped patter subtracting the first and last value of the line each time
until there is either 1 or 2 values left, then it does the opposite and adds the first and last value.
*/
public class StringPatterns {

    public void printPattern(String inputString) {
        String formatted = inputString.replace(" ", "");
        int length = formatted.length();
        
        // even inputStrings:
        if (length % 2 == 0) {
            for (int i = 0; i <= length / 2; i++) {
                // Formatting spaces to make the hourglass shape:
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                // Printing substring and chopping off the last value:
                System.out.println(formatted.substring(i, length - i));
            }

            for (int i = length / 2 - 2; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                // Printing substring and chopping off the last value:
                System.out.println(formatted.substring(i, length - i));
            }
        }
        
        // odd inputStrings:
        else if (length % 2 != 0) {
            for (int i = 0; i <= length / 2; i++) {
                // Formatting spaces to make the hourglass shape:
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                // Printing substring and chopping off the last value:
                System.out.println(formatted.substring(i, length - i));
            }

            for (int i = length / 2 - 2; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                // Printing substring and chopping off the last value:
                System.out.println(formatted.substring(i, length - i));
            }
        }

    }
}
