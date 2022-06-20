import javax.swing.*;
import java.awt.*;
/**
   Represents a house with datafield representing the main house colour, the roof colour and the 
   window colour. The house is drawn around the point (houeseMid, houseTop). This point is 
   halfway along the top of of the main body of the house 
*/
public class House{

   private Color houseColour;
   private Color roofColour;
   private Color windowColour;
   
   private int houseMid;
   private int houseTop;
   
   
   /** Takes five parameters and uses them to initialise the datafields of this house
      @param houseColour - the colour of the main body of the house
      @param roofColour - the colour of the roof of the house
      @param windowColour - the colour of the windows of the house
      @param houseMid - the middle x value about which the house is drawn
      @param houseTop - the y valueat the top of the main body of the house but below the roof
   */
   public House(Color houseColour, Color roofColour, Color windowColour, int houseMid,  int houseTop){

      this.houseColour = houseColour;
      this.roofColour = roofColour;
      this.windowColour = windowColour;
   
      this.houseMid = houseMid;
      this.houseTop =  houseTop;
      
   }
   
   /**  Takes a Graphics object and uses a variety of Graphics methods to draw a house
        @param page - an instance of the Graphics class
   */
   public void draw(Graphics page){

      page.setColor (houseColour); // set colour to house colour for house body
      page.fillRect(houseMid -50, houseTop, 100, 100);      // house body
      page.setColor (roofColour); // set colour to roof colour
      int[] xPoints = {houseMid -55, houseMid +55, houseMid};
      int[] yPoints = {houseTop, houseTop, houseTop - 40};
      page.fillPolygon(xPoints, yPoints, 3);   // house roof
    
      
      page.setColor (windowColour);
      page.fillRect (houseMid - 40, houseTop + 20, 20, 20);   // top left window
      page.fillRect (houseMid + 20, houseTop + 20, 20, 20);    // top right window
      page.fillRect (houseMid - 40, houseTop + 55, 20, 20);   // top left window
      page.fillRect (houseMid + 20, houseTop + 55, 20, 20);    // top right window
      
      page.setColor (new Color(139, 69, 19));//sets the door colour
      page.fillRect (houseMid -12, houseTop + 62, 24, 38);    // door
      page.setColor(Color.black);
      page.fillOval(houseMid-8,houseTop + 75, 4, 4);//door handle
      
      page.setColor (Color.black);
      page.drawRect (houseMid -12, houseTop + 100, 24, 5);    // top step
      page.drawRect (houseMid -14, houseTop + 105, 28, 6);    // middle step
      page.drawRect (houseMid -16, houseTop + 111, 32, 8);    // bottom step
  
   }
}
