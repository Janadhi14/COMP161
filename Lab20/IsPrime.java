/**
* Nick Meek. Jan. 2021
* A class that has one static method that checks to see 
* if the supplied number is a prime number or not.
*/
public class IsPrime{

   /**
   * Checks a number to see if it is prime
   * @param number the number to check
   * @return true if the number is a prime , false otherwise
   */
   public static boolean isPrime(int number){
      if(number < 2){
      return false;
      }
      for (int i=2; i<(number/2)+1; i++){
         if(number%i == 0){
            return false;
         }
      }
      return true;
   }
}