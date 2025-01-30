/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet.test;
import java.util.*;
/**
 *
 * @author s540549
 */
public class WorksheetTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5};
        sum(num, num.length);
    }
    
    public int sum(int num[], int n){
        if (n <= 0)
            return 0;
        return (sum(num, n - 1) + num[n - 1]);
    }
    
}
