import java.util.Scanner;
public class LeapYear1{
    public static void main(String[] args){
        int year = readInt("Enter a year: "); 
        if(year < 1582){ // clearer but same as if(!(year >= 1582))
                System.out.println(year + " too early "); 
            } else if(year % 400 == 0){
                System.out.println(year + " is a leap year"); 
            } else if(year % 4 != 0){ 
                System.out.println(year + " is not a leap year");
            } else if(year % 100 == 0){ 
                System.out.println(year + "is not a leap year");
            } else {
                System.out.println(year + " is a leap year");
            }
    }

    public static int readInt(String prompt){ 
        Scanner sc = new Scanner(System.in); 
        System.out.println(prompt);
        return sc.nextInt();
        } 
    
}
    
