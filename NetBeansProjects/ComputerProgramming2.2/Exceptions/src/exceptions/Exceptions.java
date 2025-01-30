/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;
import java.util.*;
import java.io.*;
import java.util.InputMismatchException;
/**
 *
 * @author s540549
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args){
       int numIn;
	   String fileName = "c:/0Temp/numbers.txt";
           try{
                Scanner fileInput = new Scanner(	new File(fileName) );
                numIn = fileInput.nextInt();
                System.out.println("number read = " + numIn);
           }
           /*catch (FileNotFoundException e) 
{
		System.out.println("File Creation Error " + e);
            }*/
            catch (IOException e) 
{
		System.out.println("Error in IO " + e);
            }
            catch (InputMismatchException e) 
{
		System.out.println("Item is not numeric: " + e);
            }
            System.out.println("method main is done!");

   }  //===== end method main(String[]) =====  
}  //======= end class Exceptions =======
