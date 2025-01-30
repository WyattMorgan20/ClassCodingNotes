/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectorientedintro;
import java.util.*;
/**
 *
 * @author s540549u
 */
public class TestScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        String firstName = input.next();
        System.out.print("Enter your last name: ");
        String lastName = input.next();
        
        System.out.println(lastName + ", " + firstName);
        
        System.out.print("Enter full name: ");
        //input.useDelimiter(",|\n");
        String lastName2 = input.next();
        String firstName2 = input.next();
        //System.out.println(firstName2 + " " + lastName2);
        
        
        System.out.print("Enter your age: ");
        input.nextLine();
        
        int age = 0;
        if(input.hasNextInt()){
            age = input.nextInt();
        }
        else{
            System.out.println("Entered invalid age value");
        }
        
        System.out.println("Name: " + firstName2 + " " + lastName2 + " \nAge: " + age);
        
        input.close();
    }
}