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
        
        // Add
        dq.add("Wyatt");
        dq.add("Morgan");
        System.out.println("Elements in Deque " + dq);
        
        dq.addFirst("Max");
        dq.addLast("Drew");
        System.out.println("Elements in Deque " + dq);
        
        // Offer
        System.out.println("\nAfter using offer: ");
        
        dq.offer("Ben");
        System.out.println("Elements in Deque " + dq);
        
        dq.offerFirst("Nic");
        dq.offerLast("Nix");
        System.out.println("Elements in Deque " + dq);
        
        System.out.println("Size of the Deque " + dq.size());
        
        
        // Remove
        System.out.println("\nRemoving Elements in Deque:");
        
        dq.remove();
        System.out.println("Elements in Deque " + dq);
        
        dq.removeFirst();
        dq.removeLast();
        System.out.println("Elements in Deque " + dq);
        
        // Poll
        System.out.println("\nRemoving elements using poll:");
        
        dq.poll();
        System.out.println("Elements in Deque " + dq);
        
        dq.pollFirst();
        dq.pollLast();
        System.out.println("Elements in Deque " + dq);
        
        // Iterator
        System.out.println("\nPrinting elements using iterator:");
        Iterator<String> itr = dq.iterator();
        
        while(itr.hasNext()){
            System.out.println(" " + itr.next());
        }
        
        // reverse order iterator
        System.out.println("Decending order:");
        Iterator<String> itr2 = dq.descendingIterator();
        
        while(itr2.hasNext()){
            System.out.println(" " + itr2.next());
        }
    }
    
}
