/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inclassthreads;

/**
 *
 * @author s540549
 */
public class ThreadDemo2 extends Thread {
    
    public void run(){
        int value = 0;
        for(int i = 1; i < 8; i++){
            value = value + i;
            System.out.println("Thread2 value " + value);
        }
    }
    
}
