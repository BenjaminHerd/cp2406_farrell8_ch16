/*
Create a string, and when a button is pressed,
produce upside down, then revert.
 */

//import statements
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color.*;

//main class constructor
public class JUpsideDownPanel extends JPanel implements ActionListener {

    //Layout components and variable declaration
    String message = "Text to be changed";
    int counter = 0;
    int xPos = 100;
    int yPos = 100;
    final int SIZE = 38;

    JButton button = new JButton("Click to change");
    Font rightSideUpFont = new Font("Arial", Font.ITALIC, SIZE);
    Font upSideDownFont = new Font("Arial", Font.ITALIC, -SIZE);
    Font font = rightSideUpFont;
    int yUpSide = yPos - SIZE/2;

    //public class constructor
    public JUpsideDownPanel(){
        //Sets display of items
        setBackground(Color.WHITE);
        add(button);
        button.addActionListener(this);

    }

    //Override function to catch events and draw string
    @Override
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        //Get the font for creating the string on screen
        g.setFont(font);
        g.drawString(message, xPos, yPos);
    }

    @Override
    public void actionPerformed (ActionEvent e){

        //If count is odd, then make message right side up, otherwise, upside down
        if (counter % 2 == 1){
            font = rightSideUpFont;
            xPos = 100;
            yPos = 100;
        }
        else{
            font = upSideDownFont;
            xPos = 500;
            yPos = yUpSide;
        }
        //Add to counter and repaint the frame after action
        ++counter;
        repaint();
    }

    //running application
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        //Need to add frame into program and specify details
        frame.add(new JUpsideDownPanel());
        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
