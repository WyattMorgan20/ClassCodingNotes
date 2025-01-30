/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionexample;
import java.io.*;
import java.util.*;

public class ExceptionExample {

    public static void main(String[] args) {
        int months = 0;
        double oneMonth;
        double totalSales = 0.0;
        double avgSales;
        
        try {
        File file = new File("salesData.txt");
        Scanner inputFile = new Scanner(file);
        
        while(inputFile.hasNext()){
            oneMonth = inputFile.nextDouble();
            totalSales += oneMonth;
            months++;
        }
        inputFile.close();
        //Calculate avg
        avgSales = totalSales / months;
        System.out.printf("Number of months: %d" + "\nTotal Sales: $%.2f" + 
                "\nAverage Sales: $%.2f", months, totalSales, avgSales);
        }
        
        catch(FileNotFoundException e){
            System.out.println("The File Does Not Exist");
        }
        catch(InputMismatchException e){
            System.out.println("Non-Numeric data found in the file " + e);
        }
        
        System.out.println("\nHave a good day");
    }
    
}
