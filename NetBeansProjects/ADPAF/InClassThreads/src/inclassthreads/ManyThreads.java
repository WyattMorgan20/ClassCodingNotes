/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inclassthreads;

/**
 *
 * @author s540549
 */
public class ManyThreads extends Thread {
    
    public static void main(String[] args){
        // No Constructor in TestThread:
        // TestThread myThread = new TestThread();
        // myThread.start();
        
        // With Constructor in TestThread:
        for(int i = 1; i < 4; i++){
            TestThread myThread = new TestThread(i);
            myThread.start();
        }
    }
    
}
