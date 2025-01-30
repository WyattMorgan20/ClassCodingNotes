package com.example.morganwprogram9;

public class Note {

    String title, description, tags;

    public Note(){
        
    }
    
    public Note(String title, String description, String tags){
        this.title = title;
        this.description = description;
        this.tags = tags;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public String getTags() {
        return tags;
    }
}
