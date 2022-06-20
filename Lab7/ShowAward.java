import java.util.Scanner;
/** Chapter 7 Lab Exercise 
Points of goldThreshold and above get a Gold Award etc. */
public class ShowAward{
   static double goldThreshold = 800;
   static double silverThreshold = 500;
   static double bronzeThreshold = 300;

   public static void main(String[] args){
   
      System.out.println("How any points did your team get?");
      Scanner scan = new Scanner(System.in);
      int points = scan.nextInt();
      printAward(points);
   
   }
   
   /** method prints out award message according to points and thresholds
   */
   public static void printAward(int pts){
   }  
}
