/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes2example;

/**
 *
 * @author s540549
 */
public class Computer {
    private String os;
    private int serial;
    private String brand;
    
    public Computer(String os, int serial, String brand){
        this.os = os;
        this.serial = serial;
        this.brand = brand;
        
    }
    public Computer(){
        this("", 000, "");
        
    }

    /**
     * @return the os
     */
    public String getOs() {
        return os;
    }

    /**
     * @param os the os to set
     */
    public void setOs(String os) {
        this.os = os;
    }

    /**
     * @return the serial
     */
    public int getSerial() {
        return serial;
    }

    /**
     * @param serial the serial to set
     */
    public void setSerial(int serial) {
        this.serial = serial;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    @Override
    public String toString(){
        return "OS: " + os + "\nSerial: " + serial + "\nBrand: " + brand;
    }
}
