/** Represents a 3 dimensional Box */
public class Box{
   private double width;
   private double height;
   private double depth;
   
   /** replacement for the default constructor */
   public Box(){
   }
   
   /** constructor for a cube box - all dimensions are of equal length
   @param side the int value that will be assigned to length, width, and height*/
   public Box(double side){
      height = width = depth = side;
   }
   
   /** constructor for Box
   @param w the value to be assigned to width
   @param h the value to be assigned to height  
   @param d the value to be assigned to depth
    */
   public Box(double w, double h, double d){
      
      width = w;
      height = h;
      depth = d;
   }
   
  
   
   /**mutator method for width 
   @param w the value to be assigned to width
   */
   public void setWidth(double w){
      width = w;
   }
   
   /** mutator method for height 
    @param h the value to be assigned to height
   */
   public void setHeight(double h){
      height = h;
   }
   
  /**mutator method for depth
  @param d the value to be assigned to depth
  */
   public void setDepth(double d){
      depth = d;
   }
   
  
   /**accessor method, returns width
   @return the width of this box
   */
   public double getWidth(){
      return width;
   }
   
   /** accessor method, returns height */
   public double getHeight(){
      return height;
   }
   
   /** accessor method, returns depth 
   @return the depth of this box
   */
   public double getDepth(){
      return depth;
   }
   
   
   /** method to calculate and return surface area
   @return the surface area of this box*/
   public double getSurfaceArea(){
      return 2 * (depth * width  + height * width  + depth * height)  ;
   }
   
   /** method to calculate and return volume
   @return the volume of this box*/
   public double getVolume(){
      return height * width * depth;
   }
   
   /** returns a String describing the properties of this box.
   @return a descriptive String
   */
   public String toString(){
      return "Width: " + width + ", Height: " + height + 
         ", Depth: " + depth + ", Volume: " + getVolume() + 
         ", Surface Area: " + getSurfaceArea();
   }

}


