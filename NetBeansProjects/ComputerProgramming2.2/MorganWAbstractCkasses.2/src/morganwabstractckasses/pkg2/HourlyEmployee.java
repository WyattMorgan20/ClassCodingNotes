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
public class HourlyEmployee extends Employee{
    private float hourlyRate;
	private int hrsWorked;

	public HourlyEmployee(String firstNameIn, 
		String lastNameIn, String SSNIn,
		float hourlyRateIn, int hrsWorkedIn)
	{
		super(firstNameIn, lastNameIn, SSNIn);
		hourlyRate = hourlyRateIn;
		hrsWorked = hrsWorkedIn;
	}
	public HourlyEmployee()
	{
		super();
		hourlyRate = 0.0f;
		hrsWorked = 0;
	}
	public float getHourlyRate()
	{
		return hourlyRate;
	}
	public int getHrsWorked()
	{
		return hrsWorked;
	}
	public void setHourlyRate(float hourlyRateIn)
	{
		hourlyRate = hourlyRateIn;
	}
	public void setHrsWorked(int hrsWorkedIn)
	{
		hrsWorked = hrsWorkedIn;
	}
	public float calculateWeeklySalary()
	{
		float overtime = 0.0f;
		if (hrsWorked >40)
		{
			overtime = (hrsWorked - 40f) * (0.5f * hourlyRate);
		}
		return overtime + hrsWorked * hourlyRate;
	}
	public String toString() 
	{
		return super.toString() + "  " + hrsWorked
			+ "  " + hourlyRate + " $" + calculateWeeklySalary();
	}
        
    @Override
        public float estimateMonthlySalary(){
           return calculateWeeklySalary() * 4;
        }

}
