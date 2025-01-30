/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab6;
import java.util.*;
import java.io.*;

/**
 *
 * @author s540549
 */
public class MorganWLab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        
        //Test Array
        /*int[][] numbers = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        print2DArray(numbers);*/
        
        //Real Array
        int [][] og = new int[5][10];
        for(int r = 0; r < og.length; r++){
            for(int c = 0; c < og[0].length; c++){
            og[r][c] = rand.nextInt(100);
            }
        }
        System.out.println("Original array:");
        print2DArray(og);
        
        System.out.println(" ");
        
        //Modified Array
        int [][] modified = new int[5][10];
        for(int r = 0; r < modified.length; r++){
            for(int c = 0; c < modified[0].length; c++){
            modified[r][c] = rand.nextInt(100);
            }
        }
        modified[0][0] = 0;
        modified[0][9] = 0;
        modified[4][0] = 0;
        modified[4][9] = 0;
        System.out.println("Modified version:");
        print2DArray(modified);
    }
    
    public static void print2DArray(int [][] arr){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }   
    }
    
}
