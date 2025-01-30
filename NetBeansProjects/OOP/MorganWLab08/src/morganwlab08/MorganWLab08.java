/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab08;

/**
 *
 * @author s540549
 */
public class MorganWLab08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(4.0, 5.0);
        Rectangle rec2 = new Rectangle(2.5, 6.3);
        
        System.out.println("Rectangle 1 details:");
        System.out.println(rec1);
        System.out.println("");
        System.out.println("The area of Rectangle 1 is: " + rec1.area(rec1.getWidth(), rec1.getLength()));
        System.out.println("The perimeter of Rectangle 1 is " + rec1.perimeter(rec1.getWidth(), rec1.getLength()));
        
        System.out.println("");
        
        System.out.println("Rectangle 2 details:");
        System.out.println(rec2);
        System.out.println("");
        System.out.println("The area of Rectangle 2 is: " + rec2.area(rec2.getWidth(), rec2.getLength()));
        System.out.println("The perimeter of Rectangle 2 is " + rec2.perimeter(rec2.getWidth(), rec2.getLength()));
        
        System.out.println("");
        
        System.out.println("Changing Rectangle 1 to 7.0 ...");
        
        System.out.println("");
        rec1.setWidth(7.0);
        System.out.println("Rectangle 1 details:");
        System.out.println(rec1);
        System.out.println("");
        System.out.println("The area of Rectangle 1 is: " + rec1.area(rec1.getWidth(), rec1.getLength()));
        System.out.println("The perimeter of Rectangle 1 is " + rec1.perimeter( rec1.getWidth(), rec1.getLength()));
    }
    
}
