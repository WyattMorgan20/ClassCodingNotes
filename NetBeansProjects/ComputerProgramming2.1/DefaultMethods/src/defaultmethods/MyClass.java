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
public class MyClass implements Interface01, Interface02 {
    
    @Override
    public int foo(int myInt){
        System.out.println("Inside MyClass - foo");
        return myInt * 2;
    }
    
    public int goo(String myString){
        System.out.println("Inside MyClass - goo");
        return Interface01.super.goo(myString);
    }
}
