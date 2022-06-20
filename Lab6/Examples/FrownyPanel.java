import javax.swing.*;
import java.awt.*;
 /** Lab 06 extended JPanel with Graphics capability*/
public class FrownyPanel extends JPanel{
  /** constructor takes a colour and some text, and uses them in the setup*/
   public FrownyPanel(Color bgCol,  String labelText){
   
      setBackground(bgCol);
      setPreferredSize(new Dimension(120, 200));
      // make a new JLabel using the text, and add the JLabel to the SmileyPanel
      add(new JLabel(labelText)); 
   
   }
/** paintComponent method -  notice the super.paintComponent(g) statement which much come first,
and the origin and use of the g variable. Copy these things when you write your
own paintComponent methods */
   public void paintComponent(Graphics g){ 
      super.paintComponent(g);
         FrownyFace sf1 = new FrownyFace(10, 20); 
         FrownyFace sf2 = new FrownyFace(40, 80); 
         FrownyFace sf3 = new FrownyFace(10, 90); 
         FrownyFace sf4 = new FrownyFace(50, 60); 
         FrownyFace sf5 = new FrownyFace(50, 120);
         
         sf1.draw(g);
         sf2.draw(g);
         sf3.draw(g);
         sf4.draw(g);
         sf5.draw(g);
   }
}