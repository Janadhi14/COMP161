/**
* Nick Meek. Jan. 2021
* A class that has two static methods that checks to see 
* if the supplied year is a leap year or not or pre-Gregorian or not.
*/
public class LeapYear{

	/**
	* Checks to see if the supplied year is a leap year or not.
	* returns false if the year is pre-Gregorian calendar
	* @param year the year to check
	* @return boolean true if it is a leap year, false in all other cases
 	*/
   public static boolean isLeapYear(int year){
      if(isPreGregorian(year)){
         return false;
      }		
   
      if(year%4 != 0){//not divisible by 4 == not a leap year
         return false;
      }else if(year%100==0 && !(year%400==0)){
         return false;
      }
      return true;
   }

	/**
	* Checks to see if the supplied year is pre-Gregorian calendar
	* @param year the year to check
	* @return boolean true if PreGregorian (before 1582) false otherwise.
 	*/
   public static boolean isPreGregorian(int year){
      if(year <= 1582){
         return true;
      }	
      return false;
   }
}