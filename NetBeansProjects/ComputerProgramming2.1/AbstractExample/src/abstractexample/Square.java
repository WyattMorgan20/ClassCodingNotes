/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractexample;

/**
 *
 * @author s540549
 */
public class Square extends Rectangle {
    
    public Square(double a, double b)
    {
        super(a, b);
    }
    
    @Override
    public double area(){
        return dim1 * dim2;
    }
}
