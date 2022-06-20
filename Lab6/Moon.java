import java.awt.*;

/** A class representing a crescent moon*/
public class Moon{
   //datafields
   private int x, y;// the x, y coordinate of the top left corner
   private int width, height; // the dimension of the "outer" circle
   private Color fg, bg;// the fg is the ultimate colour of the crescent, the bg blocks out some of the circle


   /** takes 6 parameters to initialise the datafields
      @param x the x coordinate of the top left corner
      @param y the y coordinate of the top left corner
      @param width the width dimension of the "outer" circle
      @param height the height dimension of the "outer" circle
      @param fg the fg is the ultimate colour of the crescent
      @param bg the bg blocks out some of the circle 
               (ideally the same colour as the background of the destination panel)
   */
   public Moon(int x, int y, int width, int height, Color fg, Color bg){
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
      this.fg = fg;
      this.bg = bg;
   }

   /** Uses the Graphics object to draw a larger circle in the foreground colour and then 
      a smaller circle in the background colour to create the appearance of a crescent
      @param g a Graphics object
   */
   public void draw(Graphics g){
      g.setColor(fg);
      g.fillOval(x, y, width, height);
      g.setColor (bg);// set to background to make crescent by covering circle above
      g.fillOval(x - 2, y - 2, (int)(width * 0.9), (int)(height * 0.9));
   }

}