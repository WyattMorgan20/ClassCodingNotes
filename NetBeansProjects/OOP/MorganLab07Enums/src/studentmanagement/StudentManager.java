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
The StudentManager class manages all the differennt details relating to each student.
This includes student scores for each subject, displaying their information, and getting them based on their id
*/
public class StudentManager {
    // creating variables
    private Student[] students;
    private int totalStudents;
    
    // creating capacity
    public StudentManager(int capacity){
        students = new Student[capacity];
        totalStudents = 0;
    }
    
    // adding student to database
    public void addStudent(Student student){
        // checking to see if the array of students if full:
        if(totalStudents < students.length){
            students[totalStudents++] = student;
        }
        else{
            // if the array is full, output this:
            System.out.println("Student Capacity is Reached...");
        }
    }
    
    // finding a student by their id
    public Student findStudentById(int studentId){
        for(Student student : students){
            if(student != null && studentId == student.studentId){
                return student;
            }
        }
        
        return null;
    }
    
    // adding relavant values for grades to student based on their studentId
    public void addAllSubjectScores(int studentId, double mathScore, double englishScore, double physicsScore, double chemistryScore, double computerScienceScore){
        // figuring out which student to add to based on their id
        Student student = findStudentById(studentId);
        
        // seeing if the student object exists, and if it does, adding the designated scores
        if(student != null){
            student.addOrUpdateScore(Subject.MATH, mathScore);
            student.addOrUpdateScore(Subject.ENGLISH, englishScore);
            student.addOrUpdateScore(Subject.PHYSICS, physicsScore);
            student.addOrUpdateScore(Subject.CHEMISTRY, chemistryScore);
            student.addOrUpdateScore(Subject.COMPUTER_SCIENCE, computerScienceScore);
        }
    }
    
    // updating scores for students
    public void updateStudentScore(int studentId, Subject subject, double score){
        // figuring out which student to add to based on their id
        Student student = findStudentById(studentId);
        
        // seeing if the student object exists, and if it does, updating the designated scores
        if(student != null){
            student.addOrUpdateScore(subject, score);
        }
        else{
            System.out.println("Student couldn't be found");
        }
    }
    
    // displaying student information
    public void displayAllStudents(){
        // iterating through students, making sure the object exists, then outputting their information
        for(Student student: students){
            if(student != null){
                student.displayStudentDetails();
                System.out.println(" ");
            }
        }
    }
    
    // displaying the highest scoring students information
    public void displayTopScoringStudent(){
        if(totalStudents == 0){
            System.out.println("No students available");
        }
        
        // creating and initializing objects for a default highest score
        Student topStu = students[0];
        double topAvg = topStu.calculateAverageScore();
        
        // building off teh default values to find the highest average and student
        for(int i = 1; i < totalStudents; i++){
            if(students[i] != null){
                double avg = students[i].calculateAverageScore();
                if(avg > topAvg){
                    topStu = students[i];
                    topAvg = avg;
                }
            }
        }
        System.out.println("Top Scoring Student : ");
        topStu.displayStudentDetails();
    }
    
    // displaying the average for all subjects
    public void displaySubjectAverage(Subject subject){
        // creating variables and initializing them to create averages
        double total = 0;
        int subjectIndex = subject.ordinal();
        int studentCount = 0;
        
        // iterating through students and getting a total count of all students and their scores
        for(Student student: students){
            if(student != null && student.getScores()[subjectIndex] != 0){
                total += student.getScores()[subjectIndex];
                studentCount++;
            }
        }
        
        // checking if there are any students, and if there are, displaying the average for each subject
        if(studentCount == 0){
            System.out.println("No Scores available for " + subject.getDisplayName());
        }
        else{
            double avgScore = total / studentCount;
            System.out.println("Average Score for " + subject.getDisplayName() + ": " + avgScore);
        }
    }
}
