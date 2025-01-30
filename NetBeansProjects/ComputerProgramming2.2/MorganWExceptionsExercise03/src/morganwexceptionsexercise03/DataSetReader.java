
//################### import packages ####################
import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.io.File;

/**
 * write a description of class DataSetReader here.
 * 
 * <BR><BR>
 * Course-Section:  yourCourse-sectionNumber
 *
 * @author  yourName
 * @since   currentDate
 */
public class DataSetReader
{ 
   //################## instance variables ##################
   private ArrayList<Double> doubleNumbersList;

   
   public DataSetReader()
   {
       doubleNumbersList = new ArrayList<Double>();
   }
   
   //###################  other methods #####################
   public ArrayList<Double> readInputReturnArrayList(Scanner fileInput ) throws BadDataException
   {
       try
       {
           readData( fileInput );
       }
       finally
       {
           fileInput.close();
       }
       return doubleNumbersList;
    }
    
    public void readData( Scanner fileInput ) throws BadDataException
    {
        if (! fileInput.hasNextInt() )
            throw new BadDataException( "Number of doubles in file expected! " );
        int numberOfValues = fileInput.nextInt();
        
        for (int index = 0; index < numberOfValues; index++)
        {
            readDoubleValues( fileInput );
        }
        
        if (fileInput.hasNext())
            throw new BadDataException( "End of file expected!" );
    }
    
    public void readDoubleValues( Scanner fileInput ) throws BadDataException
    {
        if (!fileInput.hasNextDouble())
            throw new BadDataException( "Double data value expected!" );
        doubleNumbersList.add( fileInput.nextDouble() );
    }
    




    
}  //======= end class DataSetReader =======
