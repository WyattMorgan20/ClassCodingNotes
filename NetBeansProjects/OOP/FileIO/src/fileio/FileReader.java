/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fileio;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author s540549
 */
public class FileReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("studentData.txt"));
        
        String firstName = sc.next();
        String lastName = sc.next();
        int age = sc.nextInt();
        
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
    }
    
}
