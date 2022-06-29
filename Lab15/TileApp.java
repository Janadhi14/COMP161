import javax.swing.*;
import java.awt.*;


/** Creates numerous instances of Tile (a class which extends JPanel) 
  * which are added to the JFrame's content pane
  */
public class TileApp{


   public static void main(String[]args){
      JFrame frame = new JFrame("Mosaic"); 
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      frame.setLayout(new FlowLayout());
      frame.setSize(1000, 1000);
      
   
   
      Tile.setWidth(100);
      Tile.setHeight(100);
     
   
      
      for(int i = 0; i < 200; i ++){
         //frame.getContentPane().add(new Tile(Color.pink));
         

         //Create the array of Color objects here.
         //Color[] colors = new Color[5]; // of type colour 
         Color[] colors = {Color.red, Color.green, Color.yellow, Color.blue, Color.green}; // filled array that contains the colors.
         // we want to fill the array with colours 
         for (Color color: colors){
            frame.getContentPane().add(new Tile (color)); // creates a new panel that is going to have the next color in the array 
         }
         // Loop through Color array here, creating a new Tile each time and adding it to the content pane
      
            
      
      }
      frame.setVisible(true);
   }
}