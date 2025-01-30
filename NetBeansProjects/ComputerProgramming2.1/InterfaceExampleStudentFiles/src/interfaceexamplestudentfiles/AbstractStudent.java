package interfaceexamplestudentfiles;

/*
 * @author merry
 * @version Feb 22, 2007
 */
public abstract class AbstractStudent implements Person
{
	private String firstName;
	private String lastName;
	private double gpa;

	public AbstractStudent(String firstName, String lastName,
		double gpa)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
	}

	public AbstractStudent()
	{
		this("", "", 0.0);
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public double getGpa()
	{
		return gpa;
	}

	public void setGpa(double gpa)
	{
		this.gpa = gpa;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	@Override
	public String toString()
	{
		return gpa + " " + firstName + " " + lastName;
	}
}
