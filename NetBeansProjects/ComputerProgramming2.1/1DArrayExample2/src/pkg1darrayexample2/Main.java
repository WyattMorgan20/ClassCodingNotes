/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1darrayexample2;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author s540549
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Random Generator
        Random rand = new Random();
        
        //Create an array o student names
        String[] stuNames = {"Bob", "Jill", "Steve", "Kara", "Tom", "Jane", "Blake"};
        float[] stuGPA = new float[7];
        
        //Fill the array with random float values
        for(int i = 0; i < stuGPA.length; i++)
        {
            stuGPA[i] = rand.nextFloat() + rand.nextInt(5);
        }
        
        //Enhanced for loop
        for(float gpa: stuGPA){
            System.out.printf("%.2f\n", gpa);
        }
        
        //Use Arrays Class method to sort the array
        Arrays.sort(stuNames);
        for (String name: stuNames){
            System.out.println(name);
        }
        
        System.out.println(Arrays.toString(stuNames));
    }
    
}
