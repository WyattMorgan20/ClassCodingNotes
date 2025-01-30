/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericconditionsselection;
import java.util.Scanner;
/**
 *
 * @author s540549
 */
public class NumericConditionsSelection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //Increment and Decrement Operator
        int num = 3;
        num++; //num = num + 1
        num--; //num = num - 1
        
        //Numeric Data
        System.out.println(8 * 2 / 3); //integer division returns an integer
        System.out.println(8 * 2 / 3.0); //float division returns float
        System.out.println(8 % 3); //returns integer
        System.out.println(8 % 3.0); //returns a real number
        
        //Relational and Logical Operators
        int age = 10;
        int number = 40;
        boolean canVote = age >= 18 && number< 50;
        System.out.println(canVote);
        boolean orOperator = age >= 18 || number < 50;
        System.out.println(!orOperator);
        
        //Rounding a number
        System.out.println(Math.round(45.678));
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for the day (1-7)");
        int day = input.nextInt();
        
        //Selection structure
        if (day == 1){
            System.out.println("Sunday");
        }
        else if(day == 2){
            System.out.println("Monday");
        }
        else if(day == 3){
            System.out.println("Tuesday");
        }
        else if(day == 4){
            System.out.println("Wednesday");
        }
        else if(day == 5){
            System.out.println("Thursday");
        }
        else if(day == 6){
            System.out.println("Friday");
        }
        else if(day == 7){
            System.out.println("Saturday");
        }
        else{
            System.out.println("Wrong Input");
        }
        
        //Switch statement - can only match char, byte, short, int, or string
        switch(day){
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("Wrong Input");
        }
        
    }
    
}
