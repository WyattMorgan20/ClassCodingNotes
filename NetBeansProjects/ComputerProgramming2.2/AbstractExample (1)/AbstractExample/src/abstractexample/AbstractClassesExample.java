/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractexample;
import java.util.*;
/**
 *
 * @author DIANAR
 */
public class AbstractClassesExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Figure f = new Figure(10, 10); //this is NOT ok
        
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure f1 = new Triangle(3, 6);
        
        ArrayList<Figure> list = new ArrayList<>();
        list.add(new Rectangle(9, 5));
        list.add(new Triangle(10, 8));
        list.add(new Triangle(3, 6));
        
        for(Figure f: list){
            System.out.println(f.area());
        }
    }
}
