/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwlab11;

import java.util.ArrayList;

/**
 *
 * @author s540549
 */
public class MorganWLab11 {

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
        //Wyatt Morgan 4/4/2022
        
        //2. Create ArrayList here and add Bicycles
        ArrayList<Bicycle> bike = new ArrayList<>();
        bike.add(b1);
        bike.add(b2);
        bike.add(b3);
        bike.add(b4);
        bike.add(b5);
        bike.add(b6);
        bike.add(b7);
        bike.add(b8);
        bike.add(b9);
        bike.add(b10);
        
        
        //3. Loop through Bicycles, make instructed changes, print
        for(Bicycle x: bike){
            if(x instanceof MountainBike){
                ((MountainBike)x).setHeight(99);
                System.out.println("New Mountain Bike Info:");
            }
            
            if(x instanceof TandemBike){
                ((TandemBike)x).setBetweenSpace(88);
                System.out.println("New Tandem Bike Info:");
            }
            
            if(x instanceof RoadBike){
                ((RoadBike)x).setHandlebarType("NewType");
                System.out.println("New Road Bike Info:");
            }
            
            System.out.println(x + "\n");
        }
    }
    
}