import java.io.*;
import java.util.*;

/** A class to create and manage Box objects*/
public class BoxApp{
   public static void main(String[]args){
      Box[] boxes = new Box[200]; // first we are declaring an array that is 20 elements long 
      int count = 0; // we ware using a counter integer to count through teh lines 
   
      try{
         Scanner fileScan = new Scanner(new File("corruptBoxData.txt"));  // scanner that will scan a file (not the line )
         while(fileScan.hasNextLine() && count < boxes.length){ // we are chekcing that while there is another line is true and that the counter is smaller than the length of the 20 element array we are carring out the code within the try 
         String line = fileScan.nextLine();  // first we want to make a variable line which will scan the next line 
         Scanner lineScan = new Scanner(line);//a scanner that will scan the new line (not the file )
         
         try{ // try method 
            //declaring out variables first and then scanning in the order o fwidth,hegiht and depth
            // we want to check if there is only 1 value, 
           // we are splitting the line 
            //now we need to load it into an array and
            String lineArray [] = line.split(" ");
         
            // splitting the string 

            if(lineArray.length == 3 ){
               double width = lineScan.nextDouble();// corresponds to teh first value in the line 
               double height = lineScan.nextDouble();
               double depth = lineScan.nextDouble();//corresponds to teh 3rd double in teh line 
               boxes[count] = new Box(width, height, depth);
               System.out.println(boxes[count]);
               count++; 
               //we are creating a box that is 
               //we want to increment the count 
            } else if (lineArray.length == 1){
               double sides = lineScan.nextDouble();
               boxes[count] = new Box(sides);
               System.out.println(boxes[count]);
               count++;
               
            } else {
               System.out.println("doesnt contain 3 doubles values");
               count++;
            }
        // error handelling for possible corruptions in the file 
         }catch(InputMismatchException e){ // this error is for lines that dont contain the double type data in teh line 
            System.out.println(line + " contains a non-double token!");
         }catch(NoSuchElementException e){
            System.out.println(line + " does not contain 3 tokens" );
         } 
      }// if the file is not foudn we want to catch teh file not being fuond outside of the line error messages 
         }catch(FileNotFoundException e){
         System.out.println("Sorry, but that file was not found.");
         }
         
      //for(Box box: boxes){
         //System.out.println(box);// printing out all teh boxes from box using the to string method and a for each loop 
          
   }
}

// we want to use the split method so that we are able to split the array in a way that allows us to read the file so that if there is only one value we 
// are going to call the 1 parameter method and if there are 3 then we aer going to calll teh 3 parameter method 


