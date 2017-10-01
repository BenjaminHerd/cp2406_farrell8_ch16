// This program displays promotional messages
// with the click of a button
// The button is disabled when all messages are on screen

//import statements
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

//main class constructor
public class FixDebugSixteen3 extends JPanel implements ActionListener
{
   JLabel firstText = new JLabel("Our company is growing!");
   JLabel secText = new JLabel("What makes us better that most?");
   JButton findOutButton = new JButton("Find Out");
   FlowLayout flow = new FlowLayout();
   String[] reason= {"Our products","Our people",
        "Our committment","Our service","YOU!!"};
   Font boldFont =new Font("TimesRoman", Font.BOLD, 20);
   final int GAP = 20;
   int x = 30, y;
   int counter = 0;

   //public class constructor
   public FixDebugSixteen3()
   {
     setBackground(Color.PINK);
     add(firstText);
     add(secText);
     add (findOutButton);
     findOutButton.addActionListener(this);
   }

   //override functions to catch events and paint
   @Override
   public void actionPerformed(ActionEvent e)
   {
      ++counter;
      if(counter >= reason.length)
         findOutButton.setEnabled(false);
      //need to repaint for each click
       repaint();
   }
   @Override
   public void paintComponent(Graphics g)
   {
       g.setFont(boldFont);
       g.setColor(Color.BLUE);
       y = 50;
       for(int i = 0; i < counter; ++i)
         g.drawString(reason[i], x, y += GAP);
    }
    //running application
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new FixDebugSixteen3());
      frame.setSize(350, 250);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}