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
public class Truck extends Vehicle{
    private String bed;
    
    public Truck(String bed, int year, String make){
        super(year, make);
        this.bed = bed;
    }
    
    public void cargo(){
        System.out.println(super.toString() + "\nBed capacity: " + bed + " ton");
    }
}
