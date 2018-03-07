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
public class Square extends Shapes{
    
    private int width;
    private int length;
    
   /**
    * 
    * @param c
    * @param w 
    */
    public Square(Color c, int w){
        super(c, "Square");
        this.width = w;
        this.length = w;
    }
    
    /**
     * 
     * @param c
     * @param w
     * @param l 
     */
    public Square(Color c, int w, int l){
        super(c,"Square");
        this.width = w;
        this.length = l;
    }
    
        /**
        * 
        * @return 
        */
      public int getWidth(){
          return width;
      }
      
      /**
       * 
       * @return 
       */
      public int getlength(){
          return length;
      }

      /**
       * 
       * @return 
       */
      public double getArea(){
         return width * length;
      }
}
