/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwarraylist.pkg2;

import java.util.*;

/**
 *
 * @author s540549
 */
public class MorganWArrayList2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Sales> salesList = new ArrayList<>();
        salesList.add(new Sales("June", 3456, 55566.75));
        salesList.add(new Sales("Todd", 3444, 201.99));
        salesList.add(new Sales("Bev", 5555, 42301.00));
        
        salesList.get(1).setBalance(105.15);
        salesList.remove(0);
        
        for(Sales i: salesList){
            System.out.println(i.getCustomerName());
        }
        
        double sum = 0;
        
        for(int i=0; i<salesList.size(); i++){
            System.out.println("Name: " + salesList.get(i).getCustomerName() + 
                    " \nBalance: " + salesList.get(i).getBalance());
            sum+= salesList.get(i).getBalance();
        }
        
        System.out.println("The total Balance for all Sales objects is: " + sum);
    }
    
}
