import java.util.Scanner;
import java.lang.Math.*;

public class CircleAreaCalculatorApp{
	public static void main(String[] args){ 
	double radius1;

	
Scanner scan = new Scanner(System.in);
	
	System.out.println("what is the radius of the circle?" );
	radius1 = scan.nextDouble();
//assigning the line to the input 
	
	areaOfCircle(radius1);
	

	}
/**a method to calulate and display the area of a triangle*/
	public static void areaOfCircle(double radius){ 
	System.out.println("The area of a circle with a radius of " + radius + " is " + (2 * radius * Math.PI));
	
   } 
}
