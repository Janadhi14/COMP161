import java.util.Arrays;

public class MedianFinder {
    public static final int[] values = { 5, 3, 6, 15, 34, 65, 78, 99, 100 };
    public static void main(String[] args) {
      // initialize array with odd number of element
      
      // calculate median
      double median = median(values);
      //System.out.println("Median is : " + median);
      // re-initialize array with even number of element
      // calculate median
      median = median(values);
      System.out.println("Median is : " + median);
      System.out.print(Arrays.toString((values)));
   }
   static double median(int[] values) {
      // sort array
      // we need to cloone becasue this will change the array 
      int [] values2 = values.clone(); // clone it so that we arent chainging the first array 
      Arrays.sort(values2); // sorthing the array 
      double median;
      // get count of scores
      int totalElements = values2.length;
      // check if total number of scores is even which is done thorugh the % and if statement 
      if (totalElements % 2 == 0) { 
         int sumOfMiddleElements = values2[totalElements / 2] + values2[totalElements / 2 - 1];  // remeber that because we start counting from 0 we need to -1 because of calulating values in teh middle and adding tehm, 
         //below we are going to divide it by 2 becasue if its an even number we need the average of the middle numbers
         // calculate average of middle elements
         median = ((double) sumOfMiddleElements) / 2;
      } else {
         // get the middle element in the case where we there is an uneven number of elemerts we are going to get an even.length so that means we are going to divide and get an even value which will be the middle 
         median = (double) values2[values.length / 2]; // this will be the median value because it is the element index 
   }
   return median;
    }

}