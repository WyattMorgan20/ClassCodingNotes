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

// the customer class holds the general methods required for the user to interact with
// the system and bind their order to a customerId
public class Customer {
    private String customerId;
    
    public Customer(String customerId){
        this.customerId = customerId;
    }
    
    public void placeOrder(Restaurant restaurant, String itemName){
        restaurant.addItemToOrder(itemName);
    }
    
    public void requestBill(Restaurant restaurant){
        restaurant.generateBill();
    }
}
