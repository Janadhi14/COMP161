import java.util.Scanner; 
// we need to import scanner and then we need totake the input and stroe it but then modify it 

public class kilometersToMiles{
public static void main(String[] args){
        double kilometers1;//declare variable 
Scanner scan = new Scanner(System.in);
System.out.println("distance in miles: ");
kilometers1 = scan.nextDouble();
kilometersToMiles(kilometers1);
}

public static void kilometersToMiles(double kilometers){ 
	System.out.println( " km is equal to " + (kilometers / 1.60934) + " miles.");
	}
}
