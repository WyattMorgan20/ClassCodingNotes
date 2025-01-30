import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Driver
{
   public static void main( String[] args)
   {
       ArrayList<Double> doubleArrayList = new ArrayList<Double>();
       try
       {
           File myFile = new File( "c:/0Temp/double.txt" );
           Scanner fileInput = new Scanner( myFile );
           DataSetReader reader = new DataSetReader();
           doubleArrayList = reader.readInputReturnArrayList( fileInput );
           
           for (Double doubleObject: doubleArrayList)
           {
               System.out.println( doubleObject.toString() );
           }
       }
       catch (FileNotFoundException exception)
       {
           System.out.println("File Creation Error: " + exception);
       }
       catch (BadDataException exception)
       {
           System.out.println( "Bad data: " + exception.getMessage() );
       }
   }  //===== end method main(String[]) =====  
}  //======= end class Driver =======