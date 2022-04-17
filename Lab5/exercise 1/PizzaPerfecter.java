//we need to first import 
import java.util.Scanner; 
public class PizzaPerfecter {
    public static void main ( String [ ] args ) {  
        int x = readInt( "how many equa slices would you like a circular pizza divided into?:" ); 
        double d = angleOfEachSlice(x);
        System.out.println( "each slice will arc through " + d + " degrees." );
            }
    public static int readInt( String message ) { 
        Scanner sc = new Scanner( System.in ); 
        System.out.println( message );
        return sc.nextInt();
    } 
    public static double angleOfEachSlice(int n){
        return 360.0 / n;
    }

}
