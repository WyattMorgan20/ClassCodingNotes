/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printf;

/**
 *
 * @author s540549
 */
public class Printf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("%7d\n", 22); //sout printf = format method. 7 for 7 spaces. "d" is for integer
        System.out.printf("%-7d\n", 22); //- sign to LEFT justify
        System.out.printf("%-7s\n", "Hi"); //"s" is for string
        System.out.printf("%7s\n", "Hi");
        System.out.printf("Hello %7s Programming %10d\n", "Hi", 22); //Multiple formats in one line
        System.out.printf("Hello %-7s Programming %-10d\n", "Hi", 22);
        System.out.printf("Round and Precision: %10.2f\n", 123.456789); //"f" is for float
        System.out.printf("Round and Precision: %010.2f\n", 123.456789); //leading 0 (in front of 10) to add 0s in front of output
        
    }
    
}
