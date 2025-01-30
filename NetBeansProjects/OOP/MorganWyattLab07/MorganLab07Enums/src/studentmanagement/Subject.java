/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package studentmanagement;

/**
 * Class: 44542-02 Object-Oriented Programming
 *
 * @author Wyatt Morgan 
 * Description: Lab 07 Enumerated Types
 * Due: 10/23/2024 
 * I pledge that I have completed the programming assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any other student and will not share this code with anyone under my
 * circumstances.
 */

/*
The subject class is an enum class for all of the different subjects.
*/
public enum Subject {
    // creating enums
    MATH("Mathematics"),
    ENGLISH("English"),
    PHYSICS("Physics"),
    CHEMISTRY("Chemistry"),
    COMPUTER_SCIENCE("Computer Science");
    
    // making string for enum arguments to be valid
    private final String displayName;
    
    // making the constructor not mad at displayName
    Subject(String displayName){
        this.displayName = displayName;
    }
    
    // allowing access to display name
    public String getDisplayName(){
        return displayName;
    }
}
