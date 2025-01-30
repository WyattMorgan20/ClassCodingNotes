/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes2example;

/**
 *
 * @author s540549
 */
public class Classes2Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computer[] comArray = new Computer[3];
        
        compArray[0] = new Computer();
        compArray[1] = new Computer("Win", 123, "HP");
        compArray[2] = new Computer("IOS", 456, "Apple");
        
        for (Computer x : compArray){
            System.out.println(x);
        }
        //Arrays.sort(compArray);
        for(Computer x : compArray){
            System.out.println(x);
        } 
    }
    
    
    
}
