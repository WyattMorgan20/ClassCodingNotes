/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparableinterface;

/**
 *
 * @author s540549
 */
public class HrlyEmp extends Employee implements Comparable{
    private int hrsWorked;
    
    public HrlyEmp(String name, int id, int hrsWorked){
        super(name, id);
        this.hrsWorked = hrsWorked;
    }
    
    public String toString(){
        return super.toString() + " " + hrsWorked;
    }
    
    public int compareTo(Object o){
        if(this.hrsWorked < ((HrlyEmp)o).hrsWorked){
            return -1;
        }
        else if(this.hrsWorked > ((HrlyEmp)o).hrsWorked){
            return 1;
        }
        else{
            return 0;
        }
    }
}
