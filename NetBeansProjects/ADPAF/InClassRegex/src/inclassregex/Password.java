/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inclassregex;

import java.util.*;
import java.util.regex.Pattern;

/**
 *
 * @author S540549
 */
public class Password {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter you password: ");
        String password = input.nextLine();
        
        String regex1 = "[A-Z][A-Za-z]{7,}$"; // 7, means 7 or more characters
        
        if(Pattern.matches(regex1, password)){
            System.out.println("It matches");
        }
        else{
            System.out.println("It does not match");
        }
        
    }
    
}
