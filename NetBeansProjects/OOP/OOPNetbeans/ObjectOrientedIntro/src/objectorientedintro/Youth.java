/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectorientedintro;

/**
 *
 * @author s540549
 */
public class Youth extends Exhibitor {

    private static final int PTS_NEEDED = 250;
    private static final int NUMBER_OF_EVENTS = 2;
    private int numEvents;
    
    public Youth(){
        super();
    }
    
    public Youth(String lastName, String firstName, int yearOfBirth, int points, int numEventsIn){
        super(lastName, firstName, yearOfBirth, points);
        numEvents = numEventsIn;
    }
    
    /**
     * @return the numEvents
     */
    public int getNumEvents() {
        return numEvents;
    }

    /**
     * @param numEvents the numEvents to set
     */
    public void setNumEvents(int numEvents) {
        this.numEvents = numEvents;
    }
    
    @Override
    public boolean worldShowQualified(){
        if(super.getPoints() >= PTS_NEEDED && numEvents >= NUMBER_OF_EVENTS){
            return true;
        }
        else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return super.toString() + " \nNumber of Events: " + numEvents;
    }
}
