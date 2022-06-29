
// suppose we have a text file that contains string that is seperated by spaces
// we want to write a program that will read this and then return the largest string in that file that
// first we need to call a file reader method that will read the file and then use  a delimiter that will seperate using the regex

public class fileOpener {
    public static void main (String [] arg){

        // we want to scan a file
        String fileContents= "";
        String fileName = MyTools.readToken("Please enter the full name of the file you wish to open (include the extension):");
        fileContents = MyTools.getFileContents(fileName);
        String[] words = fileContents.split(" ");
        System.out.println(words.length);
        largestword(words);

      

    }
      // a method that will return the largest string in the array of strings 
    public static void largestword(String[] words) {
        String largestWord = words[0];
        for (String currentWord : words){
            if(currentWord.length()>largestWord.length()){ // we are calling the length method on teh word because we want tof ind the length of the word 
                largestWord = currentWord;// the current word 
                System.out.println(largestWord);

            }
            
            
        }
        
        

    }


}

                
// name of the file we want to read from: /Users/janadhi/Desktop/<\>/COMP161/Lab15/UFCFighter.txt