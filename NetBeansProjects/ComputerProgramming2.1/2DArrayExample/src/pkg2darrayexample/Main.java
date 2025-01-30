/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2darrayexample;

/**
 *
 * @author s540549
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] numbers= {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {3, 8, 11}};
        printByRows(numbers);
        
        String[][] names = {{"Bob", "Jill"}, {"Jane", "Bill"}, {"Blake", "Sue"}};
        
        //Print a 2D array using an enhaced for loop
        for(String[] name: names){
            for(String n: name){
                System.out.print(n + " ");
            }
            System.out.println();
        }
        
        //Storing two different data types in a 2D Array
        String[][] students = {{"Bob", "3.56"}, {"Jill", "3.55"}};
        double avg = ((Double.parseDouble(students[0][1])) + (Double.parseDouble(students[1][1]) /2));
        System.out.println(avg);
    }
    
    public static void printByRows(int[][] arr)
    {
        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[0].length; col++)
            {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
    
    public static void printByCols(int[][] arr){
        for (int col = 0; col < arr.length; col++)
        {
            for (int row = 0; col < arr[0].length; col++)
            {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        
    }
}
