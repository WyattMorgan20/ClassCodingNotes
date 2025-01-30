/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparableexample;
import java.util.*;
/**
 *
 * @author s540549
 */
public class ComparableExample {

    public static void main(String[] args) {
        Employee[] list = new Employee[7];
        list[0] = new Employee("Alex", 333);
        list[1] = new Employee("Alex", 111);
        list[2] = new Employee("Alex", 222);
        list[3] = new Employee("Alex", 444);
        list[0] = new HourlyEmployee("Alex", 000, 24);
        list[0] = new HourlyEmployee("Alex", 444, 12);
        list[0] = new HourlyEmployee("Alex", 444, 5);
        
        Arrays.sort(list);
        
        for(Employee e: list)
            System.out.println(e);
    }
    
}
