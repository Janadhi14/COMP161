import javax.swing.*; 
import java.awt.*; 
// import all graphics classes 5
public class FramesApp2 {
    public static void main(String [ ] args) {
    JFrame frame = new JFrame("Some JPanels"); // make frame (visible window)
    frame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE ); // close = quit 
    frame.setLayout( new FlowLayout() ); // frame contents to be placed left to right
    JPanel panel1 = new JPanel(); // make three panels 
    JPanel panel2 = new JPanel();
    SmileyPanel smiley = new SmileyPanel(Color.magenta, "Smiley"); frame.getContentPane().add (smiley);
    panel1.setBackground( Color.pink ); // configure the panels 
    panel1.setPreferredSize( new Dimension(100, 200) ); 
    panel2.setBackground( Color.gray ); 
    panel2.setPreferredSize( new Dimension(100, 200) ); 
    
    frame.getContentPane().add( panel1 ); // add the panels to the frame 
    frame.getContentPane().add( panel2 );
    
    frame.pack(); // pack (size) the frame around its contents
    frame.setVisible( true ); // make the frame visible 
    panel1.add(new JLabel("Panel 1"));
    panel2.add(new JLabel("Panel 2"));
    panel2.add(new JLabel("middle "));
    smiley.add(new JLabel("Panel 3"));
    }
}

// all grapphic drawing code shoudl be in ro called by the panels paintcompoent method 


