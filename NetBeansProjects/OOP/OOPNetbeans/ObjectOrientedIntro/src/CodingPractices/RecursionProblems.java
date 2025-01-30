/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodingPractices;

import javax.naming.directory.SearchResult;

/**
 *
 * @author s540549
 */
public class RecursionProblems {

    public static void main(String[] args) {
        // prob 7 sum of array elements:
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum1 = 0;
        int index = 0;
        System.out.println(sumArr(arr, sum1, index));
        System.out.println("-----------------------");
        
        // prob 5 sum of natural numbers:
        int n = 10;
        int sum2 = 0;
        int index2 = 1;
        System.out.println(sumNat(n, index2, sum2));
        
        // prob 8
        int target = 7;
        System.out.println(targetArr(arr, target));
    }
    
    // prob 8:
    public static boolean targetArr(int arr[], int target){
        if(arr.length <= 2){
            return false;
        }
        else{
            int required = target - arr[0];
            int temp = 0;
            if(temp == 0){ //arr.search(temp, required)){
                return true;
            }
            else{
                return targetArr(arr, target);
            }
        }
    }
    
    // prob 5:
    public static int sumNat(int numIn, int indexIn, int sumIn){
        if(numIn <= 0){
            return 0;
        }
        if(indexIn != numIn + 1){
            sumIn += indexIn;
            indexIn++;
            return sumNat(numIn, indexIn, sumIn);
        }
        return sumIn;
    }
    
    // prob 7:
    public static int sumArr(int arrIn[], int sumIn, int indexIn) {
        if(arrIn.length == 1){
            return sumIn += arrIn[0];
        }
        if(indexIn != arrIn.length){
            sumIn += arrIn[indexIn];
            indexIn++;
            return(sumArr(arrIn, sumIn, indexIn));
        }
        else{
            return sumIn;
        }
    }
}
