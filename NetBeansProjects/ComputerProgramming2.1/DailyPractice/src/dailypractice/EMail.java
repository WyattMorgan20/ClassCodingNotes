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
public class EMail{
        private String author;
        private Date date;
        private String subject;
        private String[] to;
        
        public EMail(String author, Date date, String subject, String[] to){
            this.author = author;
            this.date = date;
            this.subject = subject;
            this.to = to;
        }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
        
    public String toString(){
        String x = "";
        for (String b : to){
            x = x + b + ";";
        }
        return "Author: " + author + "\nDate: " + date + "\nSubject: " + subject + "\nTo: " + x;
    }    
    }