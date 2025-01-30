/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultmethods;

/**
 *
 * @author s540549
 */
public class DefaultMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass m = new MyClass();
        System.out.println(m.foo(5));
        System.out.println(m.goo("Hello"));
    }
    
}
