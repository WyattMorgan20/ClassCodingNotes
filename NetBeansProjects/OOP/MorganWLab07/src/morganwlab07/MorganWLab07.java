/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab07;
import java.util.*;
import java.io.*;
/**
 *
 * @author S540549
 */
public class MorganWLab07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        int zip;
        int pop;
        int count = 0;
        
        File file = new File("population by zip.txt");
        Scanner input = new Scanner(file);
        
        PrintWriter output = new PrintWriter("dataSwitch.txt");
        while(input.hasNext()){
            zip = input.nextInt();
            pop = input.nextInt();
            output.print(pop + "\t " + zip + "\n");
            count += 1;
        }
        System.out.println("The file had " + count + " lines.");
        
        input.close();
        output.close();
    }
    
}
