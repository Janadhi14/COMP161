import java.lang.Math;
import java.text.DecimalFormat;

public class powerPrinter{
    public static void main (String[] args) {
    // 
    //   
       printer(2,88);
    }

    public static void printer(int n, int high){ // to parameters 
        DecimalFormat fmt = new DecimalFormat();
        fmt.setMaximumFractionDigits(1);

        for(int i = 1; i <= high ; i++){ // we are looping here so that i is incremented thus that it meets the high 
            double answer = Math.pow(n,i); // equation so we are using the formula for n to the power of i
            System.out.print(fmt.format(answer) + " "); // we are printing out the value of the answer for each loop on teh same line with one space 
        }

    }
}
