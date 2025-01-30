package interfaceexamplestudentfiles;

/**
 *
 * @author merry
 */
public class TeachingAssistant extends Graduate implements Employee
{
	private double semesterStipend;

	public TeachingAssistant()
	{
		super();
		semesterStipend = 0.0;
	}

	public TeachingAssistant(double semesterStipend)
	{
		this.semesterStipend = semesterStipend;
	}

	public TeachingAssistant(String firstName, String lastName,
		double gpa, boolean admittedToCandidacy, double semesterStipend)
	{
		super(firstName, lastName, gpa, admittedToCandidacy);
		this.semesterStipend = semesterStipend;
	}
        
        @Override
        public double estimateMonthlySalary(){
            return semesterStipend / 4;
        }
        

}
