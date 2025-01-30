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
public class Email {
    private String author;
    private Date date;
    private String subject;
    private String[] to;
    
    public Email(String author, Date date, String subject, String[] to){
        this.author = author;
        this.date = date;
        this.subject = subject;
        this.to = to;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public Date getDate(){
        return date;
    }
    
    public String getSubject(){
        return subject;
    }
    
    public void SetAuthor(String author){
        this.author = author;
    }
    
    public void setDate(Date date){
        this.date = date;
    }
    
    public void setSubject(String subject){
        this.subject = subject;
    }
    
    public String toString(){
        String addresses = "";
        for(String x: to){
            addresses = addresses + x + ";";
        }
        return"Author: " + author + "\n" + "Date: " + date + "\n" + "Subject: " + subject + "\n" + "To: " + addresses;
    }
}
