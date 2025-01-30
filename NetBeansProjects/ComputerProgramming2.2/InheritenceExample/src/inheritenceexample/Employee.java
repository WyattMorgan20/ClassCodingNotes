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
public class Employee {
    private String firstName;
    private String lastName;
    private String SSN;
    
    public Employee(String firstName, String lastName, String SSN){
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
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
     * @return the SSN
     */
    public String getSSN() {
        return SSN;
    }

    /**
     * @param SSN the SSN to set
     */
    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
    
    public String getFullName(){
        return lastName + ", " + firstName;
    }
    
    public String toString(){
        return this.getFullName() + " " + this.SSN;
    }
    
    @Override
    public boolean equals(Object o){
        if (o instanceof Employee)
            return this.SSN.equals(((Employee)o).SSN);
        return false;
    }
}
