/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab12;

/**
 *
 * @author s540549
 */
public class MorganWLab12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car car1 = new Car(20.0, 2015, "Toyota");
        Truck truck1 = new Truck("1/2", 2019, "Ford");
        
        car1.cargo();
        System.out.println(" ");
        truck1.cargo();
    }
    
}
