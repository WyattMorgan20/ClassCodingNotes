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
public class LetterTray extends Container {
  
    public String holdsWhat(){
        return "LetterTray: Holds letters";
    }

    //Add any additional required methods here

    @Override
    public String howToCombine() {
        return "LetterTray: Stack on top of each other";
    }
}
