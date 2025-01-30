/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inclasslistexercise;

import java.time.DayOfWeek;

/**
 *
 * @author s540549
 */
public class InClassListExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node pNode = new Node('P');
        Node qNode = new Node('Q');
        Node rNode = new Node('R');
        Node sNode = new Node('S');
        Node zNode = new Node('Z');
        
        pNode.next = qNode;
        qNode.next = rNode;
        rNode.next = sNode;
        Node head = pNode;
        //insertMiddle1(head, zNode); // Inserting Z between Q and R STUDENT MADE
        insertMiddle2(head, zNode); // Inserting Z between Q and R PROFF MADE
        
        while(pNode != null){
            System.out.println(pNode.c + " ");
            pNode = pNode.next;
        }
    }
 
    public static void insertMiddle1(Node curr, Node middle){ // STUDENT MADE
        Node prev = null;
        
        while(curr.next != null){
            if(curr.c == 'R'){
                prev.next = middle;
                middle.next = curr;
                break;
            }
            
            prev = curr;
            curr = curr.next;
        }
    }
    
    public static void insertMiddle2(Node curr, Node middle){ // PROFF MADE
        Node prev = null;
        
        while(curr.c != 'R'){
            prev = curr;
            curr = curr.next;
        }
        
        System.out.println("Nodes you are inserting between: " + prev.c + " " + curr.c);
        
        prev.next = middle;
        middle.next = curr;
    }
    
}

