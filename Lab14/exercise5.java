import java.util.Arrays;
public class exercise5{
    
    public static void main(String[] args){
        double  [] somearray = {1,2,3,4.33,5,600,7,8};
        System.out.println(Arrays.toString(newArray(somearray)));

    }

    public static boolean[] newArray(double [] testArray){
        // we need to declare a new array that is booland is of the same length 
       
        boolean[] boolArray;        
        boolArray = new boolean [testArray.length]; // creating a new boolean array 
        // we need to take in an array that is of double and clone it and then parse it so it is boolean 
        // if the value in the array is larger than 100 then the boolean at the given position is false and
        for (int i = 0; i < testArray.length; i++){
            if (testArray[i] > 100 ){
                boolArray[i] = true;
            }
        } return boolArray;

    }
}