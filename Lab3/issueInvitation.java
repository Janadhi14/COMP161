import java.util.Scanner; //importing the scanner class

public class issueInvitation{
	private static String ADDRESS = "133 Main Rd, Faketown";
	private static String VENUE = "Sunny Spot Events Venue";
  
   
   public static void main(String[] args){
      //create new variables for the inputs
      String occasion1, time1, date1;
  
      
      Scanner scan =  new Scanner(System.in);
      
      System.out.println("what is the occasion?"); 
			//assign the line of input to applicantName
      occasion1 = scan.nextLine();
      //ask the user for the next bit of data
      System.out.println("what time is this occasion?");
      //assign the line of input to dogName
      time1 = scan.nextLine();
      //ask the user for the next bit of data
      System.out.println("what day is this occasion?");
      // assign the int input to dogAge
      date1 = scan.nextLine();
      //call the method with the three parameters
      issueInvitation(occasion1, time1, date1);
   }
      
   public static void issueInvitation(String occasion, String time, String date){
      System.out.println("You are cordially invited to " + occasion + ".");
      System.out.println("This event will be held at " + VENUE + ", on the " + date + " at " + time + ".");
      System.out.println("The address is " + ADDRESS);
     
 
   }
         
  
}
         //end method
