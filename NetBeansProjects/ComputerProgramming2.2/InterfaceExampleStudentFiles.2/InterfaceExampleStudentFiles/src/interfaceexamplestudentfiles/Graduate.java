package interfaceexamplestudentfiles;

/*
 * @author merry
 * @version Feb 22, 2007
 */
public class Graduate extends AbstractStudent
{
	private boolean admittedToCandidacy;

	public Graduate(String firstName, String lastName, double gpa,
		boolean admittedToCandidacy)
	{
		super(firstName, lastName, gpa);
		this.admittedToCandidacy = admittedToCandidacy;
	}

	public Graduate(boolean admittedToCandidacy)
	{
		super();
		this.admittedToCandidacy = admittedToCandidacy;
	}

	public Graduate()
	{
		super();
		admittedToCandidacy = false;
	}

	public boolean isAdmittedToCandidacy()
	{
		return admittedToCandidacy;
	}

	public void setAdmittedToCandidacy(boolean admittedToCandidacy)
	{
		this.admittedToCandidacy = admittedToCandidacy;
	}

	@Override
	public String toString()
	{
		return super.toString() + " " + admittedToCandidacy;
	}
        
        @Override
        public String getFullName(){
            return getFirstName() + " " + getLastName();
        }

}
