/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileio;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author s540549
 */
public class ReadObject {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(new File("studentObject"));
        ObjectInputStream ois = new ObjectInputStream(fis);
        while (true) {
            try {
                Student s1 = (Student) ois.readObject();
                Student s2 = (Student) ois.readObject();
                Student s3 = (Student) ois.readObject();
                System.out.println(s1);
                System.out.println(s2);
                System.out.println(s3);
            }
            catch(EOFException e){
                break;
                // ^Means you have reached the end of the file and want to end the loop
            }
        }

        ois.close();
        fis.close();

    }
}
