/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab8;

/**
 *
 * @author s540549
 */
public class MorganWLab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle oneRectangle = new Rectangle(4.0, 5.0);
        Rectangle twoRectangle = new Rectangle(2.5, 6.3);
        System.out.println("Rectangle 1 details: ");
        System.out.println(oneRectangle.toString());
        System.out.println(" ");
        System.out.println("The are of Rectangle 1 is: " + oneRectangle.getArea());
        System.out.println("The perimeter of Rectangle 1 is: " + oneRectangle.getPerimeter());
        System.out.println(" ");
        System.out.println("Rectangle 2 details: ");
        System.out.println(twoRectangle.toString());
        System.out.println(" ");
        System.out.println("The are of Rectangle 2 is: " + twoRectangle.getArea());
        System.out.println("The perimeter of Rectangle 2 is: " + twoRectangle.getPerimeter());
        System.out.println(" ");
        System.out.println("Changing rectangle 1 width to 7.0 ...");
        System.out.println(" ");
        oneRectangle.setWidth(7.0);
        System.out.println("Rectangle 1 details: ");
        System.out.println(oneRectangle.toString());
        System.out.println(" ");
        System.out.println("The area of the Rectangle 1 is: " + oneRectangle.getArea());
        System.out.println("The perimiter of Rectangle 1 is: " + oneRectangle.getPerimeter());
        
    }
    
}
