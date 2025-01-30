/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab5;
import java.util.*;
/**
 *
 * @author s540549
 */
public class MorganWLab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Random rand = new Random();
         double[] rValue = new double[10];
         for(int i = 0; i < rValue.length; i++)
        {
            rValue[i] = rand.nextFloat() + rand.nextInt(1);
        }
        //Not Sorted
        System.out.println("Original order:");
        for(double num: rValue){
            System.out.printf("%.9f\n", num);
        }
        System.out.println(" ");
        //Sorted
        Arrays.sort(rValue);
        System.out.println("Sorted Order: ");
        for (double sorted: rValue){
            System.out.println(sorted);
        }
        System.out.println(" ");
        
        /*public static String vowel(String s){
            int count = 0;
            char ch;
            for(int i = 0; i < s.length(); i++){
                ch = Character.toLowerCase(s.charAt(i));
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    count++;
                }
            }
            return count++;
        }
        
        public static void string(String[] args){
            Scanner names = new Scanner(System.in);
            System.out.println("Now let's talk about animals...");
            System.out.println("Name five animals: ");
            String[] animals = new String[5];
            for(int i = 0; i < animals.length; i++){
                System.out.println("Animal " + (i + 1) + ": ");
                animals[i] = in.nextLine();
            }
            Arrays.sort(animals);
            System.out.println("Your animals, in alphabetical order are: ");
            for(int i = 0; i< animals.length; i++){
                System.out.println(animals[i] + ", which contain " + vowelCount(animals[i]) + "vowels");
            }
                    
        }*/
        
    }
    
}
