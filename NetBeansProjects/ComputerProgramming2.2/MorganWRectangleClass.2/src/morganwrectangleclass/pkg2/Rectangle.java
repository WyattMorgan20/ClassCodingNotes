/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwrectangleclass.pkg2;

/**
 *
 * @author s540549
 */
public class Rectangle {
    private double height;
    private double width;
    
    public Rectangle(){
        this.height = 1.0;
        this.width = 1.0;
    }
    public Rectangle(double theHeight, double theWidth){
        this.height = theHeight;
        this.width = theWidth;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double perimeter(double width, double height){
        double perimeter = (height * 2) + (width * 2);
        return perimeter;
    }
    
    public double area(double width, double height){
        double area = width * height;
        return area;
    }
}
