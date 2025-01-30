/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
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

// the Restaurant interface is the general blueprint that BaseRestaurant builds off of
// and supports the rest of the projects needs with that
public interface Restaurant {
    public void addItemToOrder(String itemName); // Adds an item to the order.
    
    public void generateBill(); // Calculates and displays the bill.
    
    public void displayOrderDetails(); // Displays the details of the current order.
}
