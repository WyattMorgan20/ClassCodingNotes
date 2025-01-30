/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musiccd;

/**
 *
 * @author s540549
 */
public class MusicCD {
    // Attributes of MusicCD
    private String title;
    private String artist;
    
    // All of the following are the getters and setters for title and artist:
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @param artist the artist to set
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }
    // End of getters and setters ^
    
    // Constructor with 2 parameters (one for each attribute)
    public MusicCD(String titleIn, String artistIn){
        title = titleIn;
        artist = artistIn;
    }
    
    // No argument constructor
    public MusicCD(){
        title = "";
        artist = "";
    }
    
    public String toString(){
        return "Title: " + title + "\nArtist: " + artist;
    }
}
