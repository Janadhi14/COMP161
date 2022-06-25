// final code
import java.util.Scanner;
import java.util.Random;


// we need to declare a final boolean variable 
public class CoinFlipChecker{
	public static void main(String[]args){
		int numRuns = 0;
		int limit;
        Scanner sc = new Scanner(System.in);
        String prompt = "Please enter the number coin flips per run." + "\nThis must be a positive even number!";
        do{
            System.out.println(prompt); 
            limit = sc.nextInt();
        }
            while(limit % 2 != 0 || limit < 2);//keeps asking while limit is either odd or less than 2
        // think about what would hapen if the limit was an uneven number 
		    boolean Met;
        
		do{
		    Met = isEvenRun(limit);
				numRuns++;
		}while(!Met);//keeps going until we have a run that is half and half // of we have an uneven numebr this will always be false and cant exit out of the

		System.out.println("Number of 'coin flips' in each run: " + limit) ;
		System.out.println("It took " + numRuns + " attempts to get exactly half heads and half tails.");
		}

	public static boolean isEvenRun(int limit){ Random r = new Random();
		int numHeads = 0;
		int numTails = 0;
		for(int i = 0; i< limit;i++){
			if(r.nextBoolean())numHeads++;
				else numTails++; 
		}
		return numHeads == numTails;//returns true if the number of heads and tails is equal out of the 100000 flips 
	
	}
}

// notice we are not doing any printing out
