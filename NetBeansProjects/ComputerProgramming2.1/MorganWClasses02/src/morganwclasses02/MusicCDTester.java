/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwclasses02;

/**
 *
 * @author s540549
 */
public class MusicCDTester {
    public static void main(String[] args){
        MusicCD test1 = new MusicCD("Snow", "White");
        System.out.println(test1);
        MusicCD test2 = new MusicCD();
        System.out.println(test2);
        System.out.println();
        System.out.println(test1.getArtist());
        System.out.println(test1.getTitle());
        test2.setArtist("YourMom");
        test2.setTitle("MusicCD");
    }
    
}
