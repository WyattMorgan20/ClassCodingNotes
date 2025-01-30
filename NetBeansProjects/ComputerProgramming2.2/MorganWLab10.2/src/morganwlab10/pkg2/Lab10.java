/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author s540549
 */
public class Lab10
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Add your name and date here Wyatt         
        //2. Create an instance of Refrigerator (fridgeA)
        Refrigerator fridgeA = new Refrigerator("Frigidaire", 567, 1200.00, true);
        //3. Create a second instance of Refrigerator (fridgeB)
        Refrigerator fridgeB = new Refrigerator("Maytag", 947, 1095.00, false);
        //4. Create an instance of Washer (washerA)
        Washer washerA = new Washer("Whirlpool", 3478, 999.00, "Medium");
        //5. Create a second instance of Washer (washerB)
        Washer washerB = new Washer("Maytag", 4529, 2499.00, "Extra Large");
        
        System.out.println("Refrigerator info:\n");
        
        //6. Print the info for fridgeA and fridgeB, with labels to match output
        //      (see lab instructions)
        System.out.println("FridgeA:");
        System.out.println("Brand: " + fridgeA.getBrand() + "\nSerial #: " + fridgeA.getSerialNo() + "\nPrice: $" + fridgeA.getPrice() + "\nHas ice maker? " + fridgeA.hasIceMaker());
        System.out.println("");
        System.out.println("FridgeB:");
        System.out.println("Brand: " + fridgeB.getBrand() + "\nSerial #: " + fridgeB.getSerialNo() + "\nPrice: $" + fridgeB.getPrice() + "\nHas ice maker? " + fridgeB.hasIceMaker());
        System.out.println("");
        
        System.out.println("\nWasher info:\n");
        
        //7. Print the info for washerA and washerB, with labels to match output
        //      (see lab instructions)
        System.out.println("WasherA:");
        System.out.println("Brand: " + washerA.getBrand() + "\nSerial #: " + washerA.getSerialNo() + "\nPrice: $" + washerA.getPrice() + "\nWasher capacity is " + washerA.getCapacity());
        System.out.println("");
        System.out.println("WasherB:");
        System.out.println("Brand: " + washerB.getBrand() + "\nSerial #: " + washerB.getSerialNo() + "\nPrice: $" + washerB.getPrice() + "\nWasher capacisty is  " + washerB.getCapacity());
        

    }
    
}
