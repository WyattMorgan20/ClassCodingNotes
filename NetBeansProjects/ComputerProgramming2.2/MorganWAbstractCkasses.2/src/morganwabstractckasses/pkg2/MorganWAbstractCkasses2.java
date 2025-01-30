/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwabstractckasses.pkg2;

/**
 *
 * @author s540549
 */
public class MorganWAbstractCkasses2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp1 = new HourlyEmployee(
			"Midge", "McDonald", "000000001", 15.0f, 43);
		System.out.println(emp1);
		System.out.println(emp1.estimateMonthlySalary());
		
		Employee emp2 = new HourlyEmployee();
		System.out.println(emp2);
		System.out.println(emp2.estimateMonthlySalary());
		
		HourlyEmployee emp3 = new HourlyEmployee(
			"Gracie", "Sanders", "000000002", 12.5f, 35);
		System.out.println(emp3);
		System.out.println(emp3.estimateMonthlySalary());

    }
    
}
