import java.util.Scanner;
public class HarryPotterGradeChecker{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Please enter a grade or q to quit"); 
        String input = sc.next();
        while(!input.equals("q")){
            checkGrade(input.toUpperCase().charAt(0)); 
            System.out.println("Please enter a grade, or q to quit"); 
            input = sc.next();
        }
        System.out.println("Thank you and goodbye.");
    } // etc
     /** Takes a grade and reports whether it is a pass, fail or not recognisable*/
    public static void checkGrade(char grade){ 
        switch(grade){
            case 'O': 
            case 'E': 
            case 'A':
                System.out.println("Pass");
                break; 
            case 'P': 
            case 'D': 
            case 'T':
                System.out.println("Fail");
                break;
            default:
        
        System.out.println("that is not a recognisable grade.");//if the char stored in grade is not listed as a case,
        } 
    }
}