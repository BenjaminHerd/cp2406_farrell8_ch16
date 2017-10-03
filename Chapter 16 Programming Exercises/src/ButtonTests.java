import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color.*;

public class ButtonTests extends JPanel implements ActionListener {

    JButton button = new JButton("Click to disable");

    public ButtonTests(){
        setBackground(Color.WHITE);
        add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        button.setEnabled(false);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.add(new ButtonTests());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
    }
}

