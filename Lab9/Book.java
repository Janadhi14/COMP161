
import java.text.DecimalFormat;

public class Book{
   //data field declarations
   private String title;
   private String author;
   private double costPrice;
   private static double markUp;
   private static final double GST = 0.15;
 
   /** constructor for a book object
       @param title - the title of the book
       @param author the author of the book
       @param costPrice the cost price of the book
   */
   public Book(String title, String author, double costPrice){
      this.title = title;
      this.author = author;
      this.costPrice = costPrice;
   }

   /** accessor method for the title data field 
      @return the title of the book
   */
   public String getTitle(){
      return title;
   }
   
   /**accessor method for the author data field
   @return the title of the book*/
   public String getAuthor(){
      return author;
   }

   /** method to return a summary description of the book*/
 
   public static void setMarkUp(double markUpIn){ 
      markUp = markUpIn;
   }

   public double getRetailPrice(){
      return costPrice * (1 + markUp) * ( 1 + GST);
   }
   public void displayBook(){
      System.out.println(title + " by " + author); 
      
      System.out.println("It costs " + Math.ceil(getRetailPrice()));
      System.out.println("**********************************"); 
   }
   public String toString(){
      
      return "Title: " + title + ", Author: " + ", Retail price: " + Math.ceil(getRetailPrice()) ; // Math.ceil() will round up to teh nearest dollar
      
      }
   
}


// DecimalFormat fmt = new DecimalFormat(); 
//make an instance fmt.setMaximumFractionDigits(1); 
//specify format required System.out.println("Truncated " + fmt.format(6.666));