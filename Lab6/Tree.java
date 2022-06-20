import java.awt.*;

/** A class representing a tree*/
public class Tree{

   private int mid, top;// the x, y coordinate of the mid-point at the top of the trunk

  /** takes 2 parameters to initialise the datafields
      @param mid the x coordinate of the mid-point at the top of the trunk
      @param top the y coordinate of the mid-point at the top of the trunk
  */
   public Tree(int mid, int top){
      this.mid = mid;
      this.top = top;
   }

  /** Uses the Graphics object to draw the trunk and then a series of green ovals to depict a generic tree
      @param page - a Graphics object
  */
   public void draw(Graphics page){
      page.setColor (new Color(139, 69, 19));
      page.fillRect (mid, top, 16, 60);// tree trunk hardcoded to be 16 by 60 for the sake of simplicity
      
      page.setColor (Color.green);
      page.fillOval (mid-20, top-25, 30, 30);   
      page.fillOval (mid-5, top-25, 35, 35);
      page.fillOval (mid-23, top-45, 40, 40);    
      page.fillOval (mid-13, top-45, 40, 40);    
      page.fillOval (mid-6, top-45, 40, 40);   
      page.fillOval (mid-10, top-55, 40, 40);  
      page.fillOval (mid, top-55, 30, 30);    
      
   }    
}


