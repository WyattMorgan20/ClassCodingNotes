/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab11;

/**
 *
 * @author CBADAMI
 */
import java.util.*;

public class Lab11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle b1 = new MountainBike(28,43,3,2);
        Bicycle b2 = new TandemBike(12,37,2,1);
        Bicycle b3 = new RoadBike("flat",40,1,1);
        Bicycle b4 = new RoadBike("dipped",38,1,2);
        Bicycle b5 = new TandemBike(14,35,3,3);
        Bicycle b6 = new MountainBike(32,44,2,2);
        Bicycle b7 = new RoadBike("flat",45,4,2);
        Bicycle b8 = new MountainBike(36,48,1,2);
        Bicycle b9 = new TandemBike(18,27,3,1);
        Bicycle b10 = new RoadBike("flat",56,5,3);
        
        //1. Add your name and date as a comment
        //Wyatt Morgan 4/5/2021
        //2. Create ArrayList here and add Bicycles
        ArrayList<Bicycle> Bike = new ArrayList<>();
        Bike.add(b1);
        Bike.add(b2);
        Bike.add(b3);
        Bike.add(b4);
        Bike.add(b5);
        Bike.add(b6);
        Bike.add(b7);
        Bike.add(b8);
        Bike.add(b9);
        Bike.add(b10);
        
        //3. Loop through Bicycles, make instructed changes, print
        for (Bicycle b: Bike){
            if (b instanceof MountainBike){
                ((MountainBike) b).setHeight(99);
                System.out.println("New Mountain Bike info");
            }
                
            if (b instanceof TandemBike){
                ((TandemBike) b).setBetweenSpace(88);
                System.out.println("New TandemBike info");
            }
            
            if (b instanceof RoadBike){
                ((RoadBike) b).setHandlebarType("NewType");
                System.out.println("New Road Bike info");
            }
                
         
            System.out.println(b + "\n");
            
        }
    }
    
}
