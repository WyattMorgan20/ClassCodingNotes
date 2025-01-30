package morganwlab5.pkg2;
import java.util.*;

/**
 *
 * @author s540549
 */
public class MorganWLab52 {

    public static void main(String[] args) {
        Random rand = new Random();
        
        double[] num = new double[10];
       
        for(int i = 0; i < num.length; i++){
           num[i] = rand.nextDouble();
        }
        
        //Non-Sorted
        System.out.println("Original Order:");
        for(double x: num){
            System.out.println(x);
        }
        
        System.out.println(" ");
        
        //Sorted
        System.out.println("Sorted Order:");
        Arrays.sort(num);
        for(double x: num){
            System.out.println(x);
        }
        
        System.out.println(" ");
        //Part 2
        String[] animal = new String[5];
        System.out.println("Now, let's talk about animals...");
        Scanner input = new Scanner(System.in);
        System.out.println("Name five animals:");
        //Gathering Input
        System.out.print("Animal 1: ");
        animal[0] = input.nextLine();
        //vowelCount(animal[0]);
        
        System.out.print("Animal 2: ");
        animal[1] = input.nextLine();
        //vowelCount(animal[1]);
        
        System.out.print("Animal 3: ");
        animal[2] = input.nextLine();
        //vowelCount(animal[2]);
        
        System.out.print("Animal 4: ");
        animal[3] = input.nextLine();
        //vowelCount(animal[3]);
        
        System.out.print("Animal 5: ");
        animal[4] = input.nextLine();
        //vowelCount(animal[4]);
        
        Arrays.sort(animal);
        //Vowel Output Start
        System.out.println(" ");
        
        System.out.println("Your animals, in alphabetical order, are:");
        for(String x: animal){
            System.out.println(x + ", which contains " + String.valueOf(vowelCount(x)) + " vowels.");
            //System.out.println(x);
        }
    }
    
    public static int vowelCount(String animal){
        int vowelCount = 0;
        for(int i = 0; i < animal.length(); i++){
            if(animal.charAt(i)=='a' || animal.charAt(i)=='e' || animal.charAt(i)=='i' || 
                animal.charAt(i)=='o' || animal.charAt(i)=='u'){
                vowelCount++;
            }
        }
        return vowelCount;
    }
    
}
