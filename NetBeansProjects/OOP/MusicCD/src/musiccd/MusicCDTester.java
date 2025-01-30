/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musiccd;

/**
 *
 * @author s540549
 */
public class MusicCDTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Song 1
        MusicCD song1 = new MusicCD("Red Cold River", "Breaking Benjamin");
        System.out.println(song1);
        System.out.println("Song 1's Name is: " + song1.getTitle());
        System.out.println("Song 1's Artist is: " + song1.getArtist());
        
        System.out.println("-----");
        
        // Song 2
        MusicCD song2 = new MusicCD();
        song2.setArtist("Baby Metal");
        song2.setTitle("GJ!");
        System.out.println(song2);
        System.out.println("Song 2's Name is: "+ song2.getTitle());
        System.out.println("Song 2's Artist is: "+song2.getArtist());
        
    }
    
}
