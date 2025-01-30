/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectorientedintro;

/**
 *
 * @author s540549
 */
public class Amateur extends Exhibitor{
    private static final int PTS_NEEDED = 150;
    
    public Amateur(){
        super();
    }
    
    public Amateur(String lastName, String firstName, int yearOfBirth, int points){
        super(lastName, firstName, yearOfBirth, points);
    }
    
    @Override
    public boolean worldShowQualified(){
        if(super.getPoints() >= PTS_NEEDED){
            return true;
        }
        else{
            return false;
        }
    }
}
