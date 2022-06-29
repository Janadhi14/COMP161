import javax.swing.*;
import java.awt.*;

/** Represents a tile. All instances of this class share the same width and height*/
public class Tile extends JPanel{

   private static int width = 200;
   private static int height = 200;
   private static int curveFactor = 3;
   
   private Color colour;
   
   public Tile(Color c){
      colour = c;
      setPreferredSize(new Dimension(width,height));
   }
   
   /** A method to set the colour of this tile.*/
   public void setColour(Color c){
      colour = c;
   }
   
   /** A method to set the width of all instances of Tile*/
   public static void setWidth(int w){
      width = w;
   }
   
   /** A method to set the height of all instances of Tile*/
   public static void setHeight(int h){
      height = h;
   }
   
   /** Paints the tile with a decorative pattern.*/
   public void paintComponent(Graphics g){

      g.setColor(colour);
      g.fillArc(-width/curveFactor, -height/curveFactor, 2*width/curveFactor, 2*height/curveFactor, 270, 90);
      g.fillArc(-width/curveFactor, height - height/curveFactor, 2*width/curveFactor, 2*height/curveFactor, 0, 90);
      g.fillArc(width - width/curveFactor, -height/curveFactor, 2*width/curveFactor, 2*height/curveFactor, 180, 90);
      g.fillArc(width - width/curveFactor, height - height/curveFactor, 2*width/curveFactor, 2*height/curveFactor,90, 90);
      g.fillRect(width/2 - 3, 0, 6, height);
      g.fillRect(0, height/2 - 3,  width, 6);
   }
}