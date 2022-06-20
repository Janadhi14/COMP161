import java.awt.*;

/** A class representing a star*/
public class Star{ 
   private int midX, midY, radius, numPoints;
   private Color colour;
   
   /** takes 5 parameters to initialise the datafields
      @param midX the x coordinate of the centre of the star
      @param midY the y coordinate of the centre of the star
      @param radius the radius of the "outer circle" touched by the big points of the star
      @param colour the colour of the star  
      @param numPoints the number of big points of the star
  */     
   public Star(int midX, int midY, int radius, Color colour, int numPoints){
      this.midX = midX;
      this.midY = midY;
      this.radius = radius;
      this.colour = colour;
      this.numPoints = numPoints;
      
   }
  
  /** Takes a Graphics object and fills a star shaped polygon which is determined 
    * using trigonometry methods from the Math class
    * CONTAINS CODE BEYOND WHAT WE HAVE COVERED AT THIS POINT
    * @param g - a Graphics object
  */
   public void draw(Graphics g) {
      Polygon	star = new Polygon();
      
      double ax, ay, bx, by; // coordinates of the pointy bits - determined in the loop using the mighty power of trigonometry
      int	innerRadius =  radius / 2;
      double angle = Math.PI /2;  //allows star to start from 'north' position   
      double pointBase = Math.PI / numPoints;//How many radians do we add to the angle before finding the next point
      
      for ( int i = 0; i < numPoints; i++ ) {
         ax = midX + radius * Math.cos( angle );
         ay = midY - radius * Math.sin( angle );
         star.addPoint( ( int )ax, ( int )ay );
         angle += pointBase;
         bx = midX + innerRadius * Math.cos( angle );
         by = midY - innerRadius * Math.sin( angle );
         star.addPoint( ( int )bx, ( int )by );
         angle += pointBase;
      }
      g.setColor(colour);
      g.fillPolygon(star);
   
   }
}