/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab13;


/**
 *
 * @author s540549
 */
public class MorganWLab13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object[] objects = {new Lego(), new PogoStick(),
                            new LetterTray(), new EggCarton()};
        
        //Create your for loop here
        for(Object o: objects){
            if(o instanceof Lego){
                System.out.println(((Lego) o).howToCombine());
                System.out.println(((Lego) o).howToPlay());
            }
            if(o instanceof PogoStick){
                System.out.println(((PogoStick) o).howToPlay());
            }
            if(o instanceof LetterTray){
                System.out.println(((LetterTray) o).howToCombine());
                System.out.println(((LetterTray) o).holdsWhat());
                
            }
            if(o instanceof EggCarton){
                System.out.println(((EggCarton) o).howToCombine());
                System.out.println(((EggCarton) o).howToDispose());
                System.out.println(((EggCarton) o).holdsWhat());
            }
        }
            
    }
    
}
