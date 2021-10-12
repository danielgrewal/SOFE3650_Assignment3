package main;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class GUI implements ActionListener {

    JLabel label_Display;
    JLabel show_Display;

    JFrame frame;
    JPanel panel;

    JButton button1;

    public GUI() {

        frame = new JFrame();
        panel = new JPanel();

        label_Display = new JLabel("DISPLAY:");
        show_Display = new JLabel("No Product Selected");

        button1 = new JButton("Add Milk (1)");
        button1.addActionListener(this);
        JButton button2 = new JButton("Add Eggs (2)");
        button2.addActionListener(this);
        JButton button3 = new JButton("Add White Bread (3)");
        button3.addActionListener(this);
        JButton button4 = new JButton("Add Rice (4)");
        button4.addActionListener(this);
        JButton button5 = new JButton("Add Strawberries (5)");
        button5.addActionListener(this);
        JButton button6 = new JButton("Add Grapes (6)");
        button6.addActionListener(this);

        // border params: top bottom left right (padding around p)
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        // grid layout params: row col, x,y padding
        panel.setLayout(new GridLayout(20,2));

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);

        panel.add(label_Display);
        panel.add(show_Display);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Cash Register");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        show_Display.setText("BUTTON WAS PUSHED");
    }
    
}
