/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inclassqueues;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
/**
 *
 * @author s540549
 */
public class InClassQueues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Integer> qL = new LinkedList<>();
        Queue<Integer> qA = new ArrayDeque<>();
        Queue<Integer> qP = new PriorityQueue<>();
        
        System.out.println("Is the LinkedList Queue empty: " + qL.isEmpty());
        System.out.println("Getting element from the LinkedList Queue: " + qL.peek());
        
        qL.add(12);
        qL.add(23);
        qL.add(34);
        System.out.println("LinkedList Queue " + qL);
    }
    
}
