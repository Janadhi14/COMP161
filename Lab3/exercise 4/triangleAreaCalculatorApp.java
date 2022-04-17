import java.util.Scanner;

public class triangleAreasCalculatorApp{
	public static void main(String[] args){ 
	double height1, base1;

	
Scanner scan = new Scanner(System.in);
	
	System.out.println("what is the height of the triangle? ");
	base1 = scan.nextDouble();
//assigning the line to the input 
	System.out.println("what is the base length of the triangle? ");
	height1 = scan.nextDouble();
//assigning the height1 to the previous line
	areasCalculatorApp(height1, base1);
	

	}
/**a method to calulate and display the area of a triangle*/
	public static void areasCalculatorApp(double base, double height){ 
	System.out.println("The area of a triangle with a base of " + base + " and a height of " + height + " is " + (base/2* height));
	} 
}
