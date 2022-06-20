import javax.swing.*; 
import java.awt.*;
	public class FramesApp1{
		public static void main(String[]args){
		JFrame frame = new JFrame("Some JPanels"); //creates a new JFrame with the specified title
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// Allows us to close the window
		frame.setLayout(new FlowLayout()); // layouts will be covered later in the course
		frame.pack();
		frame.setVisible(true); // pretty much what it says - try commenting
		
	}
}
