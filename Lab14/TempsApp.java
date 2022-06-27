import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DecimalFormat;

/**
*A application that calculates and displays information about
*about temperatures for a particular location
*/
public class TempsApp{

   public static void main(String[] args){
      DecimalFormat df = new DecimalFormat();
      df.setMaximumFractionDigits(2);
      String fileContents= "";
      String fileName = MyTools.readToken("Please enter the full name of the file you wish to open (include the extension):");
      fileContents = MyTools.getFileContents(fileName);
      //System.out.println(fileName);
      //System.out.println(fileContents);
      String[] numsAsText = fileContents.split(","); // splitting the string using teh value " ' " as the regex
      //System.out.println(numsAsText.length); // prints the length of the array of string
      //System.out.println(numsAsText[0]); // prints the first element of the array
      //System.out.println(numsAsText[numsAsText.length-1]); // prints the second element
      // for(String eachItem: numsAsText){ //prints all elements, sequentially 
      //System.out.print(eachItem + " ");
      double [] temps = new double [numsAsText.length]; // creating a new array that is of type double but 
      //has a length that is equal to that of numsAsText using the.length method 
      // now we want to get the string value from the numsAsText array , 
      //parse it as double and assign it to teh same possition inf the array of double
      // we need to use a for loop to do this because
      for(int i = 0; i<temps.length; i++){
      // this gets the next numsAstext array element adn use the 
      //double.parseDouble to return its value converted to a double, 
      //assigning the value to a local variable
      double num = Double.parseDouble(numsAsText[i]);
      temps[i] = num;

      
      
      }

      System.out.print(df.format(averageTemp(temps)));
      }
      
   
   
   public static double highestTemp(double[] temps){ 
      double largest = temps[0]; // initilize the largest temp to the tempreature at position 0 of the index 
      for(double currentTemp: temps){ // for a given current temp we are chekcing  all the currentTemps against all the temps in the array 
         if(largest < currentTemp){
            largest = currentTemp;
            

         }

         
      }return largest;
   }

/* */
   public static double lowestTemp(double[] temps){ 
      double smallest = temps[0];
      for(double currentTemp: temps){
         if(smallest > currentTemp){ // if the tempreature at the fiven position current temp is larger than the smallest then we are going to set the smallest to the tempreature at that index which caused it to execute that if statement adn  tehn we are going to return the smallest 
            smallest = currentTemp;
            
         }
         
      } return smallest;
      

   }

   // first we want to calculate teh average tempreature  we can use a for each loop for this
   
   public static double averageTemp(double[] temps){
      double value = 0;
      double average =0;
      for (double temp: temps){
         value += temp;// we are adding the temp to teh value which will start at 0 and then looping it 
         average = (value/temps.length);   
         
            // here we want to calculate the sum of the values i the array and then divide by the .length of that array 
      }return average;

   }
   // now we want to calculate the 3 day average tempreature
   
   public static double highestThreeDayAverage(double[] temps){ 
      double highestSoFar = (temps[0] + temps[1] + temps[2]) / 3; 
      for(int i = 1; i < temps.length - 2; i++){
      double threeDayAvg =(temps[i] + temps[i + 1] + temps[i + 2])/3; if(threeDayAvg > highestSoFar){
            highestSoFar = threeDayAvg ;
         }
      }
      return highestSoFar; 
   }

}

//"/Users/janadhi/Desktop/<\>/COMP161/Lab14/dunedinHighTempsFULL.txt

