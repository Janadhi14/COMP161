import java.util.Scanner;

public class newprint {
    public static void main(String [] args){
        String some = "hells sdfsd sfdsdfsdf sdfsd dff";
        deleted(some);
    }

    public static void deleted(String sm){
        
        Scanner sc = new Scanner(sm);
        while(sc.hasNext()){
            String str = ""; //
            str = sc.nextLine();
            if((sc.next().length())> 4){
                
                System.out.println(sc.next());
            }
        }
    }
 
}



