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

// This is the super class to all of the animals and has the framework for how
// the subclasses are formatted and what information they take in/make.
public class Animal {
    protected String name;
    protected int age;
    protected String species;
    protected double weight;
    
    public Animal(String name, int age, String species, double weight){
        this.name = name;
        this.age = age;
        this.species = species;
        this.weight = weight;
    }
    
    public String makeSound(){
        return "This animal makes a sound.";
    }
    
    public void eat(){
        System.out.println("The animal is eating.");
    }
    
    public void move(){
        System.out.println("The animal is moving.");
    }
    
    @Override
    public String toString(){
        return "Name: " + name + ", Age: " + age + ", Weight: " + weight + "kg";
    }
}
