/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inclassactivityhashing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author s540549
 */
public class InClassActivityHashing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // P1:
        // 1:
        Set<String> set1 = new LinkedHashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        
        // 2:
        // also could do: set1.add("Apple");
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Orange", "Plum", "Watermelon", "Nectarine");
        set1.addAll(fruits);
        
        // 3:
        for(String fruit: set1){
            if(fruit == "Apple"){
                System.out.println("Apple is present in set 1");
            }
            if(fruit == "Banana"){
                System.out.println("Banana is present in set 1");
            }
        }
        
        // 4:
        set2.add("Banana");
        set2.add("Cherry");
        set2.add("Pineapple");
        set2.add("Plum");
        set2.add("Blueberry");
        
        // 5:
        System.out.println("\nSet1 haschode:");
        for(String fruit: set1){
            System.out.println(fruit.hashCode());
        }
        
        System.out.println("\nSet2 haschode:");
        for(String fruit: set2){
            System.out.println(fruit.hashCode());
        }
        
        
        
    }
    
    // 6:
    public int hashFruit(Set<String> fruit){
        ArrayList<Integer> nums = new ArrayList<>();
        for(String value: fruit){
            int hashVal = value.length();
            
            if(!nums.contains(hashVal)){
                nums.add(hashVal);
            }
            else{
                System.out.println("Fruits causing colisions:");
            }
            
            return hashVal;
        }
        
        if()
    }
    
}
