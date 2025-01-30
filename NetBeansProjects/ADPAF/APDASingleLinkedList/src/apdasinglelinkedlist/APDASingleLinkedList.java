/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apdasinglelinkedlist;

/**
 *
 * @author s540549
 */
public class APDASingleLinkedList {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node firstName = new Node("Wyatt") {};
//        System.out.println("Address of 1 Name: " + firstName);
//        System.out.println("Name of head: " + firstName.name);
//        System.out.println("Next of " + firstName.next);
        
        Node secondName = new Node("Morgan");
//        System.out.println("Address of 2 Name: " + secondName);
//        System.out.println("Name of 2 node: " + secondName.name);
//        System.out.println("Next of " + secondName.next);
        
        Node thirdName = new Node("Max");
//        System.out.println("Address of 3 Name: " + thirdName);
//        System.out.println("Name of 3 node: " + thirdName.name);
//        System.out.println("Next of " + thirdName.next);
        
        Node fourthName = new Node("Dejesus");
//        System.out.println("Address of 4 Name: " + fourthName);
//        System.out.println("Name of 4 node: " + fourthName.name);
//        System.out.println("Next of " + fourthName.next);
        
        firstName.next = secondName;
        secondName.next = thirdName;
        thirdName.next = fourthName;
        
        Node head = firstName;
        
        displayName(head);
        
        // adding new node to beginning
        System.out.println("");
        Node newName1 = new Node("Joseph");
        head = addFirst(head, newName1);
        System.out.println("Updating Beginning...");
        displayName(head);
        
        // adding new node to end
        System.out.println("");
        Node newName2 = new Node("Drew");
        head = addLast(head, newName2);
        System.out.println("Updating End...");
        displayName(head);
    }
    
    // Write a method called displayName to print ALL names:
    public static void displayName(Node n){
        System.out.println("Displaying Names...");
        while(n != null){
            System.out.println(n.name);
            n = n.next;
        }
        System.out.println("Names displayed :)");
    }
    
    public static Node addFirst(Node current, Node first){
        first.next = current;
        return first;
    }
    
    public static Node addLast(Node current, Node last){
        while(current.next != null){
            current = current.next;
        }
        current.next = last;
        return current;
    }
    
}
