/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexpressions;
import java.util.*;
import java.util.function.IntFunction;

/**
 *
 * @author s540549
 */
public class LambdaExpressions {
    
    public static ArrayList<Integer> map(IntFunction<Integer> f, Iterable<Integer> stuff){
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer val: stuff){
            result.add(e:f.apply(value:val));
        }
        return result;
    }
    public static void main(String[] args) {
        IntFunction<Integer> f = (int x) -> x*x;
        System.out.println(x: f.apply(value:10));
        ArrayList<Integer> data = new ArrayList<>();
        data.add(e: -1);
        data.add(e: 5);
        data.add(e: 0);
        data.add(e: 42);
        System.out.println(x:map((>x*x) -> {
        return null; //To change body of generated lambdas, choose Tools | Templates.
    } -, data));
    }
    
}
