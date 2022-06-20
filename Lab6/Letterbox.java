// Importing Libraries 
import java.awt.*;

/**
 * Class for drawing a letter box onto a JPanel
 * 
 * LetterBox lb1 = new LetterBox(245, 395, Color.red, "17");
 * Strings are the numbers on the letter box 
 * first two numbers are the x and y coordinates of the letter box
 */
public class Letterbox {
    // Defining the fields for a letterbox
    private int x;
    private int y; 
    private Color boxCol; 
    private String boxNumber; 

    // Properties of the letterbox
    private final int BOX_WIDTH = 30; 
    private final int BOX_HEIGHT = 22; 



    /** 
     * Takes four parameters and uses them to initialise the datafields of the letterbox
     * @param x - the x coordinate for the letter box
     * @param y - the y coordinate for the letter box
     * @param boxCol - the color for the letter box
     * @param boxNumber - the number for the letter box
     */
    public Letterbox(int x, int y, Color boxCol, String boxNumber) {
        
        this.x = x;
        this.y = y;
        this.boxCol = boxCol;
        this.boxNumber = boxNumber;

    }

    /**
     * Takes a Graphics object and draws the letterbox 
     * @param g - an instance of the Graphics class
     */
    public void draw(Graphics g) {

        // Drawing the letter box
        g.setColor(this.boxCol);
        g.fillRect(this.x, this.y, this.BOX_WIDTH, this.BOX_HEIGHT);      

        // Drawing the letter opening 
        g.setColor(Color.black);
        g.fillRect(this.x+7, (int) (this.y+4.25), 16, 5);                   

        // Drawing the wooden post
        g.setColor(new Color(139, 69, 19));
        g.fillRect(this.x+9, this.y+22, 12, 18);       
        
        //Drawing the Arc on top of the letterbox
        g.setColor(Color.black); 
        g.drawArc(this.x, this.y-5, this.BOX_WIDTH, 25, 36, 120);     
        
        // Drawing the number in the middle of the letterbox in small font
        g.setFont(new Font("Arial", Font.PLAIN, 10));
        g.drawString(this.boxNumber, this.x+10, this.y+18);
    }
}