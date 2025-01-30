/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwfilesreadingnumbers.pkg2;
import java.util.*;
import java.io.*;
/**
 *
 * @author s540549
 */
public class MorganWFilesReadingNumbers2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("examscores (1).txt");
        Scanner input = new Scanner(file);
        float average = 0;
        int num = 0;
        while(input.hasNext()){
            num += input.nextInt();
            average = num/100;
        }
        System.out.println(average);
        
    }
    
}
