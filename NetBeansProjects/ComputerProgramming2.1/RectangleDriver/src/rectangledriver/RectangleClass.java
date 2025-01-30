/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangledriver;

/**
 *
 * @author s540549
 */
public class RectangleClass {
    private double height;
    private double width;
    
    public RectangleClass(){
        this.width = 1.0;
        this.height = 1.0;
    }
    
    public RectangleClass(double theWidth, double theHeight){
        this.height = theHeight;
        this.width = theWidth;
    }

    /**
     * @return the length
     */
    public double getWidth() {
        return width;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    public double perimeter(){
        return height * 2 + width * 2;
    }
    
    public double area(){
        return height * width;
    }
}

    