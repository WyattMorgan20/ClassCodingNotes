/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enum;

/**
 *
 * @author s540549
 */
public class Main {
    public static void main(String[] args){
        StudentEducation underGrad = StudentEducation.UG;
        StudentEducation graduate = StudentEducation.G;
        StudentEducation doctorate = StudentEducation.PHD;
        StudentEducation special = StudentEducation.SPECIAL;
        
        System.out.println(graduate.name());
        System.out.println(graduate);
        System.out.println(graduate.ordinal());
        
        System.out.println("------");
        
        System.out.println(StudentEducation.UG);
        System.out.println(underGrad);
        System.out.println(StudentEducation.UG.ordinal());
        
        StudentEducation s;
        String program = "UG";
        switch(program){
            case "UG":
                s = StudentEducation.UG;
                break;
            case "G":
                s = StudentEducation.G;
                break;
            case "PHD":
                s = StudentEducation.PHD;
                break;
            case "SPECIAL":
                s = StudentEducation.SPECIAL;
                break;
            default:
                s = StudentEducation.UG;
        }
        
        Student s1 = new Student("Wyatt", 23);
        Student s2 = new Student("Joseph", 22);
        Student s3 = new Student("Morgan", 21);
        
        s1.typeOfStudent(Education.UG);
        s2.typeOfStudent(Education.G);
        s3.typeOfStudent(Education.PHD);
        
//        switch(s){
//            case StudentEducation.UG:
//                break;
//            case StudentEducation.G:
//                break;
//            case StudentEducation.PHD:
//                break;
//            case StudentEducation.SPECIAL:
//                break;
//        }
    }
}
