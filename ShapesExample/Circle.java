
package ShapesExample;
import java.awt.Color;


/**
 *
 * @author Dell
 */
public class Circle extends Shapes{
    
  private double radius;
  
  /**
   *Create a circle with radius r
   */
  public Circle(Color c, double r){
    super(c, "circle");
    radius = r;
  }
  
  /**
   *get the area of this circle as a double
   */
  public double getArea(){
    return (Math.PI * (radius*radius));
  }

  
  /**
   *Get the radius as a double
   */
  public double getRadius(){
    return radius;
  }
}