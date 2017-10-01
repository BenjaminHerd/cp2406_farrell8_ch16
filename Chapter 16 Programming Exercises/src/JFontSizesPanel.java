/*
Show message from size 6 to 20 in the same font
 */

//import statements
import javax.swing.*;
import java.awt.*;

//main class constructor
public class JFontSizesPanel extends JPanel{

    //variable declaration and layout components
    String message = "Text to be displayed";
    final int START = 6;
    final int STOP = 20;
    final int HORIZ_POS = 50;
    int vertPos;
    int i;
    final int INCREASE = 20;
    Font myFont;

    //Override functions
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        vertPos = 10;

        //For loop for drawing a string and then
        // moving position and increasing size from 6 >> 20
        for (i = START; i <= STOP; ++i) {
            myFont = new Font("TimesRoman", Font.BOLD, i);
            g.setFont(myFont);
            g.drawString(message, HORIZ_POS, vertPos);
            vertPos += INCREASE;
        }
    }

    //running application
    public static void main(String[] args) {
        //defaults
        JFrame frame = new JFrame();
        frame.add(new JFontSizesPanel());
        frame.setSize(360, 340);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
