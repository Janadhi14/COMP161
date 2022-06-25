import java.util.Scanner;



public class letterA{
 public static void main(String[] args){
    favorite();
 }

public static void favorite(){
for(int i = 0; i < 3; i++){ 
	String word;
	Scanner sc = new Scanner(System.in);
do{
	System.out.println("Please enter a cool word that begins with A:");
        word = sc.next();
		}while(word.toUpperCase().charAt(0)!='A'); // checks that the letter is starting with A after being mutated to all uppercase 
    System.out.println(word + " - that is a great A word.");
    
	}
    System.out.println(); // we want to printout all the As that were stored prints out done when all 3 words are entered
}

}