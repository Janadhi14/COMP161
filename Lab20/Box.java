/**
* A class to represent a box/cube
* and methods to get/set and return 
* other information about the box.
*/
public class Box{
   /**The width of the box*/
   private int width;
   /**The height of the box*/
   private int height;
   /**The depth of the box*/
   private int depth;

   /** Default constructor*/
   public Box(){
      width = 1;
      height = 1;
      depth = 1;
   } 

   /**
   * A constructor for cubes
   * @param dim the size of the cube
   */
   public Box(int dim){
      this.height = dim;
      this.width = dim;
      this.depth = dim;
   }
   
   /**
   * A constructor for boxes with different length edges
   * @param w the width of the box
   * @param h the height of the box
   * @param d the depth of the box
   */
   public Box(int w, int h, int d){
      this.height = w;
      this.width = h;
      this.depth = d;
   }
   
   /**
   * Set the width of the box to the supplied value.
   * @param width the new width
   */
   public void setWidth(int width){
      this.width = width;
   }
   
   /**
   * Set the height of the box to the supplied value.
   * @param height the new height
   */
   public void setHeight(int height){
      this.height = height;
   }
   
   /**
   * Set the depth of the box to the supplied value.
   * @param depth the new depth
   */
   public void setDepth(int depth){
      this.depth = depth;
   }
   
   /**
   * Get the width of the box.
   * @return the width of the box.
   */
   public int getWidth(){
      return this.width;
   }
   
   /**
   * Get the height of the box.
   * @return the height of the box.
   */
   public int getHeight(){
      return this.height;
   }
   
   /**
   * Get the depth of the box.
   * @return the depth of the box.
   */
   public int getDepth(){
      return this.depth;
   }
   
   /**
   * Get the sum of the areas of all the faces of the box.
   * @return the area of all the faces of the box.
   */
   public int getArea(){
      return ((this.width * this.height) + (this.width * this.depth) + (this.height * this.depth))*2;
   }
   
   /**
   * Get the volume of the box.
   * @return the volume of the box.
   */
   public int getVolume(){
      return this.width * this.height * this.depth;
   }
   
   /**
   * Get the length of the lengest diagonal in the Box
   * @return the length of the longest diagonal
   */
   public double getLongestDiagonal(){
      int largestDimension;
      if(width >= height && width >= depth){
         largestDimension = width;
      }else if(height >= width  && height >= depth){
         largestDimension = height;
      }else{
         largestDimension = depth;
      }
      return Math.sqrt(3) * largestDimension;
   }
   
   /**
   * Get the total length of all the edges.
   * @return the sum of the lengths of all 12 edges of the box.
   */
   public int edgeLength(){
      return this.height*4 + this.width*4 + this.depth*4;
   }
   
   /**
   * Scale the cube by the supplied factor. Can be negative)
   * @param scale the factor to scale the lengths of the edges by
   */
   public void scaleBox(int scale){
      this.depth = this.depth*scale;
      this.height = this.height*scale;
      this.width = this.width*scale;
   }
   
   /**
   * A printable representation of the box.
   * @return A printable representation of the box.
   */
   public String toString(){
      return "Width: " + this.width + ", Height: " + this.height + ", Depth: " + this.depth;
   }
}