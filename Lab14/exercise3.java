import java.util.Arrays;
public class exercise3{
   
    
    public static void main(String[] args){
        String [] testArray;
        testArray = new String[] {"coffee", "milo", "tea", "cocoa", "juice", "milk" };
        String[] testArray2 = {"carrot", "onion", "pea", "cabbage", "lettuce"};
        System.out.println(Arrays.toString(returner(testArray)));
    }
// we want ta method that will returns a reference toa  enw array of string containing ever ysecondelement of the origional
    public static String[] returner(String [] somearray){
        // String [] array2;
        // array2 = new String []{" "};
        // for (int i = 0; i < somearray.length-5; i++ ){
        //    array2 = new String []{somearray[i], somearray[i+2], somearray[i+4]};
        // }  
        // return array2;
        // creating a new array that is going to be half the size of the first array 
        String[] result = new String[(int)Math.ceil(somearray.length/2.0)];// dividing the legnth of the array  and rounds up 
            for(int i=0; i<result.length; i++){
                result[i] = somearray[2*i]; // this 
            
            }return result;
        }  
    }
    