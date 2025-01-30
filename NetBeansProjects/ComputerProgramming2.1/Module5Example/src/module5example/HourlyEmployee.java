/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module5example;

/**
 *
 * @author s540549
 */
public class HourlyEmployee extends Employee {
    private float hourlyRate;
    private int hrsWorked;
    
    public HourlyEmployee(String firstName, String lastName, String ssn, float hourlyRate, int hrsWorked){
        super(firstName, lastName, ssn);
        this.hourlyRate = hourlyRate;
        this.hrsWorked = hrsWorked;
    }
    public float calculateWeekSalary(){
        float overtime = 0.0f;
        if(getHrsWorked() > 40)
            overtime = (getHrsWorked() - 40) * (1.5f * getHourlyRate());
        return overtime + getHrsWorked() * getHourlyRate();
    }

    /**
     * @return the hourlyRate
     */
    public float getHourlyRate() {
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
    
    @Override
    public String toString(){
        return super.toString() + " " + this.calculateWeekSalary();
    }
    
    @Override
    public boolean equals(Object o){
        if(o instanceof HourlyEmployee){
            return super.equals(o) && this.hrsWorked == ((HourlyEmployee)o).hrsWorked;
        }
        else{
            return false;
        }
    }
}
