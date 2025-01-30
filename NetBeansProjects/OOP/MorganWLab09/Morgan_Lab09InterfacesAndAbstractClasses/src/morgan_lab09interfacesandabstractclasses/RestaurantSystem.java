/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package morgan_lab09interfacesandabstractclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

// the main driver class that runs the program, dispays the welcome banner, 
// and houses the information about the restaurant objects and their contents
public class RestaurantSystem {
    
    public void run(List<Restaurant> restaurants){
        Scanner input = new Scanner(System.in);
        Customer customer = new Customer("C123");

        System.out.println("***********************************************");
        System.out.println("********** Welcome to Restaurant ***********");
        System.out.println("***********************************************");
        System.out.println("Select Restaurant Type:");
        System.out.println("1               : Dine-In");
        System.out.println("2               : Takeaway");
        System.out.println("***********************************************");
        System.out.print("Enter your choice: ");
        
        int choice = input.nextInt();
        input.nextLine();
        
        BaseRestaurant selectedRestaurant = (BaseRestaurant) restaurants.get(choice - 1);
        selectedRestaurant.displayMenu();
        
        String itemName;
        while(true){
            System.out.print("Enter item name to add to order or 'done' to finish: ");
            itemName = input.nextLine();
            if(itemName.equals("done")){
                break;
            }
            customer.placeOrder(selectedRestaurant, itemName);
        }
        
        customer.requestBill(selectedRestaurant);
        
        
    }
    
    public static void main(String[] args) {
        List<Restaurant> restaurants = new ArrayList<>();
        String[] menuItems = {"Pizza", "Burger", "Salad"};
        double[] itemPrices = {8.99, 5.99, 4.99};
        
        restaurants.add(new DineInRestaurant("Dine-In Delight", menuItems, itemPrices));
        restaurants.add(new TakeawayRestaurant("Quick Takeaway", menuItems, itemPrices));
        
        RestaurantSystem system = new RestaurantSystem();
        system.run(restaurants);
    }
    
}
