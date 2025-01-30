/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionexample;
import java.util.Scanner;

public class SelectionExample {

    public static void main(String[] args) {
        //Gather input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for a day(1-7):");
        int day = input.nextInt();
        
//        //Selection Structure
//        if(day == 1){
//            System.out.println("Sunday");
//        }
//        else if(day == 2){
//            System.out.println("Monday");
//        }
//        else if(day == 3){
//            System.out.println("Tuesday");
//        }
//        else if(day == 4){
//            System.out.println("Wednesday");
//        }
//        else if(day == 5){
//            System.out.println("Thursday");
//        }
//        else if(day == 6){
//            System.out.println("Friday");
//        }
//        else if(day == 7){
//            System.out.println("Saturday");
//        }
//        else{
//            System.out.println("Incorrect Number");
//        }
        
        
        switch(day){ //switches only work with strings, ints, and chars
            case 1: System.out.println("Sunday"); 
                    System.out.println("First Day");
                    System.out.println("Programming");break; //break is to stop switch from reading further
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("Incorrect Number");//else
        }
        
        System.out.print("Enter Your Name: ");
        String name = input.next(); //next line finds the next input (the enter to submit) so must be next for int-string
        switch(name){
            case "Wyatt": System.out.println("Thank you Wyatt"); break;
            case "Cayde": System.out.println("Thank you Cayde"); break;
            case "Edward": System.out.println("Thank you Edward"); break;
            default: System.out.println("Your name is " + name);
        }
    }
    
}
