/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package morgan_lab09interfacesandabstractclasses;

import java.util.ArrayList;
import java.util.List;

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

// the BaseRestaurant class is the main framework for the 2 variations of it showing the layout of the menu,
// items being added to the order, and the output information of the order when necessary
public abstract class BaseRestaurant implements Restaurant{
    protected String restaurantName;
    protected String[] menuItems;
    protected double[] itemPrices;
    protected List<String> order = new ArrayList<>();
    //private ArrayList<String> order = new ArrayList<>();
    
    
    public BaseRestaurant(String restaurantName, String[] menuItems, double[] itemPrices){
        this.restaurantName = restaurantName;
        this.menuItems = menuItems;
        this.itemPrices = itemPrices;
    }
    
    // displays menu banner with desired formatting
    public void displayMenu(){
        System.out.println("***********************************************");
        System.out.println("Menu for " + restaurantName + ":");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.printf("%s - $%.2f%n", menuItems[i], itemPrices[i]);
        }
        System.out.println("***********************************************");
    }
    
    public abstract double calculateTotal();
    
    public abstract String getServiceType();
    
    @Override
    public void addItemToOrder(String itemName){
        order.add(itemName);
        System.out.println(itemName + " added to order.");
    }
    
    @Override
    public void displayOrderDetails(){
        System.out.println("Order Details:");
        for(String item : order){
            System.out.printf("Item                 :   %s%n", item);
        }
    }
}
