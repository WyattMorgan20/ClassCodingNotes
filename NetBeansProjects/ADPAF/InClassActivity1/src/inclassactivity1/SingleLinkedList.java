/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inclassactivity1;

import com.sun.net.httpserver.Headers;
import java.util.LinkedList;

/**
 *
 * @author s540549
 */
// 3
public class SingleLinkedList {
    
    public static void main(String[] args){
        // 4
        Node head = new Node("Java");
        Node second = new Node("Python");
        Node third = new Node("Ruby");
        Node fourth = new Node("C++");
        Node fifth = new Node("Lisp");
        
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        
        Node first1 = head;
        System.out.println("Initial Linked List:");
        while(first1 != null){
            System.out.println(first1.data + " ");
            first1 = first1.next;
            
        }
        
        // 5
        converter(head);
        
        // 6
        Node first2 = head;
        System.out.println("\nCircular Linked List:");
        while(first2 != null){
            System.out.println(first2.data + " ");
            
            if(first2.data == "Lisp"){
                System.out.println(first2.next.data);
                break;
            }
            
            first2 = first2.next;
            
        }
    }
    
    // 5
    public static Node converter(Node head){
        Node current = head;
        
        while(current != null){
            current = current.next;
            if(current.next == null){
                current.next = head;
                break;
            }
        }
        
        return current;
    }
}
