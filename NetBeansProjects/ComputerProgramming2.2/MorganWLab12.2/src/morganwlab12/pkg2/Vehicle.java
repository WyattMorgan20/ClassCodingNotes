/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab12.pkg2;

/**
 *
 * @author s540549
 */
public abstract class Vehicle {
    private int year;
    private String make;
    
    public Vehicle(int year, String make){
        this.year = year;
        this.make = make;
    }
    
    public abstract void cargo();
    
    public String toString(){
        return "Year: " + year + "\nMake: " + make;
    }
}
