// print out the 12 tiems table 

public class timesTable{
    public static void main(String [] args){
        timestable();
    }

    public static void timestable(){
        int value = 12;
        int i = 1;
        for(i = 1; i <= value; i++){
            System.out.print(i*value + " " );
        }
    }
}