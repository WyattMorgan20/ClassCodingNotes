/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab7;
import java.util.*;
import java.io.*;

/**
 *
 * @author s540549
 */
public class MorganWLab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        int count = 0;
        File file = new File("populationbyzip.txt");
        Scanner inputFile = new Scanner(file);
        PrintWriter output = new PrintWriter ("dataSwitch.txt");
        while(inputFile.hasNext()){
            int zip = inputFile.nextInt();
            int pop = inputFile.nextInt();
            output.println(pop + "\t" + zip);
            count ++;
        }
        output.close();
        System.out.println("The file had " + count + " lines.");
    }
    
}
