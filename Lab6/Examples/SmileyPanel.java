
import javax.swing.*;
import java.awt.*;
 /** Lab 06 extended JPanel with Graphics capability*/
public class SmileyPanel extends JPanel{
  /** constructor takes a colour and some text, and uses them in the setup*/
   public SmileyPanel(Color bgCol,  String labelText){
   
      setBackground(bgCol);
      setPreferredSize(new Dimension(120, 200));
      // make a new JLabel using the text, and add the JLabel to the SmileyPanel//
      add(new JLabel(labelText)); 
   
   }
/** paintComponent method -  notice the super.paintComponent(g) statement which much come first,
and the origin and use of the g variable. Copy these things when you write your
own paintComponent methods */
   public void paintComponent(Graphics g){ 
      super.paintComponent(g);
         SmileyFace sf1 = new SmileyFace(10, 20); 
         SmileyFace sf2 = new SmileyFace(40, 80); 
         SmileyFace sf3 = new SmileyFace(10, 90); 
         SmileyFace sf4 = new SmileyFace(50, 60); 
         SmileyFace sf5 = new SmileyFace(50, 120);
         
         sf1.draw(g);
         sf2.draw(g);
         sf3.draw(g);
         sf4.draw(g);
         sf5.draw(g);
   }
} 
