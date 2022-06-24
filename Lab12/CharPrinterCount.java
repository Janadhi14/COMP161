public class CharPrinterCount{
	public static void main(String[] args){
	String s = "Test string"; 
	int index = 0;
	int spaces = 0;
	while(index < s.length()){
      
       if(s.charAt(index) != ' '){
       System.out.println(s.charAt(index));
       
       } else {
		spaces++;
	   }
       	index++;}
	System.out.println("the string:" + s + " cointains " + (index - spaces) + " letters");
	}
	
}
