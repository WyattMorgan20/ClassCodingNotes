/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionstructures;
import java.util.Scanner;
/**
 *
 * @author s540549
 */
public class SelectionStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What year of school are you? ");
        int year = input.nextInt();
        
        if(year == 1){
            System.out.println("Freshman");
        }
        else if(year == 2){
            System.out.println("Sophomore");
        }
        else if(year == 3){
            System.out.println("Junior");
        }
        else if(year == 4){
            System.out.println("Senior");
        }
        else{
            System.out.println("Grad School?");
        }
        
        switch(year){
            case 1: System.out.println("Freshman"); break;
            case 2: System.out.println("Sophomore"); break;
            case 3: System.out.println("Junior"); break;
            case 4: System.out.println("Senior"); break;
            default: System.out.println("Grad School?");
        }
        
        System.out.print("How many hours have you earned? ");
        int numHours = input.nextInt();
        System.out.print("What is your GPA? ");
        float gpa = input.nextFloat();
        
        if(numHours < 60){
            System.out.println("cannot apply – insufficient hours");
        }
        else if(numHours >= 60){
            if(gpa < 3.5){
                System.out.println("cannot apply – grade point of 3.5 required");
            }
            else if(gpa >= 3.5){
                System.out.println("may apply");
            }
        }
        else if(numHours >= 90){
            if(gpa < 3.0){
                System.out.println("cannot apply – grade point of 3.0 required");
            }
            else if(gpa >= 3.0){
                System.out.println("may apply");
            }
        }
        
        
        
        
    }
    
}
