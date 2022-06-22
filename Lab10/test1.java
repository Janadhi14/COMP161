public class test1{
    public static void main(String[] args){
    String fact1 = "Paris is the capital of France !" ;
    String fact2 = "The capital of Italy is Roma";
    int stringLength = fact1.length();
    
    
   /* System.out.println(fact1.length());
    System.out.println(fact2.length());
    System.out.println(fact1.charAt(7));
    System.out.println(fact1.charAt(0) + " " + fact1.charAt(fact1.length()-1 ));
    System.out.println(fact2.charAt(0) + " " + fact2.charAt(fact2.length()-1)); // the last part here functions to take the length and then privide that number -1 which will give the last value of the index
    System.out.print(fact1.indexOf('e'));
   
   
   
    int firstE = fact1.indexOf('e');
    int secondE = fact1.indexOf('e', firstE +1); // returns the second occurence f  of e
    int thirdE = fact1.indexOf('e', secondE +1);
    System.out.println("1st e index: " + firstE); 
    System.out.println("2nd e index: " + thirdE);

    System.out.println(fact1.toUpperCase());
    System.out.println(fact2.toLowerCase());
    */
    /*
    String x = fact2.substring(fact2.indexOf('i'), fact2.length());
    System.out.println(x.indexOf('a') + fact2.indexOf('i'));
   
    System.out.println(fact2.substring(4,10));
     */
    System.out.println(fact1.indexOf("is"));
    System.out.println(fact2.indexOf("is"));
    
    
    }
}




