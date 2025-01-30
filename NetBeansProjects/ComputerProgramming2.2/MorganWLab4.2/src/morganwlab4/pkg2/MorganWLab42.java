/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab4.pkg2;;
import java.util.*;

/**
 *
 * @author s540549
 */
public class MorganWLab42 {

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
    
    public static String fullName(String fName, String lName){
        String name = lName + ", " + fName;
        return name;
    }
    
    public static int ageCalc(int birthYear, int CURRENT_YEAR){
        int age = CURRENT_YEAR - birthYear;
        return age;
    }
    
    public static double gpaCalc(double gpa1, double gpa2, double gpa3){
        double averageGpa = (gpa1 + gpa2 + gpa3)/3;
        double rounded = Math.round(averageGpa * 100) / 100.0;
        return rounded;
    }
    
    public static void printInfo(String fullName, int age, double avgGPA){
        System.out.println(" ");
        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Cumulative GPA: " + avgGPA);
    }
    
}
