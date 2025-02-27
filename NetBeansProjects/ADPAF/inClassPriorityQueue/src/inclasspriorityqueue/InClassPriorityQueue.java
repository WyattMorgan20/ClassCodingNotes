/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inclasspriorityqueue;

import java.util.PriorityQueue;

/**
 *
 * @author s540549
 */
public class InClassPriorityQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PriorityQueue<Person> pq = new PriorityQueue<>();
        // could also do:
        // PriorityQueue<Person> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // to reverse the order
        
        pq.add(new Person(1, "Wyatt"));
        pq.add(new Person(2, "Morgan"));
        pq.add(new Person(3, "Max"));
        pq.add(new Person(4, "Drew"));
        
        System.out.println("Priority Queue " + pq);
        
        
    }
    
}
