/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwclasses02;

/**
 *
 * @author S540549
 */
public class MorganWClasses02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MusicCD music1 = new MusicCD("Bang", "AJR");
        MusicCD music2 = new MusicCD();
        
        music2.setTitle("Demons");
        System.out.println(music2.getTitle());
        
        music2.setArtist("Starset");
        System.out.println(music2.getArtist());
        
    }
    
}
