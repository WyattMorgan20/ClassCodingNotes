/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwonedarray.pkg2;
import java.util.*;
import java.io.*;

/**
 *
 * @author s540549
 */
public class MorganWOneDArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        /*int[] numbers = new int[20];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i * 3 + 1;
        }*/
        //Declare file and scanner
        File file = new File("arrayData.txt");
        Scanner input = new Scanner(file);
        
        int[] numArray = new int[11];
        String[] nameArray = new String[16];
        while(input.hasNext()){
            for(int i = 0; i < numArray.length; i++){
                numArray[i] = input.nextInt();
                input.nextLine();            
            }
            for(int i = 0; i < nameArray.length; i++){
                nameArray[i] = input.nextLine();           
            }
            for(int i=numArray.length-1;i>=0;i--){
                System.out.print(numArray[i] + "  ");
            }
            System.out.println(" ");
            
            for(int i = 0; i < numArray.length; i++){
                if(numArray[i] < 0){
                    System.out.print(numArray[i] + " ");
                }
            }
            System.out.println(" ");
            for(int i = 0; i < numArray.length; i++){
                if(numArray[i]%2 == 0){
                    System.out.print(numArray[i] + " ");
                }
            }
            
            System.out.println(" ");
            for(String x: nameArray){
                System.out.println(x);
            }
            /*Char v1 = ‘H’;
            Char v2 = ‘Z’;
            Int ascii5 = v1;
            Int ascii6 = v2;

            For(String n: nameArray){
                If(n.charAt(0) >= ascii5 && n.charAt(0) <= ascii6){
                    System.out.println(n)9;
                }
            }*/

            
        }
        input.close();
    }
    
}
