package morganwlab08;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s540549
 */
public class Rectangle {
    public double length;
    public double width;
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    public double getLength(){
        return length;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setLength(double length){
        this.length = length;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double perimeter(double width, double length){
        double perimeter = (length * 2) + (width * 2);
        return perimeter;
    }
    
    public double area(double width, double length){
        double area = width * length;
        return area;
    }
    
    public String toString(){
        return "Length: " + length + "\nWidth: " + width;
    }
    
}
