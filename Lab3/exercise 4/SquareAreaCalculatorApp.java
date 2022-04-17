import java.util.Scanner;

public class SquareAreaCalculatorApp{
	public static void main(String[] args){ 
	double length1, height1;

	
Scanner scan = new Scanner(System.in);
	
	System.out.println("what is the height of the rectangle? ");
	length1 = scan.nextDouble();
//assigning the line to the input 
	System.out.println("what is the base length of the rectangle? ");
	height1 = scan.nextDouble();
//assigning the height1 to the previous line
	areaOfASquare(length1, height1);
	

	}
/**a method to calulate and display the area of a triangle*/
	public static void areaOfASquare(double length, double height){ 
	System.out.println("The area of a rectangle with a length of " + length + " and a height of " + height + " is " + (length * height));
	
   } 
}
