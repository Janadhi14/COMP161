//we need to first import 
import java.util.Scanner; 
public class fahrenheitToCelsius {
    public static void main ( String [ ] args ) {  
        double x = celsiusToFahrenheit( "Please enter an the tempreature in celsius:" ); //we are able to alter these 2 statements in order to call other methods within the program.
        System.out.println( "the tempreature in fahrenheit is: " + ((x-32)/1.8) + "degrees.");
        //double y = fahrenheitToCelsius( "Please enter a tempreature in celsius: "); //mehtod call for fahrenheit
        //System.out.println( "the tempreature in fahrenheit is: " + ((y*1.8)+32) + "degrees.");
            
    }
        public static double celsiusToFahrenheit( String message ) { 
        System.out.println( message );
        Scanner sc = new Scanner( System.in ); 
        return sc.nextDouble();
    }
       public static double fahrenheitToCelsius( String message ) { 
        System.out.println( message );
        Scanner sc = new Scanner( System.in ); 
        return sc.nextDouble();
    }
}
