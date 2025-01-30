/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1darrayexample.pkg2;
import java.util.*;

public class Main {

    public static void main(String[] args) {
       //Random Generator
       Random rand = new Random();
       
       //Creating 1D Arrays
       String[] names = new String[4];
       names[0] = "Bill";
       
       String[] stuNames = {"Bill", "Sue", "Bob", "Frank", "Jane", "Blake"};
       
       float[] gpa = new float[6];
       
       for(int i = 0; i < gpa.length; i++){
           gpa[i] = rand.nextFloat() * 4;
       }
       
       //Enhanced For Loop to print out the values in the array/For Each Loop
       for(float x: gpa){
            System.out.printf("%.2f\n", x);
       }
       
       //Arrays class
       Arrays.sort(stuNames);
       for(String x: stuNames){
           System.out.println(x);
       }
       
        changeArray(gpa);
        System.out.println(Arrays.toString(gpa));
    }
    
    public static void changeArray(float [] arr){
        //Changing array, so you can't use enhanced loop
        for(int i = 0; i < arr.length; i++){
            arr[i] = 2;
        }
    }
    
}
