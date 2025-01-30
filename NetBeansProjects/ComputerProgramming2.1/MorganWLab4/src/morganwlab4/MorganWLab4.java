/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab4;
import java.util.*;
/**
 *
 * @author s540549
 */
public class MorganWLab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initialize variables
        Scanner kbd = new Scanner(System.in);
        String fName, lName, fullName;
        int birthYear, age;
        double gpa1, gpa2, gpa3, avgGPA;
        final int CURRENT_YEAR = 2018;
        
        //Collect info from user
        System.out.print("What is your first name? ");
        fName = kbd.next();
        System.out.print("What is your last name? ");
        lName = kbd.next();
        System.out.print("What year were you born? ");
        birthYear = kbd.nextInt();
        System.out.print("Enter first GPA: ");
        gpa1 = kbd.nextDouble();
        System.out.print("Enter second GPA: ");
        gpa2 = kbd.nextDouble();
        System.out.print("Enter third GPA: ");
        gpa3 = kbd.nextDouble();
        
        //Call methods
        fullName = fullName(fName, lName);
        age = ageCalc(birthYear, CURRENT_YEAR);
        avgGPA = gpaCalc(gpa1, gpa2, gpa3);
        printInfo(fullName, age, avgGPA);
    }  
    //A method called fullName that takes the user’s first name and last name as parameters
    //and returns a single String in the form “LastName, FirstName”
    public static String fullName(String fName, String lName ){
        String fullName = (lName + ", " + fName);
        return fullName;
    }
    //A method called ageCalc that takes the user’s birth year and the current year as parameters
    //then calculates and returns the user’s age as an integer.  
    public static int ageCalc(int birthYear, int CURRENT_YEAR){
        int age = CURRENT_YEAR - birthYear;
        return age;
    }
    //A method called gpaCalc that takes three GPA’s as parameters
    //then calculates and returns the average GPA as a double.
    public static double gpaCalc(double gpa1, double gpa2, double gpa3){
        double avgGPA = (gpa1 + gpa2 + gpa3)/3;
        double rounded = Math.round(avgGPA * 100) / 100.0;
        return rounded;
    }
    /*A method called printInfo that takes the user’s full name as a String, age as an integer
    and GPA as a double. This method will display the user’s info to the screen as 
    shown in the sample outputs. Note: the GPA should show two digits after the decimal only.*/
    public static void printInfo(String fullName, int age, double rounded){
        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Cummulative GPA: " + rounded);
    }
}
