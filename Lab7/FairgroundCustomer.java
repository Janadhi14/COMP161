import java.util.Scanner;
/** Chapter 7 Lab Exercise */
public class FairgroundCustomer{
   private static String name;
   private static int age;
   private static double height;
   private static boolean footwear;
   private static boolean accompanied;
   
public FairgroundCustomer(){

      Scanner scan = new Scanner(System.in);
      System.out.println("What is your Name?");
      String nameIn = scan.nextLine();
      name = nameIn;

      System.out.println("How old are you?");
      int ageIn = scan.nextInt();
      age = ageIn;
      
      System.out.println("How tall are you? (In CM)");
      double heightIn = height;
      heightIn = scan.nextDouble();

      System.out.println("Do you have footwear? (true/false)");
      boolean footwearIn = footwear;
      footwearIn = scan.nextBoolean();

      System.out.println("Are you accompanied? (true/false)");
      boolean accompaniedIn = accompanied;      
      accompaniedIn = scan.nextBoolean();


      displayRideOptions();
   }
   public static boolean getWallOfDeath(){
      return age > 16 && height > 1.6 && footwear;
      
   }
   public static boolean getFlingAndTwirl(){
      return age > 18 && height > 1.6 && height < 2.0 && footwear;

   }
   public static boolean getLogFlume(){
      return age > 10 || accompanied;

   }
   public static boolean getGiantDrop(){
      return age > 12 && height > 1.5 && height < 2.1;

   }
   public static void displayRideOptions(){
    
      boolean wallOfDeath = getWallOfDeath();
      boolean flingAndTwirl = getFlingAndTwirl();
      boolean logFlume = getLogFlume();
      boolean giantDrop = getGiantDrop();
      
      System.out.println(name + " can ride:");
      if(wallOfDeath = true){
         System.out.println("Wall of Death");
      }
      if(flingAndTwirl = true){
         System.out.println("Fling and Twirl");
      }
      if(logFlume = true){
         System.out.println("Log Flume");
      }
      if(giantDrop = true){
         System.out.println("Giant Drop");
      }
   }
}