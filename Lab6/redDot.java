import javax.swing.*; 
import java.awt.*;
/** Lab 06 extended JPanel with Graphics capability*/
public class redDot extends JPanel{
/** constructor takes a colour and some text as parameters, and uses * them in the JPanel setup
*/
   public redDot(Color bgCol, String labelText){ 
      setBackground(bgCol);
         setPreferredSize(new Dimension(120, 200));
// make a new JLabel using the text, and add the JLabel to the SmileyPanel
      add(new JLabel(labelText));
   }


   public void paintComponent(Graphics g){ 
    super.paintComponent(g);

      g.setColor(Color.red);
     g.fillOval(10, 40, 100, 100);
   } 
}