/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inclasslinkedlistpatternsexercise;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author s540549
 */
public class InClassLinkedListPatternsExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("java");
        list1.add("python");
        list1.add("ruby");
        list1.add("html");
        System.out.println("Linked list: " + list1);
        
        list1.remove("python");
        
        // https://docs.oracle.com/javase/8/docs/api/java/util/List.html
        
        System.out.println("");
        
        System.out.println("Iterating...");
        Iterator iterate = list1.iterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }
    }
    
}
