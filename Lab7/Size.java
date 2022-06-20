/** Chapter 7 Lab Exercise */
public class Size{

   public static void main(String[] args){
      printSize(51);
      
   }
   
   /** method prints out a message according to size of number
   */
   public static void printSize(int num){
      System.out.print(num + " is ");
      if (num < 20){
         System.out.println( "small");
      }
      else if(num >= 20 && num < 50){
         System.out.println( "medium");
      }
      else if(num >= 50 && num <1000){
         System.out.println("big"); 
      }
      else if(num >=1000){
         System.out.println( "huge");
      }
      else if (num < 0){
         System.out.println("the numbr is less than 0");
      }
   }  
}
