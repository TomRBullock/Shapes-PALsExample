/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShapesExample;
import java.awt.Color;
import java.lang.Math;
/**
 *
 * @author Dell
 */
public class Triangle extends Shapes{
    
    private double height;
    private double length;
    private double Hypo;
    
    
    public Triangle(Color c, double h, double l){
        super(c, "Triangle");
        this.height = h;
        this.length = l;
        this.Hypo = setHypo(h,l);
        
    }
    
    private double setHypo(double h, double l){
        return Math.hypot(h,l);        
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public double getLength(){
        return this.length;
    }
    
    public double getHypo(){
        return this.Hypo;
    }
    
    public double getArea(){
        return (this.height * this.length) / 2;
    }
}
