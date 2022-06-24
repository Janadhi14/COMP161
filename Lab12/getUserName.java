public class getUserName{
   public static void main (String [] args){
   System.out.println(gt());
   }
public static String gt(){
    String usn;
    char usn3, usn5;
    boolean pass1 = false;
    boolean pass2 = false;
    do{
      usn = MyTools.readLine("please enter your username:");
      while (usn.length() != 8){
        System.out.println("Username should be 8 letters length:");
        usn = MyTools.readLine("please enter your username:");
      }
      usn3=usn.charAt(3);
      usn5=usn.charAt(5);
      if(usn5 >='0' && usn5 <='9'){
        pass1=true;
      }
      if(usn3 >='a' && usn3 <='z'){
        pass2=true;
      }
      if(!pass1 || !pass2){
        System.out.println("Username invalid");
      }
    } while (!pass1 || !pass2 || usn.length()!=8); 
    return usn;
    }
}