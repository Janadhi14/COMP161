
import java.util.*;
public class cardinalordinal{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print(number + print(number));
    }

    public final static String print(int num){
        num = num%10;
        String str = "";
        switch(num)
        {
        case 1:     
            str = "st";
            break;
        case 2:     
            str = "nd";
            break;
        case 3:     
            str = "rd";
            break;
        
        default: 
            str = "th";             
        }
        
        return str;
    }

   // we are neeeding to add special cases for 11, 12, 13 and 
}

// mabye we can of if num == 11 prnt " num + "th"
// we need ot write some code to make sure that the special cases that are 11 , 12 and 13 are 