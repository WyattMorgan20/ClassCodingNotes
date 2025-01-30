
package inputconditionsexample;

import java.util.Scanner;
        
public class InputConditionsExample {

    public static void main(String[] args) {
        //Declare Variables
        String name;
        int age;
        double gpa;
        
        //Gather Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter your gpa: ");
        gpa = input.nextDouble();
        
        //Output
        System.out.println(name);
        System.out.println(age);
        System.out.println(gpa);
        //Or
        System.out.println(name + " " + age + " " + gpa);
        
        //Increment and Decrement Operators
        age++; //add 1 to age and store it in age
        age--; //subtracts 1 from age and stores it in age
        
        //Numeric Data
        System.out.println(8 * 2 / 3); //Integer division returns an integer
        System.out.println(8 * 2 / 3.0); //Float division returns a float
        System.out.println(8 % 3); //Integer division returns as an integer
        System.out.println(8.0 % 3);
        
        //Type Casting
        System.out.println((int)(20 / 3.5)); //forcing the whole equation to be an int
        
        //Relational and Logical Operators
        boolean canVote = age >= 18 && gpa > 1.5;
        System.out.println(canVote);
        boolean canVote2 = age >= 18 || gpa > 1.5;
        System.out.println(canVote2);
        System.out.println(!canVote2);
        
        //Math class
        System.out.println(20 / 2.2);
        System.out.println(Math.round(20 / 2.2));
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.sqrt(25));
    }
    
}
