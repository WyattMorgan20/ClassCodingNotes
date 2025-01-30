/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml.daily.practice;

/**
 *
 * @author S540549
 */
public class Date {
    int month;
    int day;
    int year;
    
    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    public Date(){
        month = 00;
        day = 00;
        year = 0000;
    }
    
    public String toString(){
        return month + "/" + day + "/" + year;
    }
    
}
