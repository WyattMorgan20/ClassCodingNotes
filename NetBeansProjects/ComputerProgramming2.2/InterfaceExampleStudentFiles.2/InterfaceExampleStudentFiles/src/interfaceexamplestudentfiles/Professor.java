package interfaceexamplestudentfiles;

/**
 *
 * @author merry
 */
public class Professor extends FullTimeEmployee
{
	private String rank;

	public Professor()
	{
		super();
		rank = "";
	}

	public Professor(String firstName, String lastName,
		double annualSalary, String rank)
	{
		super(firstName, lastName, annualSalary);
		this.rank = rank;
	}

	public Professor(String rank)
	{
		this.rank = rank;
	}
}
