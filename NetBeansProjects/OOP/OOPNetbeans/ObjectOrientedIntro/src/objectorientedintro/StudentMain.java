/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectorientedintro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author s540549
 */
public class StudentMain {

    public static void main(String[] args) {
        ArrayList<Student> firstStudent = new ArrayList<>();
        firstStudent.add(new Student("X", 12));
        firstStudent.add(new Student("Y", 5));
        firstStudent.add(new Student("Z", 23));
        firstStudent.add(new Student("A", 2));
        firstStudent.add(new Student("B", 80));

        System.out.println("Before Storing:");

        for (Student s : firstStudent) {
            System.out.println("Name: " + s.getName() + " Age: " + s.getAge());
        }

        Collections.sort(firstStudent);

        Collections.sort(firstStudent, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2){
                return -(s1.getAge() - s2.getAge());
            }
        });
        
        System.out.println("After sorting:");

        for (Student s : firstStudent) {
            System.out.println("Name: " + s.getName() + " Age: " + s.getAge());
        }
    }
}