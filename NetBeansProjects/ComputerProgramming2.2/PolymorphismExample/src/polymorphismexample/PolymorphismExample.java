/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismexample;
import java.util.*;

/**
 *
 * @author s540549
 */
public class PolymorphismExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp2 = new Employee("Sue", "Smith", "123");
        HourlyEmployee hremp1 = new HourlyEmployee("Dan", "Connor", "789", 10, 41);
        
        Employee emp3 = new HourlyEmployee("Bob", "Jones", "000", 15, 30);
        System.out.println(emp3);
        System.out.println("");
        
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(emp3);
        empList.add(new Employee("Bob", "Jones", "123"));
        empList.add(new Employee("Sue", "Smith", "123"));
        empList.add(new HourlyEmployee("Dan", "Connor", "789", 10, 41));
        empList.add(new HourlyEmployee("Bill", "Ander", "123", 10, 41));
        
        //Enhanced For Loop
        System.out.println("Here");
        for(Employee x: empList){
            System.out.println(x);
        }
        System.out.println("");
        
        int count = 0;
        double sum = 0;
        for(Employee x: empList){
            if(x instanceof HourlyEmployee){
                System.out.println(x);
                count ++;
                sum += ((HourlyEmployee) x).calculateWeeklySalary();
                
            }
        }
        System.out.println("");
        System.out.println("Avg: " + sum/count);
        System.out.println("");
        
        for(int i = 0; i<empList.size(); i++){
            System.out.println(empList.get(i).getFullName());
        }
    }
    
    
}
