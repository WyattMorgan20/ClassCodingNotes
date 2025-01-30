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
//this is the class
public class MusicCD {
    private String title;
    private String artist;
    
    //this is a constructor with 2 arguments
    public MusicCD(String title, String artist){
        this.title = title;
        this.artist = artist;
    }
    
    //this is a constructor with no arguments
    public MusicCD(){
        title = "MusicCD";
        artist = "Your Mom";
    }

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
    
}

