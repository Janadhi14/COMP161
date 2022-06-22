import java.awt.Point;
import java.text.DecimalFormat; // we want to format the distance betweent eh 2 points 

/** A class to create and manage Point objects*/
public class PointApp{
   public static void main(String[] args){
      Point point1 = new Point(4, 2);
      Point point2 = new Point(13, 8);
      System.out.println();
      System.out.println(); 
      DecimalFormat fmt = new DecimalFormat(); // making an instance 
      fmt.setMaximumFractionDigits(1); // specifying the format required 

      System.out.println("Distance between " + "(" + point1.getX() + ", " + point1.getY() + ")" + " and" +"(" + point2.getX() + ", " + point2.getY() + ")" + " is" + fmt.format(calcDistance(point1, point2)));
   }
   public static double calcDistance(Point p1, Point p2){
      return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
      }
}


//integration 