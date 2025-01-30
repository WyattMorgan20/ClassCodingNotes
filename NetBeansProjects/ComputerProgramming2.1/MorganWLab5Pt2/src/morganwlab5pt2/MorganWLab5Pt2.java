/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab5pt2;
import java.util.*;
/**
 *
 * @author s540549
 */
public class MorganWLab5Pt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    

    public static int vowel(String s){
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
            Scanner in = new Scanner(System.in);
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
                System.out.println(animals[i] + ", which contain " + vowel(animals[i]) + "vowels");
            }
                    
        }
    }
