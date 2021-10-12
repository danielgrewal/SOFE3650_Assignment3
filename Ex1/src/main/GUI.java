package main;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class GUI implements ActionListener {

    private CashRegister cashRegister;

    JLabel label_Display;
    static JLabel show_Display;
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

    public GUI() {

        this.cashRegister = new CashRegister();

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

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == button1) {
            this.cashRegister.setCurrentProductUPC("1");
        }
        else if (event.getSource() == button2) {
            this.cashRegister.setCurrentProductUPC("2");
        }
        else if (event.getSource() == button3) {
            this.cashRegister.setCurrentProductUPC("3");
        }
        else if (event.getSource() == button4) {
            this.cashRegister.setCurrentProductUPC("4");
        }
        else if (event.getSource() == button5) {
            this.cashRegister.setCurrentProductUPC("5");
        }
        else if (event.getSource() == button6) {
            this.cashRegister.setCurrentProductUPC("6");
        }
    }

    public static void setDisplay(String text) {
        show_Display.setText(text);
    }
    
    public static void main(String[] args) {
        new GUI();
    }
}
