/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlisttypesexercise;

/**
 *
 * @author s540549
 */
public class LinkedListTypesExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node head = new Node("Wyatt");
        Node second = new Node("Joseph");
        Node third = new Node("Morgan");
        
        head.next = second;
        second.next = third;
        Node first = head;
        
        while(first != null){
            System.out.println(first.data + " ");
            first = first.next;
        }
        
        // Linked using recursion
        Node head1 = new Node("Max", new Node("DeJesus", new Node("Drew", null)));
        
        Node first1 = head1;
        
        System.out.println("New Linked List:");
        while(first1 != null){
            System.out.println(first.data + " ");
            first1 = first1.next;
        }
    }
    
}