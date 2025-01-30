/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractexample;

/**
 *
 * @author DIANAR
 */
public abstract class Figure {
    
        double dim1; 
        double dim2; 
        
        Figure(double a, double b) { 
        dim1 = a; 
        dim2 = b; 
        } 
        
        public abstract double area();

}
