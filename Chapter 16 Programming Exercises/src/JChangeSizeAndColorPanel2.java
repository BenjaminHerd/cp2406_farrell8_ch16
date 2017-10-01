
/*
Extends Jpanel, displays phrase in a large font.
Each time the user clicks a button, display phrase in a
different colour and move to the right and make smaller.

3 clicks only
 */

//import statements
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//main class constructor
public class JChangeSizeAndColorPanel2 extends JPanel implements ActionListener{

    //Layout components and variable declaration
    String message = "Text to be changed";
    final int Y_POS = 120;
    final int START_X = 10;
    int xPos = START_X;
    final int START_SIZE = 40;
    int size = START_SIZE;
    int counter = 0;

    JButton button = new JButton("Click here");
    Font font;
    Color color;

    final int CHANGE = 8;
    final int MOVE_TO_RIGHT = 100;
    final int MAX_CLICKS = 3;

    //public class function
    public JChangeSizeAndColorPanel2(){
        setBackground(Color.WHITE);
        add(button);
        button.addActionListener(this);
    }

    //Override functions for drawing and button events
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //Sets message and sets the font, colour and position to write the string in
        font = new Font("TimesRoman", Font.ITALIC, size);
        g.setFont(font);
        g.setColor(color);
        g.drawString(message, xPos, Y_POS);
    }

    @Override
    public void actionPerformed(ActionEvent e){

        //if statements for number of clicks of the button
        if (counter == 0){
            color = Color.BLUE;
        }
        else if (counter == 1) {
            color = Color.GREEN;
        }
        else if (counter == 2) {
            color = Color.RED;
        }
        ++counter;
        size -= CHANGE;
        xPos += MOVE_TO_RIGHT;

        if (counter > MAX_CLICKS) {
            color = Color.BLACK;
            xPos = START_X;
            size = START_SIZE;
            counter = 0;
        }
        repaint();
    }

    //running application
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JChangeSizeAndColorPanel2());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(600, 200);
    }


}
