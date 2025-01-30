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
public class MyClass implements Interface01 {
    
    @Override
    public int abstractFoo(int myInt){
        System.out.println("Inside MyClass - abstractFoo");
        return myInt * 2;
    }
    
    public int goo(String myString){
        System.out.println("Inside MyClass - goo");
        return Interface01.super.goo(myString);
    }
{
