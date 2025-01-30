/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritenceexample;

/**
 *
 * @author s540549
 */
public class InheritenceExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp1 = new Employee("Bob", "Jones", "123");
        Employee emp2 = new Employee("Sue", "Smith", "123");
        HourlyEmployee hremp1 = new HourlyEmployee("Dan", "Connor", "123", 10, 41);
        HourlyEmployee hremp2 = new HourlyEmployee("Bill", "Ander", "123", 10, 41);
        
        System.out.println(emp1);
        System.out.println(hremp1);
        System.out.println(hremp2.getFullName());
        
        //isntanceof Operator
        System.out.println(emp1 instanceof Employee);
        System.out.println(emp1 instanceof HourlyEmployee);
        System.out.println("abc".equals("def"));
        System.out.println("abc".equals("abc"));
        
        //emp1 = emp2;
        System.out.println(emp1.equals(emp2));
        System.out.println(hremp1.equals(hremp2));
        System.out.println(emp1.equals(hremp1));
        System.out.println(hremp1.equals(emp1));
        
    }
    
}
