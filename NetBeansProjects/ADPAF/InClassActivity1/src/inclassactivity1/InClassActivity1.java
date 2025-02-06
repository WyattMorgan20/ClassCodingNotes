/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inclassactivity1;

import java.util.ArrayList;
import java.util.LinkedList;
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
        // 1
        ArrayList<Integer> arrListMarks = new ArrayList<>();
        
        // 2
        Random randInt = new Random();
        for(int i = 0; i < 10; i++){
            arrListMarks.add(randInt.nextInt(30));
        }
        
        // 3
        arrListMarks.set(4, 99);
        
        // Outputting the arrayList
        System.out.println(arrListMarks);
        
        // 4
        LinkedList<Integer> linkedListMarks = new LinkedList<>();
        
        // 5
        for(int item: arrListMarks){
            linkedListMarks.add(item);
        }
        
        // 6 outputting the linkedList
        System.out.println(linkedListMarks);
    }
    
}
