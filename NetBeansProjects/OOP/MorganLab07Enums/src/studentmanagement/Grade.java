/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
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
The Grade class is an enum class that has all grades and the score range they fit within
*/
public enum Grade {
    // creating enums
    A(90, 100),
    B(80, 89),
    C(70, 79),
    D(60, 69),
    F(0, 59);
    
    // making string for enum arguments to be valid
    private final int minScore;
    private final int maxScore;
    
    // making the constructor not mad at displayName
    Grade(int minScore, int maxScore){
        this.minScore = minScore;
        this.maxScore = maxScore;
    }
    
    // fromScore method to see if it is within range or not
    public static Grade fromScore(double score){
        for(Grade grade: Grade.values()){
            if(score >= grade.minScore && score <= grade.maxScore){
                return grade;
            }
        }
        return null;
    }
    
    // allowing access to display name
    public String getGradeRange(){
        return minScore + " - " + maxScore;
    }
}
