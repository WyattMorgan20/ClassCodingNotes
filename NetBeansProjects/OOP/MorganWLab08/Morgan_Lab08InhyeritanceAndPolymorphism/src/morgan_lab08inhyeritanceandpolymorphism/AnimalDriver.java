/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package morgan_lab08inhyeritanceandpolymorphism;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

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

// This class is the main driver class for the animals and accesses their information using polymorphism
// and uses it to make arraylists and outputs to show what the information is.
public class AnimalDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("animals.txt");
        Scanner input = new Scanner(file);
        ArrayList<Animal> animals = new ArrayList<>();
        
        while(input.hasNext()){
            String species = input.next();
            String name = input.next();
            int age = input.nextInt();
            double weight = input.nextDouble();
            
            switch(species){
                case "Dog":
                    animals.add(new Dog(name, age, weight));
                    break;
                case "Cat":
                    animals.add(new Cat(name, age, weight));
                    break;
                case "Bird":
                    animals.add(new Bird(name, age, weight));
                    break;
                case "Fish":
                    animals.add(new Fish(name, age, weight));
                    break;
            }
        }
        input.close();
        
        for(Animal animal : animals){
            System.out.println("Animal: " + animal.species);
            System.out.println(animal.toString());
            System.out.println(animal.makeSound());
            animal.eat();
            animal.move();
            
            if(animal instanceof Dog){
                ((Dog) animal).fetch();
            }
            else if(animal instanceof Cat){
                ((Cat) animal).climb();
            }
            else if(animal instanceof Bird){
                ((Bird) animal).fly();
            }
            else if(animal instanceof Fish){
                ((Fish) animal).swim();
            }
            System.out.println("-------------------------------------");
        }
        
        Animal heaviest = animals.stream().max((a, b) -> Double.compare(a.weight, b.weight)).orElse(null);
        if(heaviest != null){
            System.out.println("The heaviest animal is: Animal: " + heaviest.species);
        }
        
        ArrayList<String> sounds = new ArrayList<>();
        for(Animal animal : animals){
            sounds.add(animal.makeSound());
        }
        System.out.println("Animal Sounds: " + sounds);
    }
    
}
