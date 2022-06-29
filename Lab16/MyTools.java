import java.util.Scanner; 
import java.io.*;
import java.nio.file.*;
import java.util.InputMismatchException;
import java.util.Random;
public class MyTools {
   // we want to intorduce a try catch for all the methods
       // no main method, only contains static methods 
        public static double readDouble( String message ) { 
            double num = 0;
            boolean done = false;
            Scanner sc = new Scanner (System.in);
            while (!done){
            try{
                
                System.out.println(message);
                num = sc.nextDouble();
                done = true ;
                } catch (InputMismatchException e){
                    sc.nextLine();
                    System.out.println("please enter a valid number");
                    
                }
            } return num; 
                
        }
        
   // we want to try first and the catch inputmismath
   // need to set up true and false so that when the condition is met we are able to change and return the ruser input 
   // if there is 
       

        public static int readInt( String message ) { 
            Scanner sc = new Scanner( System.in ); 
            int numint = 0;
            boolean done = false;
            while(!done){
                try{
                    System.out.println(message);
                    numint = sc.nextInt();
                    done = true;
                }catch(InputMismatchException e){
                    sc.nextLine();
                    System.out.println("please enter int only you idiot");
                }
            } return numint;


        }
        

        public static String readToken( String message ) { 
            String str = "";
            boolean done = false;
            Scanner sc = new Scanner( System.in );
            while(!done){ 
            try{
                System.out.println( message );
                str = sc.nextLine();
                done = true;
            } catch(InputMismatchException e){
                sc.nextLine();
                System.out.println("please enter some string only");
            }

        }return str;


        }

        public static String readString( String message ) { 
            String str = "";
            boolean done = false;
            Scanner sc = new Scanner( System.in );
            while(!done){ 
            try{
                System.out.println( message );
                str = sc.nextLine();
                done = true;
            } catch(InputMismatchException e){
                sc.nextLine();
                System.out.println("please enter some string only");
            }

        }return str;


        }


        //no input excepption handleing for these ones 
        public static int readInt(){
            Scanner sc = new Scanner( System.in ); 
            System.out.println("enter an integer:");
            return sc.nextInt();
        }
        public static Double readDouble(){
            Scanner sc = new Scanner( System.in ); 
            System.out.println("enter a double:");
            return sc.nextDouble();

        }
            
        
        public static String readToken(){
            Scanner sc = new Scanner( System.in ); 
            System.out.println("enter a String");
            return sc.nextLine();
        }
        public static String readString(){
            Scanner sc = new Scanner( System.in ); 
            System.out.println("enter a String");
            return sc.nextLine();
        }

        public static int randomInRange(){
            Random r = new Random();
            Scanner sc = new Scanner(System.in); 
            System.out.println("enter an upper limit:");
            int high = sc.nextInt();
            System.out.println("enter a lower limit:");
            int low = sc.nextInt();

            int result = r.nextInt(high-low) + low;
            return result;
            
        }
        public static int readPosEvenInt(){
            Scanner sc = new Scanner(System.in);
            int limit;
            String prompt = "Please enter the number coin flips per run." + "\nThis must be a positive even number!";
            do{
                System.out.println(prompt); 
                limit = sc.nextInt();
                
            }while(limit % 2 != 0 || limit < 2);//keeps asking while limit is either odd or less than 2
            return limit;
        }
        public static String getFileContents(String fileName){ String fileContents = "";
            try {
             fileContents = Files.readString(Path.of(fileName)); } catch (IOException e) {
            System.out.println("File not found.");
        }
        return fileContents; }

 }
  // done 


         // double number = 0
            // boolean istype;
        //try{
        //     Scanner sc = new Scanner( System.in ); 
        //     System.out.println( message );
        //     if (sc.hasNextDouble()){
        //         number sc.nextDouble();
        //         }
        //     }catch(InputMismatchException e){
        //         Scanner sc = new Scanner(System.in);
        //         System.out.println("PLease enter a valid double type:");
                
        //     }
        //     return number;
           
        // }


 // do{
                //     System.out.println( "please enter only a double" );
                //     if(input.hasNextDouble()){
                //         number = input.nextDouble();
                //         return sc.nextDouble();


                //     }else {
                //         System.out.println( "please enter aonly a double only");
                //         isType = false;
                //         input.next();
                    
                //     } while (!(isNumber));
                //     return number;
