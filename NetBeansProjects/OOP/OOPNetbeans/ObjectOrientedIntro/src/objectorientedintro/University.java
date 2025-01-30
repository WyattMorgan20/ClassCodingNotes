/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectorientedintro;

/**
 *
 * @author s540549
 */
public class University {
    private String uniName;
    
    public University(String uniName){
        this.uniName = uniName;
        //System.out.println("University");
    }
    
    @Override
    public String toString(){
        return uniName;
    }
}
