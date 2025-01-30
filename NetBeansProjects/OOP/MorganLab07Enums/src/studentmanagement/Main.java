/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagement;

import java.util.Scanner;

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
The Main class takes inputs from the user and executes the associated classes/methods adding and updating Students
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating manager array with 10 available student inputs, and making scanner to read inputs from user
        StudentManager manager = new StudentManager(10);
        Scanner input = new Scanner(System.in);
        System.out.println("   Welcome to Student Manager   ");
        System.out.println("***********************************");
        
        // loop to keep system going until option 8, exit, is chosen
        while (true) {
            // setting up menu
            
            System.out.println("1. Add Student");
            System.out.println("2. Add All Subject Scores");
            System.out.println("3. Update Single Subject Score");
            System.out.println("4. Display All Students");
            System.out.println("5. Find Student by ID");
            System.out.println("6. Display Top Scoring Student");
            System.out.println("7. Display Average for Subject");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            
            // switch statement for each option
            switch (choice) {
                case 1:
                    // if they choose option 1
                    System.out.print("Enter Student ID: ");
                    int stuID1 = input.nextInt();

                    System.out.print("Enter Name: ");
                    input.nextLine(); // to fix a formatting issue
                    String stuName = input.nextLine();

                    System.out.print("Enter Age: ");
                    int stuAge = input.nextInt();

                    Student student1 = new Student(stuID1, stuName, stuAge);
                    manager.addStudent(student1);
                    break;

                case 2:
                    // if they choose option 2
                    System.out.print("Enter Student ID: ");
                    int stuID2 = input.nextInt();

                    System.out.print("Enter MATH Score: ");
                    double mathScore = input.nextDouble();

                    System.out.print("Enter ENGLISH Score: ");
                    double englishScore = input.nextDouble();

                    System.out.print("Enter PHYSICS Score: ");
                    double physicsScore = input.nextDouble();

                    System.out.print("Enter CHEMISTRY Score: ");
                    double chemistryScore = input.nextDouble();

                    System.out.print("Enter COMPUTER_SCIENCE Score: ");
                    double csScore = input.nextDouble();

                    manager.addAllSubjectScores(stuID2, mathScore, englishScore, physicsScore, chemistryScore, csScore);
                    System.out.println("All subject scores update for studet ID: " + stuID2);
                    break;

                case 3:
                    // if they choose option 3
                    System.out.print("Enter Student ID: ");
                    int stuID3 = input.nextInt();
                    Subject subject = Subject.values()[0];// placeholder subject

                    System.out.print("\nEnter Subject (MATH, ENGLISH, PHYSICS, CHEMISTRY, COMPUTER_SCIENCE): ");
                    input.nextLine(); // to fix a formatting issue
                    String tempSubject = input.nextLine();

                    if (tempSubject.equals("math")) {
                        subject = Subject.values()[0];
                    } else if (tempSubject.equals("english")) {
                        subject = Subject.values()[1];
                    } else if (tempSubject.equals("physics")) {
                        subject = Subject.values()[2];
                    } else if (tempSubject.equals("chemistry")) {
                        subject = Subject.values()[3];
                    } else if (tempSubject.equals("computer science")) {
                        subject = Subject.values()[4];
                    } else {
                        System.out.println("Invalid Subject...");
                    }

                    System.out.print("\nEnter Score: ");
                    double score = input.nextDouble();

                    manager.updateStudentScore(stuID3, subject, score);
                    System.out.println("Score update for " + subject.getDisplayName());
                    break;

                case 4:
                    // if they choose option 4
                    manager.displayAllStudents();
                    break;

                case 5:
                    // if they choose option 5
                    System.out.print("Enter Student ID: ");
                    int stuID5 = input.nextInt();

                    Student student5 = manager.findStudentById(stuID5);

                    if (student5 != null) {
                        student5.displayStudentDetails();
                    } else {
                        System.out.println("Student was not found...");
                    }
                    break;

                case 6:
                    // if they choose option 6
                    System.out.println("Top Scoring Student:");
                    manager.displayTopScoringStudent();
                    break;

                case 7:
                    // if they choose option 7
                    Subject subject7 = Subject.values()[0];// placeholder subject
                    System.out.print("\nEnter Subject (MATH, ENGLISH, PHYSICS, CHEMISTRY, COMPUTER_SCIENCE): ");
                    input.nextLine(); // to fix a formatting issue
                    String tempSubject7 = input.nextLine();

                    if (tempSubject7.equals("math")) {
                        subject7 = Subject.values()[0];
                    } else if (tempSubject7.equals("english")) {
                        subject7 = Subject.values()[1];
                    } else if (tempSubject7.equals("physics")) {
                        subject7 = Subject.values()[2];
                    } else if (tempSubject7.equals("chemistry")) {
                        subject7 = Subject.values()[3];
                    } else if (tempSubject7.equals("computer science")) {
                        subject7 = Subject.values()[4];
                    } else {
                        System.out.println("Invalid Subject...");
                    }

                    manager.displaySubjectAverage(subject7);
                    break;

                case 8:
                    // if they choose option 8
                    System.out.println("Exiting...");
                    return;

                default:
                    // if the input isn't 1-8
                    System.out.println("Invalid Input");
            }
        }
    }
}
