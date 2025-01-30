/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwpolymorphism.pkg2;

/**
 *
 * @author s540549
 */
public class MySquare extends MyRectangle{
    public void MySquare(){
        corner = 0.0;
        length = 0.0;
    }
    
    public void mySquare(Point cornerln, double lengthln){
        this.corner = cornerln;
        this.length = lengthln;
    }
    
    public void MySquare(double lengthln){
        corner = 0.0;
    }
    
    public void setWidth(double widthln){
        this.widthln = widthln;
    }
    
    public void setLength(double lengthln){
        this.lengthln = lengthln;
    }
    
    public String toString(){
        return "Corner: " + corner + "\nLength: " + width;
    }
        
}
