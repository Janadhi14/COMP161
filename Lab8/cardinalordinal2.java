import java.util.Scanner;

public class cardinalordinal2 {
    public static void main(String[] args){
            int num = cardinal("enter a number");
            if (num == 1){
                System.out.println(num + "st");
            }
            else if (num == 2 ){
                System.out.println(num + "nd");
            }
            else if (num == 3){
                System.out.println(num + "rd");
            }
            else if (num%100==11){
                System.out.println(num + "th");
            }
            else if (num == 11){
                System.out.println(num + "th");
            }
            else if (num%10==1){
                System.out.println(num + "st");
            }
            else if (num%10 == 2){
                System.out.println(num + "nd");
            }
            else if (num%10 == 3){
                System.out.println(num + "rd");
            }
            else{
                System.out.println(num + "th");
            }

    }
      
        
        public static int cardinal(String message){
            Scanner sc = new Scanner(System.in);
            System.out.println(message);
            return sc.nextInt();
            }

        
        // we need a read int method, to take advantage of thein user input 

}
