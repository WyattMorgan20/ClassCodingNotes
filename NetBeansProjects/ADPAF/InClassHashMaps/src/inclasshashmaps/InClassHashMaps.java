/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inclasshashmaps;

import java.util.*;

/**
 *
 * @author s540549
 */
public class InClassHashMaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        
        // Student id and names:
        map1.put(91987, "Wyatt");
        map1.put(91964, "Max");
        map1.put(91952, "Jen");
        map1.put(91912, "Meg");
        
        System.out.println("Maps " + map1);
        
        // Printing hashcode for every pair using entrySet() method:
        for(Map.Entry<Integer, String> entry: map1.entrySet()){
            System.out.println("Hashcode for keyvalue pair " + entry.hashCode());
        }
        
        // printing keys using keySet() method:
        Set<Integer> keys = map1.keySet();
        
        System.out.println("Keys in the map ");
        for(Integer k: keys){
            System.out.println(k);
        }
        
        // Printing all values using values() method:
        System.out.println("Values in the map " + map1.values());
    }
    
}
