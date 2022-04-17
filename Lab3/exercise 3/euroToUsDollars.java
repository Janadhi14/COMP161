import java.util.Scanner; 
// we need to import scanner and then we need totake the input and stroe it but then modify it 

public class eurosToUsDollars{
public static void main(String[] args){
        double euros1;//declare variable 
Scanner scan = new Scanner(System.in);
System.out.println("money in euros: ");
euros1 = scan.nextDouble();
eurosToUsDollars(euros1);
   }

public static void eurosToUsDollars(double euros){ 
   System.out.println("euros is " + (euros * 1.107) + " USD.");
   }
}
