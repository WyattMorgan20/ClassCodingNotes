/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwfilesreadingstrings.pkg2;
import java.util.*;
import java.io.*;
/**
 *
 * @author s540549
 */
public class MorganWFilesReadingStrings2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File(people.txt);
        Scanner input = new Scanner(file);
        while(input.hasNext()){
            String lastName = input.nextLine();
            String firstName = input.nextLine();
            System.out.println(lastName + " " + firstName);
        }
    }
    
}
