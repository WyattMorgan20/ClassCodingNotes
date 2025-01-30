/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwtwodarray.pkg2;
import java.util.*;
import java.io.*;
/**
 *
 * @author s540549
 */
public class MorganWTwoDArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        int[][] numArray2D = new int[4][3];
        File file = new File("2darraydata (1).txt");
        Scanner input = new Scanner(file);
        float total = 0;
        
        while(input.hasNext()){
            for(int i = 0; i < numArray2D.length; i++){
                for(int j = 0; j < numArray2D[i].length; j++){
                    numArray2D[i][j] = input.nextInt();
                    System.out.print(numArray2D[i][j] + " ");
                    total += numArray2D[i][j];
                    
                }
                System.out.println();
            }
            System.out.println(" ");
            float average = total/12;
            System.out.println("average = " + average);
            System.out.println("Array values greater than average:");
            for(int i = 0; i < numArray2D.length; i++){
                for(int j = 0; j < numArray2D[i].length; j++){
                    if(numArray2D[i][j] > 11.83){
                        System.out.print(numArray2D[i][j] + " ");
                    }
                }
            }
            
            /*for(int x: numArray2D){
                System.out.println(x);
            }*/
        }
    }
    
}
