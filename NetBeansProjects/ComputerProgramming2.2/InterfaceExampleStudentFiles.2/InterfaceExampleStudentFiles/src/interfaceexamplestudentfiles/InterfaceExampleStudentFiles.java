/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexamplestudentfiles;
import java.util.*;

/**
 *
 * @author dianar
 */
public class InterfaceExampleStudentFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Person> myPeople = new ArrayList<>();
        myPeople.add(new FullTimeEmployee("Joe", "Smith", 40000));
        myPeople.add(new Graduate("Bill", "Bob", 3.5, false));
        myPeople.add(new Professor("Jane", "Fox", 23000, "Professor"));
        myPeople.add(new TeachingAssistant(3000));
        
        for(Person p: myPeople){
            if(p instanceof Employee){
                System.out.println(((Employee)p).estimateMonthlySalary());
            }
        }
    }
    
}
