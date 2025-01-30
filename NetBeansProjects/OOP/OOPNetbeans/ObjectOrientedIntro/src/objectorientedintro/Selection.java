/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectorientedintro;
import java.util.*;
/**
 *
 * @author s540549
 */
public class Selection {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input what semester it is: ");
        String sem = input.next();
        String semNew = sem.toLowerCase();
        
        //If Else
        if(semNew.equals("fall")){
            System.out.println("It is a fun semester");
        }
        else if(semNew.equals("spring")){
            System.out.println("It is a tough semester");
        }
        else if(semNew.equals("summer")){
            System.out.println("It is an ok semester");
        }
        else{
            System.out.println("Invalid input given...");
        }
        
        System.out.println("-----");
        
        //Switch
        switch(semNew){
            case "fall":
                System.out.println("It is a fun semester");
                break;
            case "spring":
                System.out.println("It is a tough semester");
                break;
            case "summer":
                System.out.println("It is an ok semester");
                break;
            default:
                System.out.println("Invalid input given...");
                break;
        }
    }    
}
