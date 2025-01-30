import java.io.*;
import java.util.*;

public class Exceptions 
{
   	public static void main(String[] args)
	{
		int numIn;
		String fileName = "number.txt";
                try{
                    Scanner myReader = new Scanner(new File(fileName));
                    numIn = myReader.nextInt();
                    System.out.println("number read = " + numIn);

                }
                catch(FileNotFoundException e){
                    System.out.println("File Access error " + e);
                }
//                catch(IOException e){
//                    System.out.println("Error in IO " + e);
//                } FileNotFoundException is a subclass of IOExceptions so it always gets caught first.
                catch(InputMismatchException e){
                    System.out.println("Item is not numeric " + e);
                }                
                System.out.println("Method main is done!");
		
		
	}
}
