/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractexample;

/**
 *
 * @author DIANAR
 */
public abstract class Rectangle extends Figure {
    
        Rectangle(double a, double b) { 
            super(a, b); 
        } 
        
        public abstract double area();

}
