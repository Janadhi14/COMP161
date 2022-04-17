import java.util.Scanner; 
// we need to import scanner and then we need totake the input and stroe it but then modify it 

public class milesToKilometers{
public static void main(String[] args){
        double miles1;//declare variable 
Scanner scan = new Scanner(System.in);
System.out.println("distance in miles: ");
miles1 = scan.nextDouble();
poundsToKilos(miles1);
}

public static void milesToKm(double miles){ 
	System.out.println(miles + " miles is equal to " + (miles * 1.60934) + "km.");
	}
}
	

