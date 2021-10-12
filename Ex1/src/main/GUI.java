package main;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class GUI implements ActionListener {

    JLabel label_Display;
    JLabel show_Display;

    JLabel label_Input;
    JTextField keyboard_Input;

    JFrame frame;
    JPanel panel;

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;

    // Product test;

    public GUI() {

        frame = new JFrame();
        panel = new JPanel();

        label_Display = new JLabel("DISPLAY:");
        show_Display = new JLabel("No Product Selected");

        label_Input = new JLabel("KEYBOARD INPUT:"); 
        keyboard_Input = new JTextField();

        button1 = new JButton("Add Milk (1)");
        button1.addActionListener(this);
        button2 = new JButton("Add Eggs (2)");
        button2.addActionListener(this);
        button3 = new JButton("Add White Bread (3)");
        button3.addActionListener(this);
        button4 = new JButton("Add Rice (4)");
        button4.addActionListener(this);
        button5 = new JButton("Add Strawberries (5)");
        button5.addActionListener(this);
        button6 = new JButton("Add Grapes (6)");
        button6.addActionListener(this);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(20,2));

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);

        panel.add(label_Display);
        panel.add(show_Display);

        panel.add(label_Input);
        panel.add(keyboard_Input);

        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Cash Register");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new GUI();
        //Product test = ProductDB.getProductInfo("1");
        //System.out.println(test.name);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        // use values in ProductMap instead of hard coding
        if (event.getSource() == button1) {
            //Product test = ProductDB.getProductInfo("1");
            //System.out.println(test.name);
            //show_Display.setText(ProductDB.getProductInfo("1"));
            show_Display.setText("MILK");
               
        }
        else if (event.getSource() == button2) {
            show_Display.setText("EGGS");
        }
        else if (event.getSource() == button3) {
            show_Display.setText("WHITE BREAD");
        }
        else if (event.getSource() == button4) {
            show_Display.setText("RICE");
        }
        else if (event.getSource() == button5) {
            show_Display.setText("STRAWBERRIES");
        }
        else if (event.getSource() == button6) {
            show_Display.setText("GRAPES");
        }
        
    }
    
}
