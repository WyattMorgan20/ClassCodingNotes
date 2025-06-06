/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package morgan_lab08inhyeritanceandpolymorphism;

/**
 * Class: 44542-02 Object-Oriented Programming
 *
 * @author Wyatt Morgan 
 * Description: Lab 08 Inheritance and Polymorphism
 * Due: 11/01/2024 
 * I pledge that I have completed the programming assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any other student and will not share this code with anyone under my
 * circumstances.
 */

// This is a subclass to Animal and takes in the framework animal proides
// converting it to fit the dog's format.
public class Dog extends Animal {
    
    public Dog(String name, int age, double weight){
        super(name, age, "Dog", weight);
    }
    
    @Override
    public String makeSound(){
        return "Dog barks.";
    }
    
    public void fetch(){
        System.out.println("Dog is fetching a ball.");
    }
    
    @Override
    public void eat(){
        System.out.println("Dog is eating dog food.");
    }
    
    @Override
    public void move(){
        System.out.println("Dog is running");
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
}
