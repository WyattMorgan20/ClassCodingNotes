/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectorientedintro;

/**
 *
 * @author s540549
 */
public class RecursionProblemPractice {

    public static void main(String[] args) {
        RecursionProblemPractice ob = new RecursionProblemPractice();
        int arr[] = {2, 4, 6, 8, 10};
        int goal = 6;
        int n = arr.length;
        int result = ob.binarySearch(arr, 0, n - 1, goal);
        
        if (result == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println(
                "Element is present at index " + result);
    }

    public int binarySearch(int arr[], int low, int high, int x) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] > x) {
                return binarySearch(arr, low, mid - 1, x);
            }

            return binarySearch(arr, mid + 1, high, x);
        }
        
        return -1;
    }
}
