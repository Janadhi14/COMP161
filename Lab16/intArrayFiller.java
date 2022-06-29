
import java. io.*;
import java.util.*;



public class intArrayFiller {
    
    public static void main(String[] args){
        int[] numbers = new int[20];
        int count =0; //(c)
        try{// we want to try and scan a file and then use  afr loop to fill the array 
            Scanner fileScan =  new Scanner(new File("shortFileOfInts.txt"));// we are refereing to a file name  
            while(fileScan.hasNextInt() && count < numbers.length){//(b) and (a)
            numbers[count] = fileScan.nextInt();
            // now we want to increment count by 1 
            count++;
             }
            }catch (FileNotFoundException e){// catching a file not found error 
                System.out.println("file not found");
            } if (count ==0){ // count will be 0 if there is no file and the fileNotfoundException is not triggered so then we are going to print out that ther ewere no numbers in the file 
                System.out.println("there were no numbers in the file"); // if therewere no numbers in the file 

            } else { // else ther are numbers in the file and then we want to add all the numbers up for an int called sum whichis 0 and then divide by the number of times count was inremented by it will increment for every number in teh array 
                int sum = 0;// we are declaring sum as an int becasue we know the data in the file will be int we want to increment for every time we run the loop 
                for (int i =0; i < count; i++){// becasue we woeuld be checking a int against a double type  
                    sum+=numbers[i]; /// we are adding all the number sin teh file as the for loop is looped 
                }
                System.out.println("the average; " + (double)sum/count); /// we are declaring it as double here becasue we know that the answer can be double when divided
            }
            
            
     }


}
