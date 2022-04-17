//we need to first import 
import java.util.Scanner; 
public class celsiusToFahrenheit{
    public static void main ( String [ ] args ) {  
        double x = celsius( "Please enter an the tempreature in celsius:" ); /
        //double y = fahrenheit( "Please enter a tempreature in fahrenheit: "); //mehtod call for fahrenheit
        System.out.println( "the tempreature in fahrenheit is: " + ((x-32)/1.8) + " degrees.");
            
    }
        public static double celsius( String message ) { 
        System.out.println( message );
        Scanner sc = new Scanner( System.in ); 
        return sc.nextDouble();
    }
       public static double fahrenheit( String message ) { 
        System.out.println( message );
        Scanner sc = new Scanner( System.in ); 
        return sc.nextDouble();
    }
}
