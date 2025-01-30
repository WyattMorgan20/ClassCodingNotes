/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classexample;

/**
 *
 * @author s540549
 */
public class ClassExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computer comp1 = new Computer("Win", 123, "HP");
        Computer comp2 = new Computer("Lin", 456, "Mac");
        Computer comp3 = new Computer();
        
        System.out.println(comp1.getOs());
        System.out.println(comp2.getOs());
        
        comp3.setBrand("Apple");
        
        comp2.setOs("Android");
        System.out.println(comp2.getOs());
        System.out.println(comp1);
        System.out.println(comp3);
        
        //Array of Computer objects
        String[] x = {"Bob", "Jane"};
        Computer[] compArr = {comp1, comp2, comp3};
        System.out.println(compArr[1]);
        comp2.setBrand("Pickle");
        System.out.println(compArr[1]);
        
        //Computer compArray2 = new Computer [3];
    }
    
}
