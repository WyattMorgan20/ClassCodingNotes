/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adpaf;

import java.util.ArrayList;

/**
 *
 * @author s540549
 */
public class ADPAF {

    public static void main(String[] args) {
        String[] arr1 = new String[6]; // size is fixed
        // Array can store primitives and non-primitives
	String[] arr2 = {"John", "Smith", "Jane", "Doe"}; // initialize
		
        // ArrayList can store only object, you can use wrapper class to store primitive type
	ArrayList<String> arrList1 = new ArrayList<>(); // size NOT fixed, dynamic
        ArrayList<Integer> arrList2 = new ArrayList<>();
		
	System.out.println("Size of the array2: " + arr2.length);
	System.out.println("Size of the arrayList: " + arrList1.size());        
        
        System.out.println("Value of index 2 in arr2: " + arr2[2]);
        System.out.println("Value of index 2 in arr1: " + arr1[2]);
        
        arrList1.add("Joe");
        arrList1.add("Rogen");
        arrList1.add("Wyatt");
        System.out.println("ArrList1 contents: " + arrList1);
        System.out.println("Size of ArrList1: " + arrList1.size());
        System.out.println("Get elements at index 0: " + arrList1.get(0));
        
        arrList1.set(1, "Logan");
        System.out.println("Set elements at index 1: " + arrList1.get(1));
        
        System.out.println("Arr2: " + arr2);
        for(int i = 0; i < arr2.length; i++){
            System.out.println("Arr2 index " + i + " = " + arr2[i]);
        }
    }
}
