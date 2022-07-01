import javax.swing.*;
import java.awt.*;

public class FlowLayoutTestPanel extends JPanel{

   public FlowLayoutTestPanel(){
   
      // NOTE: No need to set the layout to FlowLayout - it is the default for JPanels (and classes that extend them)
     
      setPreferredSize(new Dimension(400, 400));
      //setPreferredSize(new Dimension(200, 800));
      
      JButton[] buttons = new JButton[10];
      for(int i = 0; i < buttons.length;i++){
         buttons[i] = new JButton("" + i);
         buttons[i].setPreferredSize(new Dimension(100, 50));
         //buttons[i].setPreferredSize(new Dimension(50, 50));
         add(buttons[i]);
      }

   }

}