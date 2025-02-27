/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayqueues;

import java.util.*;

/**
 *
 * @author s540549
 */
public class ArrayQueues {

    int arr[];
    int size;
    int rear;
    int front;
    int capacity; // the size of the array
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayQueues arr = new ArrayQueues(5);
        
        // Inserting values into arrayQueue
        arr.enqueue(23);
        arr.enqueue(12);
        arr.enqueue(24);
        arr.enqueue(32);
        arr.enqueue(33);
        arr.enqueue(36);
        
        // Removing values from arrayQueue
        arr.dequeue();
        arr.dequeue();
        
        arr.enqueue(36);
        
        //Peeking values from arrayQueue
        arr.peek();
    }
    
    public ArrayQueues(int cap){
        arr = new int[cap];
        size = 0;
        rear = 0;
        front = 0;
        capacity = cap;
    }
    
    public void enqueue(int val){
        if(size == capacity){
            System.out.println("Queue is full");
            return;
        }
        
        rear = (rear + 1) % capacity;
        arr[rear] = val;
        
        System.out.println("Inserted element " + arr[rear]);
        
        size = size + 1;
    }
    
    public void dequeue(){
        System.out.println("Removed element " + arr[front]);
        front = (front + 1) % capacity;
        size = size - 1;
    }
    
    public void peek(){
        System.out.println("Peeking element " + arr[front]);
        front = (front + 1) % capacity;
        size = size - 1;
    }
    
}
