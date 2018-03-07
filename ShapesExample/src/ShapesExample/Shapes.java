
package ShapesExample;
import java.awt.Color;

/**
 * 
 * @author TBullock
 */
public abstract class Shapes{
  
  private Color colour;
  private String Type;
  
/**
 * 
 * @param colour 
 */  
  public Shapes (Color colour, String Type){
      this.colour = colour;
      this.Type = Type;
  }
  
  /**
   * 
   * @return 
   */
  public abstract double getArea();
  
  public String getType(){
      return this.Type;
  }
  
  /**
   * 
   * @return 
   */
  public Color getColor(){
    return this.colour;
  }
  /**
   * 
   * @return 
   */
  public String toString(){ 
    return this.Type + " : colour: "+ this.colour + " area: "+getArea();
  }
}
