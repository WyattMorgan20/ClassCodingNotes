package interfaceexamplestudentfiles;

/*
 * @author merry
 * @version Feb 22, 2007
 */

public class Undergraduate extends AbstractStudent
{
	public Undergraduate()
	{
		super();
	}
	
	public Undergraduate(String firstName, String lastName, double gpa)
	{
		super(firstName, lastName, gpa);
	}
        
        @Override
        public String getFullName(){
            return getLastName() + ", " + getFirstName();
        }

}
