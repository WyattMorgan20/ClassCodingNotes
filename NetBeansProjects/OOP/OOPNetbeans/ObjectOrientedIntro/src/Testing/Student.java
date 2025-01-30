/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testing;

/**
 *
 * @author s540549
 */
public class Student {

    public static String getGrade(int score) {
        if (score < 0) {
            return "Error";
        } else if (score < 60) {
            return "F";
        } else if (score < 70) {
            return "D";
        } else if (score < 80) {
            return "C";
        } else if (score < 90) {
            return "B";
        } else if (score <= 100) {
            return "A";
        } else {
            return "Error";
        }
    }
}
