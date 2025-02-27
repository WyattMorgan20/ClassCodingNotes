/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inclassdeque;

import java.util.*;

/**
 *
 * @author s540549
 */
public class InClassDeque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Deque<String> dq = new ArrayDeque<>();
        // could also do:
        // Deque<String> dq = new LinkedList<>();
        
        dq.add("Wyatt");
        dq.add("Morgan");
        dq.addFirst("Max");
        dq.addLast("Drew");
        
        System.out.println("Elements in Deque " + dq);
        
    }
    
}
