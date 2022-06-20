import javax.swing.*;
import java.awt.*;
import java.util.Random;
 
 
/** A class that extends JPanel and depicts  a snowy street scene*/
public class KindergartenPicturePanel extends JPanel{

   private Color bg; // needs to be a datafield so we can set the background colour in the 
                     // constructor and pass it into the Moon constructor
  
  /** sets the background colour and the dimensions of this panel using hardcoded 
      values for the sake of simplicity.*/
   public KindergartenPicturePanel(){
      this.bg = new Color(25, 25, 112);
      setPreferredSize(new Dimension(600, 500));
      setBackground(bg);
   }
  
   /** Uses the graphics object to draw the snowy ground and the road. Passes this Graphics 
      object to a variety of instances that are created and then called to draw themselves on the scene.
      @param g - a Graphics object which is created automatically because this class extends JPanel
   */
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.setColor (Color.white);//set the colour for the snowy ground
      
      g.fillRect (0, 350, 600, 170);  // fill in the ground
      g.fillArc (280, 300, 700, 200, 90, 90);// the gentle hill
      
      g.setColor (Color.black);// set colour for the "road"
      g.fillRect (0, 440, 600, 60);  // fill in the road
      
      
      Color silver = new Color(192, 192, 192); // silver colour for the stars and moon
     
      Star star1 = new Star(340, 45, 20, silver, 5);
      //Call the draw method on star1
      //Create more stars here 
      //Call the draw method on each one
      
      Moon m = new Moon(530, 10, 50, 50, silver, bg);//Important we use the same background colour      
      m.draw(g);                                     //to block out some of the moon to make a crescent
      
      House h1 = new House(Color.yellow, Color.green, Color.black, 200, 310);
      //Create another instance of House, positioned further to the right.
      h1.draw(g); 
      //Call the draw method on the second one
      
      // create an instance of Tree at the co-ordinate (110, 310)
      // Create another at (40, 325)     
      //Call the draw method on each Tree object
      
   
      // Use the code below after you have made your LetterBox class in the lab exercises
      
      Letterbox lb1 = new Letterbox(245, 395, Color.red, "17");
      lb1.draw(g);
      // LetterBox lb2 = new LetterBox(440, 395, Color.red, "15");//Note the street "numbers" are Strings
        
      // lb2.draw(g);
   }
      
}