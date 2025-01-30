/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement;

/**
 * Class: 44542-02 Object-Oriented Programming
 *
 * @author Wyatt Morgan 
 * Description: Lab 07 Enumerated Types
 * Due: 10/23/2024 
 * I pledge that I have completed the programming assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any other student and will not share this code with anyone under my
 * circumstances.
 */

/*
The Student class houses all of the student information. It contains the blueprint to create
multiple students and maintains their inputted scores and grades within it.
It also has the format for outputting their information when called upon.
*/
public class Student {

    // creating variables
    int studentId;
    private String name;
    private int age;
    private double[] scores;
    private Grade[] grades;
    
    // start of getters and setters:
    /**
     * @return the studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the scores
     */
    public double[] getScores() {
        return scores;
    }

    /**
     * @param scores the scores to set
     */
    public void setScores(double[] scores) {
        this.scores = scores;
    }

    /**
     * @return the grades
     */
    public Grade[] getGrades() {
        return grades;
    }

    /**
     * @param grades the grades to set
     */
    public void setGrades(Grade[] grades) {
        this.grades = grades;
    }
    // end of getters and setters^
    
    // constructor with variables initialized
    public Student(int studentId, String name, int age){
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        
        // setting scores and grades equal to the values of Subject
        this.scores = new double[Subject.values().length];
        this.grades = new Grade[Subject.values().length];
    }
    
    public void addOrUpdateScore(Subject subject, double score){
        int index = subject.ordinal();
        getScores()[index] = score;
        getGrades()[index] = calculateGrade(score);
    }
    
    public Grade calculateGrade(double score){
        return Grade.fromScore(score);
    }
    
    public double calculateAverageScore(){
        double sum = 0;
        for(double score: getScores()){
            sum += score;
        }
        
        return sum/getScores().length;
    }
    
    public void displayStudentDetails(){
        System.out.println("********************************************");
        System.out.println("************** Student Report **************");
        System.out.println("********************************************");
        System.out.println("Student ID : " + studentId);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        for(int i = 0; i < scores.length; i++){
            System.out.println(Subject.values()[i].getDisplayName() + " : " + scores[i] + " " +  grades[i]);
        }
        System.out.println("********************************************");
        System.out.println("Average Score : " + calculateAverageScore());
        System.out.println("********************************************");
    }
}
