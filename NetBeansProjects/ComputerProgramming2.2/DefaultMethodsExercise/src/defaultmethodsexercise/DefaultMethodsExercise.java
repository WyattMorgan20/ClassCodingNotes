/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultmethodsexercise;

/**
 *
 * @author s540549
 */
public class DefaultMethodsExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass class01 = new MyClass();
        System.out.println(class01.abstractFoo(3));
        System.out.println(class01.defaultGoo("GoodBye"));
    }
    
}
