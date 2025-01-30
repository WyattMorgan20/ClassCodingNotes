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
// converting it to fit the bird's format.
public class Fish extends Animal {
    public Fish(String name, int age, double weight){
        super(name, age, "Fish", weight);
    }
    
    @Override
    public String makeSound(){
        return "Fish does not make sound.";
    }
    
    public void swim(){
        System.out.println("Fish is swimming.");
    }
    
    @Override
    public void eat(){
        System.out.println("Fish is eating flakes.");
    }
    
    @Override
    public void move(){
        System.out.println("Fish is swimming around");
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
}
