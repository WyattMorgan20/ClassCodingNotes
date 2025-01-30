/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author s540549
 */
public class Point {
    private double x = 3.5;
    private double y = 4.0;
    
    public Point(){
        double point1 = 0.0;
        double point2 = 0.0;
        deFault = System.out.println("(" + point1 + ", " + point2 + ")");
    }
    
    public Point(double xln, double yln){
        
    }
    
    public String toString(){
        System.out.println("(" + x + ", " + y + ")"); 
    }
}
