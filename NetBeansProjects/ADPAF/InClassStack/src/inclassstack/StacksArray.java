/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inclassstack;

/**
 *
 * @author s540549
 */
public class StacksArray {
    
    int top;
    String[] arr1;
    int capacity;
    
    public StacksArray(int size){
        capacity = size;
        arr1 = new String[capacity];
        top = -1;
    }
    
    public void push(String str){
        if(top >= arr1.length - 1){
            System.out.println("Stack is full");
        }
        else{
            top++; // increse top + 1
            arr1[top] = str;
            System.out.println("Current element: " + arr1[top]);  
        }
        
    }
    
    
    
}
