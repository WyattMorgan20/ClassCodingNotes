/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;
import java.util.*;
import java.io.*;

/**
 *
 * @author s540549
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        String filename = "salesData.txt";
        int months = 0;
        double oneMonth;
        double totalSales = 0.0;
        double averageSales;
        try{
            File file = new File(filename);
            Scanner inputFile = new Scanner(file);
        
            while(inputFile.hasNext()){
                oneMonth = inputFile.nextDouble();
                totalSales += oneMonth;
                months++;
            }
            inputFile.close();
            averageSales = totalSales/months;
            System.out.printf("Number of months: %d\nTotal Sales: $%.2f\nAverage Sales: $%.2f", months, totalSales, averageSales);
        } catch(FileNotFoundException e){
            //Thrown by the Scanner constructor when the file is not found
            System.out.println("The file" + filename + " does not exist");
        } catch(InputMismatchException e){
           //Thrown by the Scanner class's nextDouble method when a non-numeric value found
           System.out.println("Non-numeric data found in the file");  
        }
        
    }
    
}
