/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashsets;

import java.util.*;

/**
 *
 * @author s540549
 */
public class Hashsets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        
        set1.add("HTML");
        set1.add("CSS");
        
        System.out.println("Haschode of the set " + set1.hashCode());
    }
    
}
