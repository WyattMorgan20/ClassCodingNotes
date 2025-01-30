/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectorientedintro;

/**
 *
 * @author s540549
 */
public class PalindromRecursionPractice {
    
    public static boolean checkPalindrom(String s){
        if(s.length() == 0 || s.length() == 1){
            return true;
        }
        else if(s.charAt(0) == s.charAt(s.length() - 1)){
            return checkPalindrom(s.substring(1, s.length() - 1));
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args){
        System.out.println(checkPalindrom("anna"));
        System.out.println(checkPalindrom("racecar"));
        System.out.println(checkPalindrom("snake"));
    }
}
