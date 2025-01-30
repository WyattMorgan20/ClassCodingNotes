/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab8;

/**
 *
 * @author s540549
 */
public class Rectangle {
    private double length;
    private double width;
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getPerimeter(){
        return 2 * width + 2 * length;
    }
    
    public double getArea(){
        return length * width;
    }

    @Override
    public String toString() {
        return "Length: " + length + "\nwidth " + width;
    }
    
}
