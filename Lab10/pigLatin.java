public class pigLatin{
    public static void main(String[] args){
    pigLatinConverter("CAT");
        

        
    }
    public static void pigLatinConverter(String name){
        //create a new lowercase String and assign it to the variable name //overwriting the previous value (reference)
        name = name.toLowerCase();
        String firstLetter = String.valueOf(name.charAt(0));
        //get the character at position 0 and cast it to a String
       // String firstLetter = String.valueOf(name.charAt(0));
            //create a new String that contains toUpperCase version of firstLetter
            //and assign it to firstLetter
            name = name.substring(1,name.length());
        System.out.println(name + firstLetter + "ay"); 
    }
}

// EXTENSION TASK 