/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inclassstack;

import java.util.Stack;

/**
 *
 * @author s540549
 */
public class InClassStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Stack<String> stkS = new Stack<>();
        Stack<Integer> stkI = new Stack<>();
        
        System.out.println("Size of stkS: " + stkS.size());
        System.out.println("Size of stkI: " + stkI.size());
        
        stkS.push("Wyatt");
        stkS.push("Morgan");
        stkS.push("Max");
        stkS.push("DeJesus");
        
        System.out.println("Size of stkS: " + stkS.size());
        
        System.out.println("Pop: " + stkS.pop()); // removes and returns top element in stack
        System.out.println("Peek: " + stkS.peek()); // returns top element in stack WITHOUT removing
        
        System.out.println("Stack elements:");
        int size = stkS.size();
        for(int i = 0; i < size; i++){
            System.out.print(stkS.pop() + " ");
        }
        
        System.out.println("\nIs Empty: " + stkS.isEmpty());
        
        
    }
    
}
