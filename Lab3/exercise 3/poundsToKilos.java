import java.util.Scanner; 
// we need to import scanner and then we need totake the input and stroe it but then modify it 

public class poundsToKilos{
public static void main(String[] args){
      
        double pounds1;
Scanner scan = new Scanner(System.in);
System.out.println("weight in lbs: ");
pounds1 = scan.nextDouble();
poundsToKilos(pounds1);
}

public static void poundsToKilos(double pounds){ 
	System.out.println(pounds + " pounds is equal to " + (pounds * 0.453592) + "kg.");
	}
}
