/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab09;
import java.util.*;
/**
 *
 * @author s540549
 */
public class MorganWLab09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("mouse");
        list1.add("giraffe");
        list1.add("lion");
        list1.add("elephent");
        for(String c: list1){
            System.out.println(c);
        }
        System.out.println("");
        list1.add(2, "cheetah");
        list1.remove(0);
        for(String c: list1){
            System.out.println(c);
        }
        
    }
    
}
