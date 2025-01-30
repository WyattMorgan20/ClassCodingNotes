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
public class GeometricFigure {
    private Point corner;
    
    public void GeometricFigure(){
        .setCorner(0, 0);
    }
    
    public void GeometricFigure(Point cornerln){
        this.corner = cornerln;
    }
    
    public double area(){
        return 0.0;
    }
    
    public Point getCorner(){
        return corner;
    }
    
    public void setCorner(Point pointln){
        this.point = pointln;
    }
}


