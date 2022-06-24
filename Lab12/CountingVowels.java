import java.util.Scanner;
public class CountingVowels {
   public static void main(String args[]){
      int count = 0;
      int consonants = 0;
      System.out.println("Enter a sentence :");
      Scanner sc = new Scanner(System.in);
      String sentence = sc.nextLine();

      for (int i=0 ; i<sentence.length(); i++){
         char ch = sentence.charAt(i);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
            count ++;
         } else if (ch != 'a'|| ch != 'e'|| ch != 'i' ||ch != 'o' ||ch != 'u'){
            consonants++;
      }
      System.out.println("Number of vowels in the given sentence is "+count + " and the number of consonants is " + (consonants));
   }
   } 
}
