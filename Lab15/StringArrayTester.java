/*public class StringArrayTester{
    public static void main(String[] args){
        String[] herbs = {"sage", "thyme", "basil", "coriander"};
            for(String herb: herbs){
                System.out.println(herb.toUpperCase()); // converting to lower
            }
    }
}

*/


// if we want to now print out only the second item in the list 
public class StringArrayTester{
    public static void main(String[] args){
        String[] herbs = {"sage", "thyme", "basil", "coriander"};
            for(int i = 0; i < herbs.length; i+= 2){ // incrementing by 2 so we skip the second 
                
                System.out.println(herbs[i].toUpperCase());
            }
    }
}