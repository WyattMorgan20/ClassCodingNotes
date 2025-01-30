/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractexample;

/**
 *
 * @author DIANAR
 */
public class Triangle extends Figure {
    
        Triangle(double a, double b) 
        { 
            super(a, b); 
        } 
        
        @Override
        public double area(){
            return dim1 * dim2 / 2;
        }
                
  
}
