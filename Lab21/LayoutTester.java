import javax.swing.*;
import java.awt.*;

public class LayoutTester{
   public static void main(String[]args){
      JFrame frame = new JFrame("A frame to test some layout managers"); //creates a new JFrame with a title
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// Allows us to close the window
      frame.setLayout(new FlowLayout());// Not technically necessary at this stage
      
      GridLayoutTestPanel gL = new GridLayoutTestPanel();// Creates a new instance of a panel demonstrating GridLayout
      frame.getContentPane().add (gL);// adds the panel to the JFrame
      
      //FlowLayoutTestPanel fL = new FlowLayoutTestPanel();// Creates a new instance of a panel demonstrating FlowLayout
      //frame.getContentPane().add (fL);// adds the panel to the JFrame
      
      //BorderLayoutTestPanel bL = new BorderLayoutTestPanel();// Creates a new instance of a panel demonstrating BorderLayout
      //frame.getContentPane().add (bL);// adds the panel to the JFrame
      
      
      
      frame.pack(); // forces the JFrame to expand to accomodate the panel - try commenting this line out
      frame.setVisible(true);// pretty much what it says - try commenting this line out 
   }
}