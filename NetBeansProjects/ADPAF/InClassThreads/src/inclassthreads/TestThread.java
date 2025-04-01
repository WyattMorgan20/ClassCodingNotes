/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inclassthreads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s540549
 */
public class TestThread extends Thread {
    
    private int threadNumber;
    
    public TestThread(int threadNb){
        threadNumber = threadNb;
    }
    
    public void run(){
        for(int i = 1; i < 5; i++){
            System.out.println(i + " From Thread " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(TestThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
