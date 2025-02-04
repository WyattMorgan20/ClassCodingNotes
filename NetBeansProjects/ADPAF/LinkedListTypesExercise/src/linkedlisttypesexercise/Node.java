/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlisttypesexercise;

/**
 *
 * @author s540549
 */
public class Node {
    String data;
    Node next;
    
    public Node(String data, Node next){
        this.data = data;
        this.next = next;
    }
    
    public Node(String data){
        this.data = data;
    }
}
