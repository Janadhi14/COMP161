public class newLetter{
    private static String phone = "03 4893 111";
    public static void main(String[] args){
       dogOffer("Sarah", "Fido", 5);//calling the dogOffer method\

       
 }
     /**
     * A method that prints out a dog adoption offer
 */
 public static void dogOffer(String appsName, String dogsName, int age){
    System.out.println("Dear " + appsName + ",\nI wish to offer you the opportunity to adopt " + dogsName + ".\n" + dogsName + " is " + age + " years old. Please call us on " + phone + ".");
    System.out.println(signature());
 }
 /**
 * A method that prints out the signature
 */
 public static String signature(){
    return ("Yours sincerely\nScooby Doo \nAdoption Manager \nDunedin Dog Rescue\nddr.co.nz\nPh:" + phone);
    }
 }
