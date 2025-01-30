package Exceptions;

import java.util.Scanner;
import java.io.*;

public class Exceptions
{
   public static void main( String[] args) throws Exception
   {
       int numIn;
	   String fileName = "c:/0Temp/numbers.txt";
   	   Scanner fileInput = new Scanner(	new File(fileName) );
	   numIn = fileInput.nextInt();
	   System.out.println("number read = " + numIn);
   }  //===== end method main(String[]) =====  
}  //======= end class Exceptions =======

