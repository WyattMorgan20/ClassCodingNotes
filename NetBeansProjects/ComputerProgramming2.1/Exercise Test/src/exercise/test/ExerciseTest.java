/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.test;

import java.util.Scanner;

/**
 *
 * @author s540549
 */
public class ExerciseTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(foo(3));
    }
    public static int foo(int n)
{
  if (n == 0) return 0;
  return (n*n) + foo(n-1);
}
    
}
