/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab6;
import java.util.*;
/**
 *
 * @author s540549
 */
public class MorganWLab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rows = 5, colums = 10;
        int arr[][] = new int[rows][colums];
        Random r = new Random();
        for(int i=0; i<rows;i++){
            for(int j=0; j<colums;j++){
                arr[i][j] = r.nextInt(89)+10;
            }
        }
        System.out.println("Original Array: ");
        print2DArray(arr);
        System.out.println("\nModified version: ");
        arr[0][0] = arr[0][colums-1]=arr[rows-1][0]=arr[rows-1][colums-1]=0;
        print2DArray(arr);
        
       
    }
    
   public static void print2DArray(int arr[][]){
       for(int i=0; i<arr.length; i++){
           for(int j=0; j<arr[i].length; j++){
               System.out.print(arr[i][j] + " ");
           }
           System.out.println();
       }
   } 
}
