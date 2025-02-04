/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lists;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author s540549
 */
public class ListDriver {
    
    public static void main(String[] args){
        List<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();
        
        // Array -> Linked List:
        // Pre-defined method Arrays.asList
        String[] arr1 = {"Wyatt", "Nix", "Morgan", "Max", "Dejesus"};
        List<String> list3 = new LinkedList<>(Arrays.asList(arr1));
        System.out.println(list3);
        
        // Created from scratch
        List<String> list4 = new LinkedList<>();
        for(int i = 0; i < arr1.length; i++){
            String name = arr1[i];
            list4.add(name);
        }
        System.out.println("User defined method:");
        System.out.println(list4);
        
        // Linked List -> Array:
        // Pre-defined method linked list to an array
        Object[] arr2 = list4.toArray();
        
        // Created from scratch
        List<String> list5 = new LinkedList<>();
        list5.add("Wyatt");
        list5.add("Nix");
        list5.add("Morgan");
        list5.add("Max");
        
        String[] arr3 = new String[list5.size()];
        
        System.out.println("LL to Array:");
        for(int i = 0; i < list5.size(); i++){
            arr3[i] = list5.get(i);
            System.out.print(arr3[i] + " ");
        }
    }
}
