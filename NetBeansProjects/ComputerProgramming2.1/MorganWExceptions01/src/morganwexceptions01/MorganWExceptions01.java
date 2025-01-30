import java.util.Scanner;
import java.io.*;
import java.util.InputMismatchException;

public class MorganWExceptions01
{
   public static void main( String[] args) 
   {
       int numIn;
	   String fileName = "c:/0Temp/Exceptions.txt";
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

