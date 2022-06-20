public class ConditionalPractice{
    public static void main(String[] args){

    boolean x = inAscendingOrder(3,6,5); // that takes the 3 parameters and returns true if tehy are in ascending order and false otherwise ()
    System.out.println(x);
    //int x = largestOfThree(3,14,5); // takes 3 parameters and  return  
    //System.out.println(x  + " is the largest");
   

   }



 public static boolean inAscendingOrder(int a, int b, int c){
    return a < b && b < c;

   }
}


///


/*public static int largestOfThree(int input_1, int input_2, int input_3){ 
   if(input_1 > input_2 && input_1 > input_3){
        return input_1;
      }
   else if(input_2 > input_1 && input_2 > input_3){ 
        return input_2;
      }
   else if(input_3 > input_2 && input_3 > input_1){
        return input_3;
      }
   else 
      return 0;
   
    }
}
*///