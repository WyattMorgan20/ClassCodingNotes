/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab10;


/**
 *
 * @author s540549
 */
public class MorganWLab10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Add your name and date here Wyatt Morgan
        
        //2. Create an instance of Refrigerator (fridgeA)
        Refrigerator fridgeA = new Refrigerator("Frigidaire", 567, 1200.00, true);
        //3. Create a second instance of Refrigerator (fridgeB)
        Refrigerator fridgeB = new Refrigerator("Maytag", 947, 1095, false);
        //4. Create an instance of Washer (washerA)
        Washer washerA = new Washer("Whirlpool", 9478, 99.00, "Medium");
        //5. Create a second instance of Washer (washerB)
        Washer washerB = new Washer("Maytag", 9529, 2499.00, "Extra Large");
        System.out.println("Refrigerator info:\n");
        
        //6. Print the info for fridgeA and fridgeB, with labels to match output
        //      (see lab instructions)
        System.out.println("FridgeA:");
        System.out.println("Brand: " + fridgeA.getBrand());
        System.out.println("Serial #:" + fridgeA.getSerialNo());
        System.out.println("Price  :  $" + fridgeA.getPrice());
        System.out.println("Has ice maker? " + fridgeA.getPrice());
        System.out.println(" ");
        System.out.println("FridgeB:");
        System.out.println("Brand: " + fridgeB.getBrand());
        System.out.println("Serial #:" + fridgeB.getSerialNo());
        System.out.println("Price  :  $" + fridgeB.getPrice());
        System.out.println("Has ice maker? " + fridgeB.hasIceMaker());
        System.out.println(" ");
        
        System.out.println("\nWasher info:\n");
        
        //7. Print the info for washerA and washerB, with labels to match output
        //      (see lab instructions)
        System.out.println("WasherA:");
        System.out.println("Brand: " + washerA.getBrand());
        System.out.println("Serial #: " + washerA.getSerialNo());
        System.out.println("Price: $" + washerA.getPrice());
        System.out.println("Washer capacity is " + washerA.getCapacity());
        System.out.println(" ");
        System.out.println("WasherB:");
        System.out.println("Brand: " + washerB.getBrand());
        System.out.println("Serial #: " + washerB.getSerialNo());
        System.out.println("Price: $" + washerB.getPrice());
        System.out.println("Washer capacity is " + washerB.getCapacity());
        System.out.println(" ");

    }
    
}
