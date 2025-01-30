/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classexample;

/**
 *
 * @author s540549
 */
public class Computer {
    //Instance Variables
    private String os;
    private int serial;
    private String brand;
    
    //Constructor
    public Computer(String osIn, int serialIn, String brandIn){
        os = osIn;
        serial = serialIn;
        brand = brandIn;
    }
    public Computer(){
        os = "";
        serial = 000;
        brand = "";
    }
    
    //Methods
    public String getOs(){
        return os;
    }
    public void setOs(String os){
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
    
    public String toString(){
        return "OS: " + os + "\nSerial: " + serial + "\nBrand: " + brand;
    }
}
