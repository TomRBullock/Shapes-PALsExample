
package ShapesExample;
import java.awt.Color;

/**
 *
 * @author Dell
 */
public class ShapeTester {
   public static void main (String args[]){
        
        Circle c1 = new Circle(Color.orange,3.5);
        Circle c2 = new Circle (Color.black,66.7);
        
        System.out.println(c1.getType() + " : " + c1.getArea() + " : " + c1.getColor());
        System.out.println(c2.getType() + " : " + c2.getArea() + " : " + c2.getColor());
        
        Square s1 = new Square(Color.blue, 5);
        Square s2 = new Square(Color.gray, 2, 8);
        
        System.out.println(s1.getType() + " : " + s1.getArea() + " : " + s1.getColor());
        System.out.println(s2.getType() + " : " + s2.getArea() + " : " + s2.getColor());
        
        Triangle t1 = new Triangle(Color.PINK, 4.5,6,45);
        Triangle t2 = new Triangle(Color.WHITE, 3,4, 90);
        
        System.out.println(t1.getType() + " : " + t1.getArea() + " : " + t1.getColor() + " : " +t1.printAngles());
        System.out.println(t2.getType() + " : " + t2.getArea() + " : " + t2.getHypo() +" : " + t2.getColor() +" : " + t2.printAngles());
        
   }
}
