public class HarryPotterGradeChecker{
    public static void main(String[] args){
        checkGrade('A');
        checkGrade('B');
        checkGrade('C');
        checkGrade('D');
        checkGrade('E');
    }
public static void checkGrade(char grade){
    switch(grade){
        case 'A':
        case 'B': 
        case 'C':
            System.out.println("Pass");
            break; 
        case 'D': 
        case 'E': 
        case 'F':
            System.out.println("Fail");
            break;
        default: //if the char stored in grade is not listed as a
            
            System.out.println("That is not a recognisable grade ");
        }
    }
}

