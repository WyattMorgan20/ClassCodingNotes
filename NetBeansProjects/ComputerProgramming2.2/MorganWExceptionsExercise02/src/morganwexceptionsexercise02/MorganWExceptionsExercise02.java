/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwexceptionsexercise02;
import java.io.*;
import java.util.*;
/**
 *
 * @author s540549
 */
public class MorganWExceptionsExercise02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            java.net.URL path = MorganWExceptionsExercise02.class.getResource("primary.txt");
            File myFile = new File(path.getFile());
            Scanner scan = new Scanner(myFile);
            String finalStr = "reading primary file";
            for (int i = 0; i < 5; i++){
                String line = scan.nextLine();
                Integer.parseInt(line);
                finalStr = finalStr.concat(" " + line);
            }
            System.out.println(finalStr);
            scan.close();
        }
        catch(Exception e){
            try{
                java.net.URL path = MorganWExceptionsExercise02.class.getResource("secondary.txt");
                File myFile = new File(path.getFile());
                Scanner scan = new Scanner(myFile);
                String finalStr = "reading secondary file";
                for (int i = 0; i < 5; i++){
                    String line = scan.nextLine();
                    Integer.parseInt(line);
                    finalStr = finalStr.concat(" " + line);
                }
                System.out.println(finalStr);
                scan.close();
            }
            catch (Exception f){
                System.out.println("could not obtain the data");
                return;
            }
        }
    }
    
}
