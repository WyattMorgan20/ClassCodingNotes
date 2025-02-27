/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inclasspriorityqueue;

/**
 *
 * @author s540549
 */
public class Person implements Comparable<Person> {
    
    int priority;
    String name;
    
    public Person(int val, String data){
        priority = val;
        name = data;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(o.priority, this.priority);
    }
    
    public String toString(){
        return "Priority " + priority + " Name " + name;
    }
    
}
