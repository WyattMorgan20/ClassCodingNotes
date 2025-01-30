/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwabstractckasses.pkg2;

/**
 *
 * @author s540549
 */
public abstract class Employee {
    private String firstName;
	private String lastName;
	private String SSN;
	
	public Employee(String firstNameIn, String lastNameIn,
		String SSNIn) 
	{
		firstName = firstNameIn;
		lastName = lastNameIn;
		SSN = SSNIn;
	}
	public Employee()
	{
		this("unknown", "unknown", "000000000");
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getSSN()
	{
		return SSN;
	}
	public void setFirstName(String firstNameIn)
	{
		firstName = firstNameIn;
	}
	public void setLastName(String lastNameIn)
	{
		lastName = lastNameIn;
	}
	public void setSSN(String SSNIn)
	{
		SSN = SSNIn;
	}
	public String getFullName() 
	{
		return lastName + ", " + firstName;
	}
	public String toString() 
	{
		return SSN + "   " + getFullName();
	}
        
        public abstract float estimateMonthlySalary();

}
