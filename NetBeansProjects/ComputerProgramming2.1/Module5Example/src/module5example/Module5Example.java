/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module5example;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author s540549
 */
public class Module5Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp1 = new Employee("Bob", "Jones", "123");
        Employee emp2 = new Employee("Sue", "Smith", "456");
        Employee emp3 = new Employee("Dan", "Connor", "123");
        HourlyEmployee hremp1 = new HourlyEmployee("Dan", "Connor", "123", 10, 41);
        HourlyEmployee hremp2 = new HourlyEmployee("Mo", "Bamba", "902", 10, 50);
        HourlyEmployee hremp3 = new HourlyEmployee("Tu", "Madre", "6942", 10, 50);
        
        System.out.println(emp1.equals(emp3));
        System.out.println(emp2.equals(emp1));
        System.out.println(emp3.equals(emp2));
        System.out.println(hremp2);
        System.out.println(hremp2.equals(hremp1));
        System.out.println(hremp2.equals(emp3));
        System.out.println(hremp1.equals(hremp3));
        
        ArrayList <Employee> temp = new ArrayList<>();
        Employee e = new HourlyEmployee("Mo", "Bamba", "902", 10, 40);
        System.out.println(((HourlyEmployee)e).calculateWeekSalary());
        
        temp.add(new Employee("Bob", "Jones", "123"));
        temp.add(new Employee("Sue", "Smith", "456"));
        temp.add(new Employee("Dan", "Connor", "123"));
        temp.add(new HourlyEmployee("Dan", "Connor", "123", 10, 41));
        temp.add(new HourlyEmployee("Mo", "Bamba", "902", 10, 50));
        temp.add(new HourlyEmployee("Tu", "Madre", "6942", 10, 50));
        
        for(Employee x: temp){
            if(x instanceof HourlyEmployee)
                System.out.println(((HourlyEmployee) x).calculateWeekSalary());
            else
                System.out.println(x);
        }
        
        for(int i=0; i<temp.size(); i++){
            System.out.println(temp.get(i));
        }
    }
    
}
