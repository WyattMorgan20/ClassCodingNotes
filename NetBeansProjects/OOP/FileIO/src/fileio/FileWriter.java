/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author s540549
 */
public class FileWriter {
    public static void main(String[] args) throws FileNotFoundException{
        FileOutputStream fo = new FileOutputStream(new File("sample.txt"), true);
        PrintWriter pw = new PrintWriter(fo);
        // or to write to console:
        // PrintWriter pw = new PrintWriter(System.out);

        
        pw.println("Ratan Lal");
        pw.println(30 + "\n");
        pw.close();
        
        
    }
}
