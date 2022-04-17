import java.util.Scanner; 
public class LiquidVolumeConverter {
    public static void main ( String [ ] args ) { 
        double x = readDouble( "Please enter the ammount of liters you want to ocnvert: " ); 
        //we want to define the new methods 
        double y = imperialgallons(x, 4.546);
        double z = usgallons(x, 3.785;
        System.out.println( x + " litres is equivalent to " + y + "Imperial gallons and " + z + ".");
    }
    public static double readDouble( String litres ) {
    Scanner sc = new Scanner( System.in ); 
    System.out.println( litres );
    return sc.nextDouble();
    } 
    
   public static double usgallons(double q, double g){
   return q / g;
   }
    
    
   public static double imperialgallons(double u, double v){
   return u / v;
   }
}
