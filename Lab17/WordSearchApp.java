/** A class to create and manage word search puzzles.*/
public class WordSearchApp{
   public static void main(String[] args){ 
      WordSearch ws = new WordSearch(15);
      System.out.println("folder:" + ws.insertWordEast("folder", 0, 0));
      System.out.println("desk: " + ws.insertWordWest("desk", 11, 14));
      System.out.println("chair: " + ws.insertWordSouth("chair", 1, 0));
      System.out.println("headset: " + ws.insertWordNorth("headset", 14, 1));
      System.out.println("notepad: " + ws.insertWordSouthWest("notepad", 1, 12));
      System.out.println("pen: " + ws.insertWordSouthWest("pen", 3, 12));
      System.out.println("mug: " + ws.insertWordWest("biscuit", 6, 6));
      System.out.println("flashdrive: " + ws.insertWordNorth("flashdrive", 8,14 ));
      System.out.println("mug: " + ws.insertWordSouth("mug", 13, 9));
      
      ws.displayLetterGrid();
   }
}