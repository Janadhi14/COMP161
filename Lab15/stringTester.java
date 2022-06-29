public class stringTester{
    public static void main(String [] Args){
        System.out.println("We want to know your favourite herbs!");
	    String[] favouriteHerbs = new String[10];
		String input = "";
		for (int i=0; i < favouriteHerbs.length && !input.equalsIgnoreCase("q"); i++){ // we have an extracondition that needs to be met within the for loop where there is an and statement 
		input = MyTools.readLine("Please enter a herb (or a 'q' to quit):");
		if(!input.equalsIgnoreCase("q")){// we don't want to enter q into the array! // this statement is saying that if the 
		        favouriteHerbs[i] = input;
		    }
		
		}
        for(String herb: favouriteHerbs){ 
            System.out.println(herb); // it will fill out the array partially and then print out teh array with the null values as soon as q is entered 
	    }
    }
}