/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileexample.pkg2;
import java.util.*;
import java.io.*;
import javax.swing.*; //for file chooser

public class FileExample2 {

    public static void main(String[] args) throws FileNotFoundException {
        String lastName;
        String firstName;
        int age;
        String hairColor;
        
        //Setup to read from a file
        //File file =  new File("cs1 (1).txt"); //ORIGINAL file finder
        //setup to allow the user to choose the file
        JFileChooser myChooser = new JFileChooser();
        myChooser.showOpenDialog(null);
        File file = myChooser.getSelectedFile(); //returns file name as file object
        
        Scanner input = new Scanner(file);
        
        //Setup to write to a file (output file)
        PrintWriter output = new PrintWriter("output.txt");
        
        while(input.hasNext()){
            lastName = input.nextLine();
            firstName = input.nextLine();
            age = input.nextInt();
            input.nextLine();
            hairColor = input.nextLine();
            output.printf("%-15s%-15s%-13s%-5d\n", firstName, lastName, hairColor, age); //System.out represents output window (Below), output represents output file
        }
        output.close(); //ALWAYS close output files
        input.close(); //Close input files too
    }
    
}
