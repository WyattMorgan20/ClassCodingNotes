/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author s540549
 */
public class WriteObject {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Student s1 = new Student("Wyatt", 23);
        Student s2 = new Student("Lee", 22);
        Student s3 = new Student("Max", 21);
        FileOutputStream fo = new FileOutputStream("studentObject", false);
        ObjectOutputStream oos = new ObjectOutputStream(fo);
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);
        oos.close();
        fo.close();
    }
}
