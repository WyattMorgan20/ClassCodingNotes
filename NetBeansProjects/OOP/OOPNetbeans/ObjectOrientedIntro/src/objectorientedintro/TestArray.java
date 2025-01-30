/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectorientedintro;

/**
 *
 * @author s540549
 */
public class TestArray {
    public static void main(String[] args){
        int n = 5;
        int avg = 0;
        int sum = 0;
        int count = 0;
        int min = 0;
        int max = 0;
        int[] arrInteger = new int[n];
        
        for(int i = 0; i < arrInteger.length; i++){
            arrInteger[i] = i * 2;
            sum += i * 2;
            count++;
            
        }
        
        for(int i = 0; i < arrInteger.length; i += 2){
            
            System.out.println(arrInteger[i]);
        }
        
        // AVG
        for(int i = 0; i < arrInteger.length; i++){
            avg = sum/count;
            System.out.println("Average = " + arrInteger[i]);
        }
        
        
    }
}
