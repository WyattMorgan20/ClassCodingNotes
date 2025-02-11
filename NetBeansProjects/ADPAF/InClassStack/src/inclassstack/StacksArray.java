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
        if(top >= arr1.length - 1){ // capacity of the stack
            System.out.println("Stack is full");
        }
        else{
            top++; // increse top + 1
            arr1[top] = str;
            System.out.println("Current element: " + arr1[top]);  
        }
    }
    
    public String pop(){
        if(top == -1){
            return "Stack is empty";
        }
        else{
            String poppedElement = arr1[top];
            top--;
        
            System.out.println("Popped Element: " + poppedElement);
            return poppedElement;
        }
        
    }
    
    public String peek(){
        return(arr1[top]);
    }
    
    public boolean isFull(){
        if(top != 3){
            System.out.println("Stack is full");
            return true;
        }
        else{
            System.out.println("Stack is not full");
            return false;
        }
    }
    
    public boolean isEmpty(){
        if(top == -1){
            System.out.println("Stack is empty");
            return true;
        }
        else{
            System.out.println("Stack is not empty");
            return false;
        }
    }
    
    
    
}
