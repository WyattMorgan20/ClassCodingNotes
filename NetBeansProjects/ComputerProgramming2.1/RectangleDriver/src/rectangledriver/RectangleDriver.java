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
public class RectangleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectangleClass rec1 = new RectangleClass();
        RectangleClass rec2 = new RectangleClass(5, 4);
        System.out.println(rec1.getWidth());
        System.out.println(rec1.getHeight());
        System.out.println(rec2.area());
        System.out.println(rec2.perimeter());
    }
    
}
