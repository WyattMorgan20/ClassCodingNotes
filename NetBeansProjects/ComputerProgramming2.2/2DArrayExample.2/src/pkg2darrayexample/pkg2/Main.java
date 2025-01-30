package pkg2darrayexample.pkg2;


public class Main {

   
    public static void main(String[] args) {
        int[][] arr = new int[3][4]; //[x](rows), [y](columns)
        
        int[][] numbers = {{1, 2, 3}, {2, 7, 9}, {3, 8, 11}, {4, 5, 6}}; //An array with 4 rows of 3 columns
        System.out.println("Row Print:");
        printByRows(numbers);
        System.out.println(" ");
        System.out.println("Column Print:");
        printByCols(numbers);
        
        String[][] students = {{"Bob", "3.2"}, {"Sue", "2.95"}, {"Jill", "4.0"}}; //Finding Average of GPAs (Project 1)
        double avg = (Double.parseDouble(students[0][1]) + Double.parseDouble(students[1][1]) + 
            Double.parseDouble(students[2][1])) / 3; //Parcing Classes to change data types for calculations
        System.out.println(avg); //Parcing works for 1D Arrays too!
    }
    
    public static void printByRows(int [][] arr){ //Print Array based on Rows (3x by 4y)
        for (int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
    
    
    public static void printByCols(int[][] arr){ //Print Array based on Columns (4x by 3y)
        for (int col = 0; col < arr[0].length; col++){
            for(int row = 0; row < arr.length; row++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
    
}
