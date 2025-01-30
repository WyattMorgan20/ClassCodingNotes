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
public class Point {
    private double x;
    private double y;
    
    public void Point(){
        x = 0.0;
        y = 0.0;
    }
    
    public void Point(double xln, double yln){
        this.x = xln;
        this.y = yln;
    }
    
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
    
    
}
