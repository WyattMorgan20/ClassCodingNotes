/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inclassstacklinkedlist;

/**
 *
 * @author s540549
 */
public class InClassStackLinkedList {

    public static Node top = null;
    public static Node head = top;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        push(23);
        push(32);
        push(54);
        stackPrint(head);
    }
    
    public static void push(int data){
        Node node = new Node(data);
        
        // if top is null we will assign the value to top
        if(top == null){
            top = node;
        }
        else{
            // if top is not empty we will link the new node to top
            top.next = node;
            top = node;
        }
        
        
    }
    
    public static void stackPrint(Node curr){
        System.out.println("Elements in the stack:");
        while(curr != null){
            System.out.print(curr.val + " ");
        }
    }
    
}
