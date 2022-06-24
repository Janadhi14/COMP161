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
        public static String readChar(){
            String x;
            do{
            Scanner sc = new Scanner( System.in ); 
            System.out.println("enter a Char");
            x = sc.nextLine();
            } while(x.length() > 1);
            
            return x;
        }
        public static int readIntRange(int x, int y){
            Scanner sc = new Scanner(System.in); 
           
    
            System.out.println("enter a number between " + y + " and  " + x);
           
            int value = sc.nextInt();
            while(value  > x || value < y ){
                System.out.println("enter a value number between 0 and 100 :");
                value = sc.nextInt();
            } 
            return value;

            
            
        }


      
}
 
  // done 

// since there is no built in method for char we need to take a string and chop off the last letters 


// we can write a do while for this 
/*
public static char readChar(){
    Scanner sc = new Scanner( System.in ); 
    System.out.println("enter a Char");
    char input = sc.nextChar();
    while (input.Length>1){
        System.out.println("enter another Char");
    }
        return input.indexOf(0) // keep looping until there is only one character is entered 
        */



/*
Write a method called readIntInRange. It should take two int parameters, low and high. 
It should ask the user to enter an int between these two numbers, inclusive, and keep going until such an int is correctly entered. 
It should then return that int. Once it is working, include it in your MyTools class. */