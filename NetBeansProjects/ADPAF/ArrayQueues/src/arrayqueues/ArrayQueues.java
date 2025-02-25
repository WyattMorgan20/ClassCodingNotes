/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayqueues;

/**
 *
 * @author s540549
 */
public class ArrayQueues {

    int arr[];
    int size;
    int rear;
    int front;
    int capacity;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    public ArrayQueues(int capacity){
        arr = new int[capacity];
        size = 0;
        rear = 0;
        front = 0;
        this.capacity = capacity;
    }
    
    public void enqueue(int val){
        if(size == capacity){
            System.out.println("Queue is full");
            return;
        }
    }
    
}
