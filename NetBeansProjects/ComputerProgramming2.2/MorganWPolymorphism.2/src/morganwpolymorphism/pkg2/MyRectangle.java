/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwpolymorphism.pkg2;

/**
 *
 * @author s540549
 */
public class MyRectangle extends GeometricFigure {
    private double length;
    private double width;
    
    public void MyRectangle(){
        corner = 0.0;
    }
    
    public void MyRectangle(Point cornerln, double lengthln, double widthln){
        this.corner = cornerln;
        this.length = lengthln;
        this.width = widthln;
    }
    
    public double area(){
        area = 0.0;
    }
    
    public double getLength(){
        return length;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setLength(double lengthln){
        this.lengthln = lengthln;
    }
    
    public void setWidth(double widthln){
        this.widthln = widthln;
    }
    
    public String toString(){
        return "Corner: " + corner + "\nLength: " + length + "\nWidth: " + width;
    }
}
