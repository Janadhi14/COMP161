/** Lab 2 TwoNumbersApp.java
* (name) March 2021 */
	public class TwoNumbersApp{
	public static void main (String[] args){
	double num1;//declaration, specifies data type and double
	double num2;//decleration, specidifies the data tyoe and double
	num1 = 3.5; //assignment
	num2 = 12.0;
	System.out.println("First number is " + num1);
	System.out.println("Second number is " + num2);
	System.out.println("Sum is " + num1 + num2);
	}
}

//in order to do this we need to place brackets around the "num1 + num2) section of the line
// soo we get the following

/** Lab 2 TwoNumbersApp.java
* (name) March 2021 */
	public class TwoNumbersApp{
	public static void main (String[] args){
	double num1;//declaration, specifies data type and name double num2;
	double num2;
	num1 = 3.5; //assignment
	num2 = 12.0;
	System.out.println("First number is " + num1);
	System.out.println("Second number is " + num2);
	System.out.println("Sum is " + (num1 + num2));
	}
}
