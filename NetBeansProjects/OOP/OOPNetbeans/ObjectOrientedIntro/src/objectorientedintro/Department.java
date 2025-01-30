/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectorientedintro;

/**
 *
 * @author s540549
 */
public class Department extends University{
    private String deptName;
    
    public Department(String uniName, String deptName){
        super(uniName);
        this.deptName = deptName;
        //System.out.println("Department");
    }
    
    @Override
    public String toString(){
        return super.toString() + ", " + deptName;
    }
}
