import java.util.Scanner;
	
public class AgeNextYear{
	public static void main(String[] args){ 
	String name1;
	int age1;

Scanner scan = new Scanner(System.in);

System.out.println("what is your name? ");
name1 = scan.nextLine();
System.out.println("what is your age? ");
age1 = scan.nextInt();
showAgeNextYear(name1, age1);
	}

public static void showAgeNextYear(String name, int age) {
   System.out.println("Hello " + name + ", you are " + age + " years old. Nexy year you will be " + (age + 1) );

   }
}
