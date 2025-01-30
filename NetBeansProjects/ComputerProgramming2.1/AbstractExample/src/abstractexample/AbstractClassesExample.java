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
        //Figure f = new Figure(10, 10); = illegal
        Rectangle r = new Square(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure f;
        f = new Triangle(3, 6);
        System.out.println(f.area());
        
        ArrayList<Figure> list = new ArrayList<>();
        list.add(new Triangle(10, 8));
        list.add(new Triangle(3, 6));
        list.add(new Square(9, 5));
        
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).area());
        }
        
        for (Figure fig: list){
                System.out.println(fig.area());
        }
        

    }
}
