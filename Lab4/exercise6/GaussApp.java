import java.util.Scanner;

/** A class that demonstrates Carl Gauss's method for adding up integer values in a sequence*/
public class GaussApp{

   public static void main(String[] args){
      
      
      
      int read = readInt("enter the value: ");// Add code here to read in an int from the user, 
      double value = addSequence(read);// call addSequence to get the sum of all integers from 1 up to the given int 
      System.out.println("The sum of all the integers between 1 and " + read + " inclusive is " + value);// and print it out in a sentence as specified in the question     
   }
   /** Add a method here that takes an int, upperLimit, and 
       returns the sum of all integers from one
       up to and including upperLimit. You must return an int! 
       @param upperLimt the number that we adding up to
       @return the sum of all numbers up to upperLimit
   */  
   public static double addSequence(int upperLimit){
      double value;
      double val;
      value = upperLimit / 2.0;
      val = value*(upperLimit + 1);
      return val;
   }
   /** Takes a string which is printed as a prompt to the user and 
      returns the int that they enter
      @param prompt instructions to the user
      @return the int entered by the user.
   */
   public static int readInt(String prompt){
      Scanner sc = new Scanner(System.in);
      System.out.println(prompt);
      return sc.nextInt();
   }

}
