/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inclassstack;

/**
 *
 * @author s540549
 */
public class StacksArrayDriver {
    
    public static void main(String[] args){
        StacksArray stack1 = new StacksArray(4);
        System.out.println("Pushing:");
        stack1.push("1Wyatt");
        stack1.push("2Morgan");
        stack1.push("3Max");
        stack1.push("4DeJesus");
        stack1.push("5Drew"); // declared size is 4, so 5 is too large
        
        System.out.println("\nPeek:");
        System.out.println(stack1.peek());
        
        System.out.println("\nisFull:");
        System.out.println(stack1.isFull());
        
        System.out.println("\nPopping:");
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.pop();
        
        System.out.println("\nisEmpty");
        System.out.println(stack1.isEmpty());
    }
    
}
