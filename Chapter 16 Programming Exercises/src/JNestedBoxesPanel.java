/*
Draw 8 nested rectangles on screen, using one drawRect() statement
Hint: Use in a loop
 */
//import statements
import javax.swing.*;
import java.awt.Color;
import java.awt.*;

//main class constructor
public class JNestedBoxesPanel extends JPanel {
    //Layout components and variables
    int counter = 0;
    final int MAX = 8;
    int xPos = 100;
    int yPos = 100;
    int width = 200;
    int height = 200;

    //public class constructor
    public JNestedBoxesPanel(){

    }


    //Override function for drawing boxes
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        //For Loop for eight nested rectangles
        for (counter = 0; counter < MAX; ++counter){
            //Each time for loop runs, draw a rectangle and change positions,
            // height and width to give nested appearance
            g.drawRect(xPos, yPos, width, height);
            xPos = xPos + 10;
            yPos = yPos + 10;
            width = width - 20;
            height = height - 20;
        }
    }

    //running application
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JNestedBoxesPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

}
