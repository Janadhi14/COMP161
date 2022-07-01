import javax.swing.*;
import java.awt.*;

public class GridLayoutTestPanel extends JPanel{

   public GridLayoutTestPanel(){

      setPreferredSize(new Dimension(400, 400));
      
      //setLayout(new GridLayout(2, 5));
      //setLayout(new GridLayout(5, 2));
      //setLayout(new GridLayout(4, 3));
   
      JButton[] buttons = new JButton[10];
      for(int i = 0; i < buttons.length;i++){
         buttons[i] = new JButton("" + i);
         add(buttons[i]);
      }
   
   }

}