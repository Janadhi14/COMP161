public class capitaliser{
    public static void main(String[] args){
        String y =  capitaliser("Janadhi");
        System.out.println(y);


    }


    public static String capitaliser(String name){
	//create a new lowercase String and assign it to the variable name //overwriting the previous value (reference)
	name = name.toLowerCase();
	//get the character at position 0 and cast it to a String
	String firstLetter = String.valueOf(name.charAt(0));
	    //create a new String that contains toUpperCase version of firstLetter
	    //and assign it to firstLetter
	    firstLetter = firstLetter.toUpperCase();
	
	//create a new string and assign it to the variable name
	    name = firstLetter + name.substring(1);
	return name; }
    
}
