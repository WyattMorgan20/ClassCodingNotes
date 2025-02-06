/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inclassactivity1;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author s540549
 */
public class InClassActivity1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> arrListMarks = new ArrayList<>();
        
        Random randInt = new Random();
        
        for(int i = 0; i < 10; i++){
            arrListMarks.add(randInt.nextInt(30));
        }
        
        arrListMarks
    }
    
}
