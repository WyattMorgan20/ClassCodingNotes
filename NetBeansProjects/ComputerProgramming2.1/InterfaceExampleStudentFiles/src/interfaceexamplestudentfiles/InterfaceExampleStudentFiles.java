/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexamplestudentfiles;

/**
 *
 * @author dianar
 */
import java.util.*;
import javax.swing.text.html.HTML;
public class InterfaceExampleStudentFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Person> myPeople = new ArrayList<Person>();
        myPeople.add(new FullTimeEmployee("joe", "smith", 400000));
        myPeople.add(new Professor("bill", "bob", 23000, "Professor"));
        myPeople.add(new Graduate("Jane", "Doe", 3.5, false));
        
        for (Person p: myPeople){
            if(p instanceof Graduate || p instanceof Professor){
                System.out.println(p.getFullName());
            }
        }
    
        ArrayList<TeachingAssistant> ta = new ArrayList<>();
        Graduate g = new Graduate(true);
        TeachingAssistant t = new TeachingAssistant();
        Undergraduate u = new Undergraduate();
        //System.out.println(((Graduate) t));
        //ta.add(new Graduate("Dan", "Connor", 3.5, true));
    }
    
}
