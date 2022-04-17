public class exercise5{
  public static void main(String[ ] args){
	String team1 = "Black Caps";
	String team2 = "Bangladesh";
	String venue = "Forsyth Barr Stadium"; 
	String day = "00";
	String month = "00";
	int year = 2000;
	System.out.println(day + "/" + month + "/" + year);
	System.out.println(venue );
	System.out.println(team1 + "\\nvs\\n" + team2 );
	System.out.print(month + 3);
	System.out.println(year + 21);
	System.out.println(day + "/" + month + "/" + year);
	month = "3";
	year += 21;
	System.out.println(day + "/" + month + "/" + year);

	}
}

/** this should print out:
00/00/2000
Forsyth Barr Stadium
Black Caps \\nvs\\n Bangladesh
00/3/2021 
