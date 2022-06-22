import javax.swing.*;
import java.awt.*;


/** Creates numerous instances of Tile which are added to the JFrame's content pane*/
public class TileApp{


   public static void main(String[]args){
      JFrame frame = new JFrame("Mosaic"); 
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      frame.setLayout(new FlowLayout());
      frame.setSize(1000, 1000);
      Tile.setWidth(250);
      Tile.setHeight(200);
      
      Color colour1 = new Color(30,144,255);//dodgerblue
      Color colour2 = new Color(100, 149, 237);//cornflowerblue
      Color colour3 = new Color(65,105,225);//royal
      Color colour4 = new Color(0, 0, 205);//mediumblue

      frame.getContentPane().add (new Tile(colour1));
      frame.getContentPane().add (new Tile(colour2));
      frame.getContentPane().add (new Tile(colour3));
      frame.getContentPane().add (new Tile(colour4));
      frame.getContentPane().add (new Tile(colour1));
      frame.getContentPane().add (new Tile(colour2));
      frame.getContentPane().add (new Tile(colour3));
      frame.getContentPane().add (new Tile(colour4));  
      frame.getContentPane().add (new Tile(colour1));
      frame.getContentPane().add (new Tile(colour2));
      frame.getContentPane().add (new Tile(colour3));
      frame.getContentPane().add (new Tile(colour4));  
      frame.getContentPane().add (new Tile(colour1));
      frame.getContentPane().add (new Tile(colour2));
      frame.getContentPane().add (new Tile(colour3));
      frame.getContentPane().add (new Tile(colour4));   
      frame.getContentPane().add (new Tile(colour1));
      frame.getContentPane().add (new Tile(colour2));
      frame.getContentPane().add (new Tile(colour3));
      frame.getContentPane().add (new Tile(colour4));   
      frame.getContentPane().add (new Tile(colour1));
      frame.getContentPane().add (new Tile(colour2));
      frame.getContentPane().add (new Tile(colour3));
      frame.getContentPane().add (new Tile(colour4));
      frame.getContentPane().add (new Tile(colour1));
      frame.getContentPane().add (new Tile(colour2));
      frame.getContentPane().add (new Tile(colour3));
      frame.getContentPane().add (new Tile(colour4));
      frame.getContentPane().add (new Tile(colour1));
      frame.getContentPane().add (new Tile(colour2));
      frame.getContentPane().add (new Tile(colour3));
      frame.getContentPane().add (new Tile(colour4));
      frame.setVisible(true);
   }
}