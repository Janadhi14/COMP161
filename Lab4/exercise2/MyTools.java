import java.util.Scanner; 
public class MyTools {
    public static void main ( String [ ] args ) {  
        double x = readDouble( "Please enter an double:" ); //we are able to alter these 2 statements in order to call other methods within the program.
        System.out.println( "You entered: " + x );
            
        }
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
 }
