import java.util.Random;

public class Randomsum {

	public static void main(String [] Args){
	int count = 0;
	Random r = new Random();
		final int TARGET =0;
		int sum = 0;
		do{
			sum+= r.nextInt(20);
			count++;
			System.out.println(sum -2);
		
	} while (sum < TARGET);
	System.out.println("Final sum: " + sum );
   System.out.println("There were " + count + " numbers that were added together to reach this sum");
		}
}


// we are able to turn this into a do while 
// if target was set to 0 then we are able to see that the program will run once before the condition is checked 
// 