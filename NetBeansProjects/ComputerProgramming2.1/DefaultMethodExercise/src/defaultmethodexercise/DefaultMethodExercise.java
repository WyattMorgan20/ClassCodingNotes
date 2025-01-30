/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultmethodexercise;

/**
 *
 * @author s540549
 */
public class DefaultMethodExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass class01 = new MyClass();
        
        class01.foo(3);
        System.out.println(class01.goo("Hello"));
    }
    
}
