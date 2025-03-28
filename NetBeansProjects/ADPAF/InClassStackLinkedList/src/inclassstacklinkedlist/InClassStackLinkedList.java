/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inclassstacklinkedlist;

import java.awt.HeadlessException;

/**
 *
 * @author s540549
 */
public class InClassStackLinkedList {

    public static Node top = null;
    public static Node head = top;
    public static int size = 0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        push(23);
        push(32);
        push(54);
        
        System.out.println("Top value: " + top.val);
        System.out.println("Head value: " + head.val);
        stackPrint();
        
        pop();
        System.out.println("\nUpdated LinkedList");
        stackPrint();
        
        int last = peek();
        System.out.println("\nPeek value in stack " + last);
        System.out.println("Size of LinkedList: " + size);
    }
    
    public static void push(int data){
        Node node = new Node(data);
        
        // if top is null we will assign the value to top
        if(top == null){
            head = node;
            top = node;
            size++;
        }
        else{
            // if top is not empty we will link the new node to top
            top.next = node;
            top = node;
            size++;
        }
        
        
    }
    
    public static void stackPrint(){
        Node curr = head;
        System.out.println("\nElements in the stack:");
        while(curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
    
    public static void pop(){
        Node curr = head;
        Node prev = null;
        while(curr.next != null){
            prev = curr;
            curr = curr.next;
        }
        
        System.out.println("\nPop value " + curr.val);
        System.out.println("Prev value " + prev.val);
        prev.next = null;
        size--;
    }
    
    public static int peek(){
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        
        return curr.val;
    }
    
    public static void isEmpty(){
        // no se
    }
    
}
