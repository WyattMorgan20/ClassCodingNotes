/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganiostreams;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author s540549
 */
public class MorganIOStreams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names={"John","Peter","Susan","Kim","Jen"};
        Set<String> set1 = new HashSet<>(Arrays.asList(names));

        long startTime = System.currentTimeMillis();
        Object[] s= set1.parallelStream()
        .filter(e -> e.length()>3)
        .sorted().toArray();
        System.out.println(java.util.Arrays.toString(s));
        long endTime = System.currentTimeMillis();
        System.out.println("parallel execution filter first Sorted later is "+(endTime-startTime)+" milliseconds");
        
        System.out.println("\n___________________________________\n");
        
        long startTime2 = System.currentTimeMillis();
        Object[] s1= set1.parallelStream()
        .sorted().filter(e -> e.length()>3)
        .toArray();
        System.out.println(java.util.Arrays.toString(s1));
        long endTime2 = System.currentTimeMillis();
        System.out.println("parallel execution Sorted first Filter later is "+(endTime2-startTime2)+" milliseconds");
    }
}