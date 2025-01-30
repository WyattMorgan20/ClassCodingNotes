/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab9;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author s540549
 */
public class MorganWLab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("mouse");
        list1.add("giraffe");
        list1.add("lion");
        list1.add("elephant");
        
        for (String v : list1) { 
            System.out.println(v);
        }
        System.out.println(" ");
        list1.add(2, "Cheetah");
        list1.remove(0);
        for (String v : list1) { 
            System.out.println(v);
        }
    }
    
}
