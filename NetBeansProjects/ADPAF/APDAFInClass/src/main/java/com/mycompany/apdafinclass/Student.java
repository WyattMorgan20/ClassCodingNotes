/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apdafinclass;

/**
 *
 * @author s540549
 */
public class Student {

    private String name;
    private int age;
    private boolean grad;
    private double gpa;
    
    public Student(String name, int age, boolean grad, double gpa){
        this.name = name;
        this.age = age;
        this.grad = grad;
        this.gpa = gpa;
    }
    
    public void setGrad(boolean grad){
        this.grad = grad;
    }
    
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    
    public boolean getGrad(){
        return grad;
    }
    
    public double getGpa(){
        return gpa;
    }
    
    @Override
    public String toString(){
        return "Name: " + name + "\nAge: " + age + "\nGrad: " + grad + "\nGpa: " + gpa;
    }
    
    public static void updateArray(int[] arr){
        System.out.println("Updating Array...");
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] + 4;
            System.out.println(arr[i]);
        }
    }
    
    public static  void updateStuArr(Student[] stu){
        System.out.println("Updating stuArrays...");
        for(int i = 0; i < stu.length; i++){
            stu[i].age = stu[i].age + 3;
            System.out.println(stu[i]);
            System.out.println(" ");
        }
    }
    
    public static void main(String[] args) {
        int array1[] = {2, 4, 5, 6};
        Student std1 = new Student("Wyatt", 23, true, 3.5);
        Student std2 = new Student("Morgan", 22, false, 3.0);
        System.out.println("Student" + std1);
        
        System.out.println("Student1 name " + std1.name);
        System.out.println("Student1 age " + std1.age);
        System.out.println("Student1 grad " + std1.grad);
        System.out.println("Student1 gpa " + std1.gpa);
        
        System.out.println("-----------------------");
        System.out.println("Student2 info: " + "\n" + std2.name + "\n" + std2.age + "\n" + std2.grad + "\n" + std2.gpa);
        
        System.out.println("-----------------------");
        System.out.println("Student1 " + std1.toString());
        System.out.println("");
        System.out.println("Student2 " + std2.toString());
        
        System.out.println("-----------------------");
        Student std3 = new Student("Joseph", 20, true, 4.0);
        System.out.println("Student3 " + std3.toString());
        System.out.println(" ");
        std3.setGpa(3.2);
        std3.setGrad(false);
        System.out.println("Student3 " + std3.toString());
        
        System.out.println("-----------------------");
        //updating array
        System.out.println("Array Info:");
        for(int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }
        System.out.println(" ");
        updateArray(array1);
        
        System.out.println("-----------------------");
        Student[] stuArr1 = {std1, std2, std3};
        Student[] stuArr2 = new Student[3];
        Student[] stuArr3 = {new Student("Max", 20, true, 4.5),
                             new Student("Dejesus", 19, false, 2.0),
                             new Student("Drew", 24, false, 3.0)
        };
        
        updateStuArr(stuArr1);
        updateStuArr(stuArr3);
    }
}
