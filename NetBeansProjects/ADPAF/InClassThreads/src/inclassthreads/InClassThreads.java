/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inclassthreads;

/**
 *
 * @author s540549
 */
public class InClassThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ThreadDemo obj1 = new ThreadDemo();
        ThreadDemo2 obj2 = new ThreadDemo2();
        
        obj1.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(Thread.MIN_PRIORITY);
        obj1.start();
        obj2.start();
        
    }
    
}
