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
public class MusicCD {
    String title;
    String artist;
    
    public MusicCD(String title, String artist){
        this.title = title;
        this.artist = artist;
    }
    
    public MusicCD(){
        
    }
    
    /**
     * @param title the title to set
     */
    public void setTitle(String title){
        this.title = title;
    }
    
    /**
     * @return the title
     */
    public String getTitle(String title){
        return title;
    }
    
    /**
     * @param artist the artist to set
     */
    public void setArtist(String artist){
        this.artist = title;
    }
    
    /**
     * @return the artist
     */
    public String getArtist(String artist){
        return artist;
    }
}
