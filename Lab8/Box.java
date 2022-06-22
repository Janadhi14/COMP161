/** Laboratory 5 Worked Example */
public class Box{
    private double width;
    private double height;
    private double depth;
    /** replacement for the default constructor */
    public Box(){
    }
    /** constructor for a cube box - all dimensions are of equal length*/
    public Box(double side){
       height = width = depth = side;
    }
    /** constructor for Box*/
    public Box(double h, double w, double d){
       height = h;
       width = w;
       depth = d;
    }
   /**mutator method for depth*/
    public void setDepth(double d){
       depth = d;
    }
     /**mutator method for width */
    public void setWidth(double w){
       width = w;
    }
     /** mutator method for height */
    public void setHeight(double h){
       height = h;
    }
     /** accessor method, returns depth */
    public double getDepth(){
       return depth;
    }
     /**accessor method, returns width */
    public double getWidth(){
       return width;
    }
     /** accessor method, returns height */
    public double getHeight(){
       return height;
    }
    /** method to calculate and return surface area*/
    public double getArea(){
       return depth * width * 2 + height * width * 2 + depth * height * 2 ;
    }
    
    /** method to calculate and return volume*/
    public double getVolume(){
       return height * width * depth;
    }

    public boolean isCube(){
        return this.height == this.width && this.width == this.depth;
        }
   
   
 
 }
 
 
 