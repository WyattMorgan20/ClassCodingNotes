/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritenceexample;

/**
 *
 * @author s540549
 */
public class HourlyEmployee extends Employee{
    private double hourlyRate;
    private int hrsWorked;
    
    public HourlyEmployee(String firstName, String lastName, String SSN, double hourlyRate, int hrsWorked){
        super(firstName, lastName, SSN);
        this.hourlyRate = hourlyRate;
        this.hrsWorked = hrsWorked;
    }

    /**
     * @return the hourlyRate
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * @param hourlyRate the hourlyRate to set
     */
    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * @return the hrsWorked
     */
    public int getHrsWorked() {
        return hrsWorked;
    }

    /**
     * @param hrsWorked the hrsWorked to set
     */
    public void setHrsWorked(int hrsWorked) {
        this.hrsWorked = hrsWorked;
    }
    
    public double calculateWeeklySalary(){
        return hrsWorked * hourlyRate;
    }
    
    public String tostring(){
        return super.toString() + " " + this.calculateWeeklySalary();
    }
    
    @Override
    public boolean equals(Object o){
        if (o instanceof HourlyEmployee)
            return super.equals(o) && this.hrsWorked == ((HourlyEmployee)o).hrsWorked;
        return false;
    }
}
