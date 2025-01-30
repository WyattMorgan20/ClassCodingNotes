/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml.daily.practice;

/**
 *
 * @author S540549
 */
public class UMLDailyPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] x = {"aa@gmail.com", "bb@gmail.com", "cc@gmail.com"};
        
        Email person1 = new Email("Bob", new Date(02, 03, 2004), "Hello", x);
        Email person2 = new Email("Phil", new Date(09, 25, 2001), "Sup", x);
        Email person3 = new Email("Joe", new Date(08, 29, 2008), "Howdy", x);
    }
    
}
