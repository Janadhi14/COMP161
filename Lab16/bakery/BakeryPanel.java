import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import java.util.Arrays.*;

public class BakeryPanel extends JPanel{

   Cake[] cakes;
   int count = 0;

   /** Creates a panel wide enough for one cake and high enough for the  number 
       of shelves specified in the local variable numShelves. The number of shelves 
       is used to set the length of the Cake array. The space between 
       shelves is specified in shelfHeight. If the array is only partially filled with cake,
       so are the shelves.
   */
   public BakeryPanel(){     
      int numShelves = 6; // change the values of this variable, optional -  try setting with user input
      int shelfHeight = 90;
      cakes = new Cake[numShelves];

      
      int x = 20;
      int y = shelfHeight;
      
      setPreferredSize(new Dimension(Cake.WIDTH + 40, numShelves * shelfHeight));
      setBackground(Color.white);
      
      try{
         Scanner fileScan = new Scanner(new File("CakeSpecificationsShort.txt"));
         // we want to read in an array of string

         
         // On each line of the CakeSpecifications the tokens in order are meant to be:
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
      
         while(fileScan.hasNextLine() && count < cakes.length){// the count is there to go to the next line
            String fileLine = fileScan.nextLine(); // we want to read the file as string 
                      
            try{
               // remember that an array consists of the same type of data, so jin this cas ewe doulnt want to read the file information into an array 
               Scanner scannedline = new Scanner(fileLine);  
               
               // Add code here to create a new Scanner object to scan fileLine
               String [] lineArray = fileLine.split(" "); // split the string using the limiter 
               
               // for the "ingredients" needed to make a Cake
               int numLayer = scannedline.nextInt();
               boolean cherry = scannedline.nextBoolean();
               // this is for the sponge color
               int red = scannedline.nextInt();
               int green = scannedline.nextInt();
               int blue = scannedline.nextInt();

               // this is for the filling colour
               int red2 = scannedline.nextInt();
               int green2 = scannedline.nextInt();
               int blue2 = scannedline.nextInt();


               Color fillingColour = new Color(red, green, blue);
               Color spongeColour = new Color(red2, green2, blue2);
               // now we need to implement the rgb to the fillcolour and the cake colour 

               // Add the Cake to the array 
               cakes[count]= new Cake(x, y, numLayer, cherry, spongeColour, fillingColour);
               
               count++;
               
               
               // increment count
               
              //increment y by shelfHeight
              y =+shelfHeight;
            
            }catch(InputMismatchException e){
               System.out.println("incorrect data type");
            }catch(IllegalArgumentException iae){
               System.out.println("the colour parameter is out of the range");
            }catch(NoSuchElementException nee){
               System.out.println("This line doesn't have any input");
            }
            
            // Add another catch here for cases where the colour inputs might be above 255
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
         for(Cake cake:cakes){
            try{
               cake.draw(g);
            }catch(NullPointerException npe){
               System.out.println("There is not enough cakes for number of shelf.");
            }
         }
      }
      // Loop through the array and call the draw method on each valid Cake in the array
      // Optional  Use a loop to draw shelving for each cake
   }