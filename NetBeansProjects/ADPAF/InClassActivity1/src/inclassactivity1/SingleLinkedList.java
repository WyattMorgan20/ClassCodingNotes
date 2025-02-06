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
        
        converter(head);
        
        Node first = head;
        while(first != null){
            System.out.println(first.data + " ");
            
            if(first.data == "Lisp"){
                System.out.println(first.next.data);
                break;
            }
            
            first = first.next;
            
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
