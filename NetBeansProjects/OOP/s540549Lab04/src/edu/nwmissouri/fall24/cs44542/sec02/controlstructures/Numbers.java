/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.fall24.cs44542.sec02.controlstructures;
import java.util.*;
/**
 * Class: 44542-02 Object-Oriented Programming
 *
 * @author Wyatt Morgan 
 * Description: Lab 04 Control Structures 
 * Due: 10/02/2024
 */

/*
Numbers is a class where we scan a premade document's values (in this case numbers) and run them through a
variety of methods to determine if they are kaprekar, lucas, or polite numbers, then return bolean values based on that.
*/
public class Numbers{
    
    // Keprekar Number
    public boolean kaprekarNumber(int number){
        // negative numbers cannot be Kaprekar numbers
        if(number < 0 ){
            return false;
        }
        
        // initializing variables and converting them to string variables for getting the different halves
        int square = number * number;
        String squareString = String.valueOf(square);
        String numberString = String.valueOf(number);
        int length = numberString.length();
        
        // splitting the different halves of each number based on length
        String leftSide = (squareString.length() > length) ? squareString.substring(0, squareString.length() - length) : "0";
        String rightSide = squareString.substring(squareString.length() - length);
        
        // converting the halves into integers for calculations
        int leftNumber = leftSide.isEmpty() ? 0 : Integer.parseInt(leftSide);
        int rightNumber = Integer.parseInt(rightSide);
        
        return (leftNumber + rightNumber) == number;
    }
    
    // Lucas Number
    public boolean lucasNumber(int number){
        // negative numbers cannot be lucas numbers
        if(number < 0 ){
            return false;
        }
        
        // initializing the beggining numbers
        int num1 = 2;
        int num2 = 1;
        
        // checking to see if the number is either of the initial numbers
        if(number == num1 || number == num2){
            return true;
        }
        
        // comparing the initial values to number and converting them to iterate through each digit
        while(num2 < number){
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        
        return num2 == number;
    }
    
    public boolean politeNumber(int number){
        // negative numbers and 0 cannot be polite numbers
        if(number < 1 ){
            return false;
        }
        
        for(int i = 1; i < number; i++){
            int sum = 0;
            for(int j = i; sum < number; j++){
                sum += j;
                if(sum == number){
                    return true;
                }
            }
        }
        
        return false;
    }
    
}
