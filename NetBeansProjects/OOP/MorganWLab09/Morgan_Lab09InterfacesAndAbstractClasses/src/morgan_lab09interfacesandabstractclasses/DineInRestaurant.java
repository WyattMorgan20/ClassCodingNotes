/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package morgan_lab09interfacesandabstractclasses;

/**
 * Class: 44542-02 Object-Oriented Programming
 *
 * @author Wyatt Morgan 
 * Description: Lab 09 Interfaces and Abstract Classes
 * Due: 11/06/2024 
 * I pledge that I have completed the programming assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any other student and will not share this code with anyone under my
 * circumstances.
 */

// DineInRestaurant is one of the restaurant options and it has tax.
// It is functionally the same as TakeawayRestaurant plus the tax
// It calculates the total of the order based on the user inputs and outputs
// the bill banner showing the total plus tax
public class DineInRestaurant extends BaseRestaurant {
    public DineInRestaurant(String restaurantName, String[] menuItems, double[] itemPrices){
        super(restaurantName, menuItems, itemPrices);
    }
    
    // calculates total for bill including tax
    @Override
    public double calculateTotal(){
        double total = 0.0;
        for(String item : order){
            for(int i = 0; i < menuItems.length; i++){
                if(item.equalsIgnoreCase(menuItems[i])){
                    total += itemPrices[i];
                }
            }
        }
        return total * 1.10;
    }
    
    // shows service type
    @Override
    public String getServiceType(){
        return "Dine-In";
    }
    
    // displays bill banner with desired formatting
    @Override
    public void generateBill(){
        System.out.println("***********************************************");
        System.out.println("**************** Bill Summary ****************");
        System.out.println("***********************************************");
        System.out.printf("Restaurant Type      :   %s%n", getServiceType());
        displayOrderDetails();
        System.out.printf("***********************************************%n");
        System.out.printf("Total (including 10%% service charge) : $%.2f%n", calculateTotal());
        System.out.println("***********************************************");
        System.out.println("Thank you for dining with us!");
        System.out.println("***********************************************");
    }
}
