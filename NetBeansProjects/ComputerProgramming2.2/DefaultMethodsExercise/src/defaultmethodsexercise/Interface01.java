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
public interface Interface01 {
    int abstractFoo(int myInt);
    
    default int defaultGoo(String myString){
        System.out.println("Inside Interface 01 - defaultGoo");
        return myString.length();
    }
}
