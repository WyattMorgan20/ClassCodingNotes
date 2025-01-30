/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileexample;
import java.util.*;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author s540549
 */
public class FileExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException{
        //Variables
        String fname, lname, hairColor;
        int age;
        
        //Ask the user to choose a file they want to read from
        //JFileChooser myChooser = new JFileChooser();
        //myChooser.showOpenDialog(null);
        //File file = myChooser.getSelectedFile();
        
        //Create a file object to open the file, then scanner to read the file
        File file = new File("cs.txt");
        Scanner fileInput = new Scanner(file);
        
        //Create a file to write data to.
        PrintWriter output = new PrintWriter("output.txt");
        
        //Loop to read data from the file
        while(fileInput.hasNext()){
            /*lname = fileInput.next();
            fname = fileInput.next();
            age = fileInput.nextInt();
            hairColor = fileInput.next();
            */
            lname = fileInput.nextLine();
            fname = fileInput.nextLine();
            age = fileInput.nextInt();
            fileInput.nextLine();
            hairColor = fileInput.nextLine();
            
            output.printf("Last Name: %10s\nFirst Name: %10s\nAge: %10d\nHair Color: %-10s\n", lname, 
                    fname, age, hairColor);
        }
    output.close();
    fileInput.close();   
    }
    
    
}
