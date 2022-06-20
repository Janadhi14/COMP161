import java.awt.*;
/** Lab06 Example code */
public class SmileyFace{
 	private int x, y; 
 	private int width = 30;
 	private int height = 30;
   /** constructor for SmileyFace, 
   sets x (left) and y (top) position 
   of the oval's bounding box*/
 	public SmileyFace(int xIn, int yIn){   
 		x = xIn;
 		y = yIn;  
 	}
   /** draw method takes a Graphics object,
   and uses it to set colours, and draw each 
   piece of the smiley face */
 	public void draw(Graphics g){

 		g.setColor(Color.yellow);
 		g.fillOval(x, y, width, height); //draws a filled oval from (x, y)
 		g.setColor(Color.black);
 		g.fillOval(x + 6, y + 6, 5, 5); //left eye
 		g.fillOval(x + 19, y + 6, 5, 5); //right eye
 		g.drawArc(x + 5, y + 5, 20, 18, 190, 160); //smile
 	}
}
