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
public class MyClass implements Interface01, Interface02 {
    public int abstractFoo(int myInt){
        System.out.println("Inside MyClass - abstractFoo");
        return myInt * 2;
    }
    
    /*public int defaultGoo(String myString){
        System.out.println("Inside MyClass - defaultGoo");
        return Interface02.super.defaultGoo(myString);
    }*/
    
    public int defaultGoo(String myString){
        System.out.println("InsideMyClass - defaultGoo");
        return myString.indexOf("oo");
    }
}
