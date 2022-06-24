public class whileLoops{
    public static void main (String [] arg){
    int count = 1;  // this is the counter variable 
    int num = 2;
    
    while(count < 5){ 
        num = num * 2;
        System.out.println(num);
        count++; 

    } // we see that count increases by one nad then we print out the number 
    System.out.println(num);
    }
}