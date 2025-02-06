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
        fourth.next = fifth;
        
        converter(Node);
    }
    
    // 5
    public static LinkedList converter(LinkedList Node){
        fifth.next = head;
        return ;
    }
}
