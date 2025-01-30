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
public class Employee implements Comparable{
    private String name;
    private int id;
    
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
        return "Name: " + name + " ID: " + id;
    }
    
    public int compareTo(Object o){
        if(this.id < ((Employee)o).id){
            return -1;
        }
        else if(this.id > ((Employee)o).id){
            return 1;
        }
        else{
            return 0;
        }
    }
}
