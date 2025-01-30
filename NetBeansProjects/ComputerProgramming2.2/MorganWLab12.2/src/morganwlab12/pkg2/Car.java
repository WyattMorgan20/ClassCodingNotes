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
public class Car extends Vehicle{
    private double trunk;
    
    public Car(double trunk, int year, String make){
        super(year, make);
        this.trunk = trunk;
    }
            
    public void cargo(){
        System.out.println(super.toString() + "\nTrunk Space: " + trunk + " sq. ft.");
    }
}
