import javax.swing.*;
import java.awt.*;
/** Lab 06 JFrame example class  */
public class FramesApp1{
   public static void main(String[]args){
      JFrame frame = new JFrame("Some JPanels");//creates a new JFrame with the title "Some Panels".
   
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// Allows us to close the window.
      frame.setLayout(new FlowLayout());// We'll cover layouts in a later lab.
   
      frame.pack();// forces the JFrame to expand to accomodate the panel -  won't make a difference yet.
      frame.setVisible(true);// pretty much what it says - try commenting this line out.
   }
}


