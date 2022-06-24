public class CharSPrinter{
	public static void main(String[] args){
	String s = "Test string"; 
	int index = 0;
	while(index < s.length()){
       if(s.charAt(index) != ' '){
       System.out.println(s.charAt(index));
       }
		index++;}
	}
}

