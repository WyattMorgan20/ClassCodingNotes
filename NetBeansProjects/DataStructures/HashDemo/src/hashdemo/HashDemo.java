/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;



/**
 *
 * @author s540549
 */
public class HashDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Alice: " + "Alice".hashCode());
        System.out.println("alice: " + "alice".hashCode());
        System.out.println("Bob: " + "Bob".hashCode());
        
        HashSet<String> myset = new HashSet<>();
        System.out.println(myset.add("Alice"));
        System.out.println(myset.add("Alice"));//returns wether or not the size of the set changes, which it doesn't
        System.out.println(myset);
        myset.add("alice");
        System.out.println(myset);
        myset.add("bob");
        System.out.println(myset);
        for(int i=0; i<10; i++){
            myset.add(""+i);
            System.out.println(myset);
        }
        for(String thing: myset){
            System.out.println(thing);
        }
        System.out.println(myset.contains("Bob"));
        System.out.println(myset.contains("bob"));
        myset.remove("bob");
        System.out.println(myset);
        System.out.println(myset.contains("bob"));
        
        System.out.println("HashMap");
        HashMap<String, Integer> mymap = new HashMap<>();
        mymap.put("color", 26439);
        mymap.put("age", 34);
        mymap.put("energy-level", -1);
        System.out.println(mymap);
        System.out.println(mymap.get("color"));
        System.out.println(mymap.containsKey("Why?"));
        System.out.println(mymap.containsKey("age"));//CHECK THIS FOR APPETIZER
        mymap.put("age", 33);
        System.out.println(mymap);
        HashMap<String, ArrayList<Integer>> multimap = new HashMap<>();
        multimap.put("grades", new ArrayList<>());
        multimap.get("grades").add(85);
        HashMap<Integer, String> invmap = new HashMap<>();
        invmap.put(26439, "color");//CHECK THIS FOR APPETIZER
        for(String key: mymap.keySet()){
            System.out.println(mymap.get(key));
        }
    }
    
}
