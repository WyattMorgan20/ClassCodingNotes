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
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    
    public Employee(String firstName, String lastName, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the ssn
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * @param ssn the ssn to set
     */
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
    public String getFullName(){
        return this.lastName + ", " + this.firstName;
    }
        
    @Override
    public String toString(){
        return this.getFullName() + " " + this.ssn;
    }
    
    @Override
    public boolean equals(Object o){
        if(o instanceof Employee)
               return this.ssn.equals(((Employee)o).ssn);
        else
            return false;
    }
}
