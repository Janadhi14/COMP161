import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class BakeryPanel extends JPanel{

   Cake[][] cakes;
   int count;
   int shelf;
   int numCakePerShelf = MyTools.readInt("Number of cake per shelves:");
   int numShelves = MyTools.readInt("Number of shelves:"); // change the values of this variable, optional -  try setting with user input

   /** Creates a panel wide enough for one cake and high enough for the  number
       of shelves specified in the local variable numShelves. The number of shelves
       is used to set the length of the Cake array. The space between
       shelves is specified in shelfHeight. If the array is only partially filled with cake,
       so are the shelves.
   */
   public BakeryPanel(){    

      int shelfHeight = 90;
      cakes = new Cake[numShelves][numCakePerShelf];
      int count = 0;
     
      int x = 20;
      int y = shelfHeight;
     
      setPreferredSize(new Dimension((Cake.WIDTH + 40)*numCakePerShelf, numShelves * shelfHeight));
      setBackground(Color.white);
     
      try{
         Scanner fileScan = new Scanner(new File("CakeSpecifications.txt"));
         
         // On each line of the CakeSpecifications the tokens in order are meant to be:
         //
         // int - the number of layers
         // boolean - whether or not the cake has a cherry
         // int - the red component of the sponge colour
         // int - the green component of the sponge colour
         // int - the blue component of the sponge colour
         // int - the red component of the filling colour
         // int - the green component of the filling colour
         // int - the blue component of the filling colour
         //
         // E.g.
         // 3 true 234 154 165 141 125 65
     
         while(fileScan.hasNextLine() && shelf < cakes.length){
            String fileLine = fileScan.nextLine();
            try{
               // Add code here to create a new Scanner object to scan fileLine
               Scanner lineScan= new Scanner(fileLine);
               // for the "ingredients" needed to make a Cake
               int numLayer = lineScan.nextInt();
               boolean cherry = lineScan.nextBoolean();
               int rSC = lineScan.nextInt();
               int gSC = lineScan.nextInt();
               int bSC = lineScan.nextInt();
               int rFC = lineScan.nextInt();
               int gFC = lineScan.nextInt();
               int bFC = lineScan.nextInt();
               Color spongeColour = new Color(rSC, gSC, bSC);
               Color fillingColour = new Color(rFC, gFC, bFC);
               // Add the Cake to the array
               
               cakes[shelf][count] = new Cake(x, y, numLayer, cherry, spongeColour, fillingColour);
               // increment count
               count++;
               x+=Cake.WIDTH+40;
               if(count>=cakes[shelf].length){
               //increment shelf
               shelf++;
               //increment y by shelfHeight
               y+=shelfHeight;
               //reset the count
               count=0;
               //reset the x
               x=20;
               }

            }catch(InputMismatchException e){
               System.out.println("Incorrect data type!");
            }catch(IllegalArgumentException iae){
               System.out.println("rgb colour is above limit of 255!");
            }// Add another catch here for cases where the colour inputs might be above 255
            catch(NoSuchElementException nee){
               System.out.println("This line doesn't have any input");
            }
         }
       
      }catch(FileNotFoundException e){
         System.out.println("File not found.");
      }
   }
   
   /** takes a reference to a Graphics object and passes it to draw method
       which is called on each valid Cake object in the array, cakes.
       @param g a reference to a Graphics object
   */
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      // Loop through the array and call the draw method on each valid Cake in the array
      for (int i = 0; i<numShelves; i++){
         for(Cake cake:cakes[i]){
            try{
               cake.draw(g);
            }catch(NullPointerException npe){
               System.out.println("There is not enough cakes for number of shelf.");
            }
         }
      }
      // Optional  Use a loop to draw shelving for each cake
      int shelfHeight = 90;
      int y = shelfHeight;
      Color brown = new Color(165,42,42);
      for(int i =1; i<=cakes.length;i++){
         g.setColor(brown);
         g.fillRect(0,y*i, (Cake.WIDTH + 40)*numCakePerShelf, 10);
      }
   }
}