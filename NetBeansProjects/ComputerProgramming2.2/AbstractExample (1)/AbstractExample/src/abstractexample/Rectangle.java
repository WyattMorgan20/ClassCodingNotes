/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractexample;

/**
 *
 * @author DIANAR
 */
public class Rectangle extends Figure {
    
        Rectangle(double a, double b) { 
            super(a, b); 
        } 
        
        @Override
        public double area(){
            System.out.println("Inside Area for Rectangle");
            return dim1 * dim2;
        }

}
