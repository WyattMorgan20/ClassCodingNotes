/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailypractice;

/**
 *
 * @author s540549
 */
public class Date {
        private int month;
        private int day;
        private int year;
        
        public Date(int month, int day, int year){
            this.month = month;
            this.day = day;
            this.year = year;
        }
        
        public Date(){
            this(00, 00, 0000);
        }
        
        public String toString(){
            return month + "/" + day + "/" + year;
        }
}

