/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwrectangleclass.pkg2;

/**
 *
 * @author s540549
 */
public class MorganWRectangleClass2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle(4, 5);
        
        System.out.println("Rectangle 1 details:");
        System.out.println(rec1.getWidth());
        System.out.println(rec1.getHeight());
        
        System.out.println("");
        
        System.out.println("Rectangle 2 details:");
        System.out.println("The area of Rectangle 2 is: " + rec2.area(rec2.getWidth(), rec2.getHeight()));
        System.out.println("The perimeter of Rectangle 2 is " + rec2.perimeter(rec2.getWidth(), rec2.getHeight()));
    }
}