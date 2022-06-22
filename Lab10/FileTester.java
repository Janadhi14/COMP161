import java.io.*; 
import java.nio.file.*; 

public class FileTester{
   Public static void main (String []Args){
   FileTester();
   }
   
public static int FileTester(String welcome.txt){
    int highest =0;
    String contents = getFileContents(welcome.txt);
    Scanner sc = new Scanner(contents);
    while(sc.hasNext()){
       int num=sc.nextInt();
       If(num>highest){
          highest = num;
       }
    }
    return num;
 } 
 
 public static String getFileContents(String welcome.txt){
    String fileContents = "";
    try {
       fileContents = Files.readString(Path.of(welcome.txt));
    } catch (IOException e) {
        System.out.println("File not found.");
    }
    return fileContents;
    
    
 }