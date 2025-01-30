/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enum;

import javax.swing.Action;

/**
 *
 * @author s540549
 */
public class Student {
    private String name;
    private int age;
    
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void typeOfStudent(Education edu){
        switch (edu) {
            case UG:
                System.out.println("Student is Undergraduate and must complete PHD in order to be eligible for the position");
                break;
            case G:
                System.out.println("Student is graduate and must complete PHD in order to be eligible for the position");
                break;
            case PHD:
                System.out.println("Student is doctorate and eligible for the position");
                break;
        }
    }
}
