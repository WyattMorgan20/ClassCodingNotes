/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inclassactivity1;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author s540549
 */
public class InClassActivity1P2 {
    
    public static void main(String[] args){
        // 1
        LinkedList<String> studentsLinkL = new LinkedList<>();
        
        // 2
        studentsLinkL.add("John");
        studentsLinkL.add("Ajay");
        studentsLinkL.add("Rachel");
        studentsLinkL.add("Ross");
        studentsLinkL.add("Sai");
        
        // 3
        studentsLinkL.set(0, "Chandler");
        studentsLinkL.add("Phoebe");
        
        // 4
        ArrayList<String> studArrayL = new ArrayList<>();
        
        // 5
        for(String item: studentsLinkL){
            studArrayL.add(item);
        }
        
        // 6
        System.out.println(studentsLinkL);
        System.out.println(studArrayL);
    }
}
