import java.util.Scanner; 
import java.util.Random;
public class MyTools {
   
       
        public static double readDouble( String message ) { 
        Scanner sc = new Scanner( System.in ); 
        System.out.println( message );
        return sc.nextDouble();
        }
       

        public static int readInt( String message ) { 
        Scanner sc = new Scanner( System.in ); 
        System.out.println( message );
        return sc.nextInt();
        }
        

        public static String readToken( String message ) { 
        Scanner sc = new Scanner( System.in ); 
        System.out.println( message );
        return sc.nextLine();
        }

        public static String readLine( String message ) { 
        Scanner sc = new Scanner( System.in ); 
        System.out.println( message );
        return sc.nextLine();
        }
        public static int readInt(){
            Scanner sc = new Scanner( System.in ); 
            System.out.println("enter an integer:");
            return sc.nextInt();
        }
        public static Double readDouble(){
            Scanner sc = new Scanner( System.in ); 
            System.out.println("enter a double:");
            return sc.nextDouble();
            
        }
        public static String readToken(){
            Scanner sc = new Scanner( System.in ); 
            System.out.println("enter a String");
            return sc.nextLine();
        }
        public static String readString(){
            Scanner sc = new Scanner( System.in ); 
            System.out.println("enter a String");
            return sc.nextLine();
        }

        public static int randomInRange(){
            Random r = new Random();
            Scanner sc = new Scanner(System.in); 
            System.out.println("enter an upper limit:");
            int high = sc.nextInt();
            System.out.println("enter a lower limit:");
            int low = sc.nextInt();

            int result = r.nextInt(high-low) + low;
            return result;
            
        }
 }
  // done 




