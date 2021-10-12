package main;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class GUI implements ActionListener {

    private CashRegister cashRegister;
    private Scanner scanner;
    private Keyboard keyboard;

    JLabel label_Display;
    static JLabel show_Display;
    JLabel label_Input;
    JTextField keyboard_Input;
    JButton enter_button;
    JFrame frame;
    JPanel panel;
    JLabel label_buttons;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;

    public GUI() {

        this.cashRegister = new CashRegister();
        this.scanner = new Scanner(this.cashRegister);
        this.keyboard = new Keyboard(this.cashRegister);

        frame = new JFrame();
        panel = new JPanel();

        label_buttons = new JLabel("SCAN PRODUCTS:");
        button1 = new JButton("Milk");
        button1.addActionListener(this);
        button2 = new JButton("Eggs");
        button2.addActionListener(this);
        button3 = new JButton("White Bread");
        button3.addActionListener(this);
        button4 = new JButton("Rice");
        button4.addActionListener(this);
        button5 = new JButton("Strawberries");
        button5.addActionListener(this);
        button6 = new JButton("Grapes");
        button6.addActionListener(this);

        label_Input = new JLabel("ENTER UPC CODE MANUALLY:"); 
        keyboard_Input = new JTextField();
        enter_button = new JButton("ENTER");

        label_Display = new JLabel("DISPLAY:");
        show_Display = new JLabel("No Product Selected");

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(20,2));

        panel.add(label_buttons);
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
        panel.add(enter_button);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Cash Register");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        // SCANNER BUTTONS
        if (event.getSource() == button1) {
            this.scanner.scannedUPCCode("1");
        }
        else if (event.getSource() == button2) {
            this.scanner.scannedUPCCode("2");
        }
        else if (event.getSource() == button3) {
            this.scanner.scannedUPCCode("3");
        }
        else if (event.getSource() == button4) {
            this.scanner.scannedUPCCode("4");
        }
        else if (event.getSource() == button5) {
            this.scanner.scannedUPCCode("5");
        }
        else if (event.getSource() == button6) {
            this.scanner.scannedUPCCode("6");
        }
        // MANUAL INPUT BUTTON
        if (event.getSource() == enter_button) {
            String input = keyboard_Input.getText();
            this.keyboard.setUPCCode(input);
        }
    }

    public static void setDisplay(String text) {
        show_Display.setText(text);
    }
    
    public static void main(String[] args) {
        new GUI();
    }
}
