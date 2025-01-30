package classexample1.pkg2;

public class Computer {
    //Instance Variables
    private String os;
    private int serial;
    private String brand;
    
    //Contructors
    public Computer(String os, int serial, String brand){//Must match name of class for constructor
        this.os = os;
        this.serial = serial;
        this.brand = brand;
    }
    
    public Computer(){
        os = "";
        serial = 0;
        brand = "";
    }
    
    public void setOS(String os){
        this.os = os;
    }
    
    public String getOS(){
        return os;
    }

    /**
     * @return the serial
     */
    public int getSerial() {
        return serial;
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
