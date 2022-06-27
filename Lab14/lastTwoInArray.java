// we want to write a code that returns the last 2 elements in an array in their order and
import java.util.Arrays;


public class lastTwoInArray{
    public static int [] marks = {1,3,2,4,44,3,2}; // initilising , declasing an array of type int 
    public static void main(String [] Args){
       System.out.println(Arrays.toString(lastTwo())); // we want to print out the returned array  // method that returns of type void 

    }
    public static int[] lastTwo(){
        int secondlast = marks[(marks.length-2)]; // notice we are getting the second last by taking away 2 from teh enght becasue we are counting the lenght of the array whcih will give the index of the element 
        int last = marks[marks.length-1];// we are ditermeing the last value 
        // we want to return an array of type int

        int [] arr = {secondlast,last};
        return arr;
    }
    
}