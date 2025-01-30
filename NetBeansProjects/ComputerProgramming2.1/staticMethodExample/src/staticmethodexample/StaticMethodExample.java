/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticmethodexample;
import java.util.Scanner;
/**
 *
 * @author s540549
 */
public class StaticMethodExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double min, max, number;
        
        System.out.println("Enter a number or 0 to quit");
        number = input.nextDouble();
        min = number;
        max = number;
        
        while(number != 0){
            min = findMin(number, min);
            max = findMax(number, max);
            
            System.out.println("Enter a number or 0 to quit");
            number = input.nextDouble();
        }
        System.out.println("The min number is: " + min);
        System.out.println("The max number is: " + max);
        
        //Call sum method to print
        sumNumbersPrint(10, 20);
        
        System.out.println(findMin(1, 2, 3));
        System.out.println(findMin(3, 2, 1));
        System.out.println(findMin(2, 1, 3));
        System.out.println(findMin(3, 1, 2));
        
        String x = returnStatement();
        System.out.println(x);
        
    }
    public static double findMin(double number1, double number2)
    {
        if (number1 < number2)
            return number1;
        else
            return number2;
    }
    public static double findMin(double number1, double number2, double number3)
    {
        if (number1 < number2 && number1 < number3)
            return number1;
        else if (number2 < number1 && number2 < number3)
            return number2;
        else
            return number3;
    }
    public static int findMin(int number1, int number2)
    {
        if (number1 < number2)
            return number1;
        else
            return number2;
    }
    public static double findMax(double number1, double number2)
    {
        if (number1 > number2)
            return number1;
        else
            return number2;
    }
    
    public static void sumNumbersPrint(int start, int end)
    {
        int sum = 0;
        for (int i = start; i < end; i++)
        {
            sum += i;
        }
        System.out.println("Sum is: " + sum);
    }
    
    public static String returnStatement()
    {
        return "Computer Programming II";
                
    }
}
