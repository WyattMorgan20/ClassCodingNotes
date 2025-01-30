/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectorientedintro;

/**
 *
 * @author s540549
 */
public class UniversityDriver {
    public static void main(String[] args){
        SubDepartment sDept = new SubDepartment("NWMSU", "CSIS", "ACS");
        System.out.println(sDept);
        
        Department dept = sDept;
        System.out.println(dept);
        
        University u = new Department("NWMSU", "CSIS");
        Department d = (Department) u;
        System.out.println(u);
        System.out.println(d);
    }
}
