/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectorientedintro;

/**
 *
 * @author s540549
 */
public class SubDepartment extends Department{
    String sDeptName;
    
    public SubDepartment(String uniName, String deptName, String sDeptName){
        super(uniName, deptName);
        this.sDeptName = sDeptName;
        //System.out.println("Subdepartment");
    }
    
    @Override
    public String toString(){
        return super.toString() + ", " + sDeptName;
    }
    
    public void toString(String str){
        System.out.println(str);
    }
}
