/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lists;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author s540549
 */
public class ListDriver {
    public static void main(String[] args[]){
        List<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();
        
        String[] arr1 = {"Wyatt", "Joseph", "Morgan", "Max", "Dejesus"};
        List<String> list3 = new LinkedList<>(Arrays.asList(arr1));
        System.out.println(list3);
        
        
    }
}
