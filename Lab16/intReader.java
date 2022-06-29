import java.io.*; 
import java.util.*;

public class intReader{
    public static void main(String[] args){
        int[] numbers = new int[20]; 
        int count = 0;
        try{
            Scanner fileScan = new Scanner(new File("shortFileOfInts.txt")); 
                while(fileScan.hasNext() && count < numbers.length){

            try{
                numbers[count] =fileScan.nextInt(); //store the int count++;
            }catch(InputMismatchException ime){
                fileScan.next(); // reads the next token as a String - safe!
            } 
        }
            }catch(FileNotFoundException e){
                System.out.println("Sorry, but that file was not found.");
            }
    }
}