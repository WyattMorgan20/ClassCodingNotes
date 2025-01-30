/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwstringmethods.pkg2;
import java.util.*;
import java.io.*;
/**
 *
 * @author S540549
 */
public class MorganWStringMethods2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] friends = {"Max", "Lilly", "Ryan", "Anne", "Jake"};
        displayArray(friends);
        friends[0] = friends[0].toUpperCase();
        friends[1] = friends[1].toLowerCase();
        friends[2] = "".concat("     ").concat(friends[2]).concat("     ");
        friends[3] = "Bobby Bearcat – Go Bearcats";
        displayArray(friends);
        System.out.println("Length of element 3: " + friends[3].length());
        friends[2] = "Ryan";
        displayArray(friends);
        System.out.println("Bear appears first at location: " + friends[3].indexOf("Bear"));
        System.out.println(friends[3].indexOf("Go Bearcats").subString(16, 24).toUpperCase());
        
        
    }
    
    public static void displayArray(String[] friends){
        for(String x: friends){
            System.out.print(x + " ");
        }
        System.out.println("");
    }
    
}
