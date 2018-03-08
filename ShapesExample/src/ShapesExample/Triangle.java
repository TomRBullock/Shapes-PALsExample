/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShapesExample;
import java.awt.Color;

/**
 *
 * @author Dell
 */
public class Triangle extends Shapes{
    
    private double height;
    private double length;
    private double angle;
    private double Hypo;
    
    /**
     * 
     * @param c
     * @param h
     * @param l
     * @param a 
     */
    public Triangle(Color c, double h, double l, double a){
        super(c, "Triangle");
        this.height = h;
        this.length = l;
        this.angle = a;
        this.Hypo = setHypo(h,l,a);
        
    }
    
    /**
     * 
     * @param h
     * @param l
     * @param a
     * @return 
     */
    private double setHypo(double h, double l,double a){
        double temp = Math.sqrt(Math.pow(h, 2) + Math.pow(l, 2) - 2 * h * l * Math.cos(a));
        return temp;        
    }
    /**
     * 
     * @return 
     */
    public double getHeight(){
        return this.height;
    }
    
    /**
     * 
     * @return 
     */
    public double getLength(){
        return this.length;
    }
    
    /**
     * 
     * @return 
     */
    public double getHypo(){
        return this.Hypo;
    }
    
    /**
     * 
     * @return 
     */
    public String printAngles(){
        String output;
        double[] anglevar = getAngles();
        output = ("Angle A = " + anglevar[0] + ". Angle B = " + anglevar[1] + ". Angle C = " + anglevar[2]);
        return output;
    }
    
    /**
     * 
     * @return 
     */
    public double[] getAngles(){
        double[] temp = new double[3];
        temp[0] = getAngleCalc(this.height,this.length,this.Hypo);
        temp[1] = getAngleCalc(this.length,this.Hypo,this.height);
        temp[2] = getAngleCalc(this.Hypo,this.height,this.length);
        
        return temp;
    }
    
    /**
     * 
     * @param a
     * @param b
     * @param c
     * @return 
     */
    private double getAngleCalc(double a, double b, double c){
        double temp = 0;
        
        //System.out.println(Math.cos((a*a) + (b*b) - (c*c)));
        
        temp = Math.acos((Math.pow(a, 2) - Math.pow(b, 2) - Math.pow(c, 2)) / (-2 * b * c));
        //System.out.println(Math.acos(temp) * (180/Math.PI));
        return temp * 180/Math.PI;
    }
    
    /**
     * 
     * @return 
     */
    public double getArea(){
        return (this.height * this.length) / 2;
    }
}
