/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwfilesinputfilename;
import java.util.*;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author s540549
 */
public class MorganWFilesInputFileName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        JFileChooser myChooser = new JFileChooser();
        myChooser.showOpenDialog(null);
        File file = myChooser.getSelectedFile();
        
        Scanner input = new Scanner(file);
        
        int count = 0;
        while(input.hasNext()){
            int num = input.nextInt();
            if(num >= 70){
                count += 1;
                
            }
        }
        System.out.println(count);
    }
    
}
