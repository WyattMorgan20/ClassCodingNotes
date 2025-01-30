/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab13;

/**
 *
 * @author CBADAMI
 */

//Modify header as necessary
public class EggCarton extends Container implements Disposable{
    
    public String holdsWhat(){
        return "EggCarton: Holds eggs";
    }
    
    //Add any additional required methods here

    @Override
    public String howToCombine() {
        return "EggCarton: Stack open cartons together";
    }

    @Override
    public String howToDispose() {
        return "EggCarton: Try to recycle, or throw away";
    }
    
    
    
}
