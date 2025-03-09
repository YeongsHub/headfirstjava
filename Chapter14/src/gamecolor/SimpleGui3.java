package gamecolor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui3 {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();

    public static void main(String[] args) {
        SimpleGui3 gui = new SimpleGui3();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change label");
        labelButton.addActionListener(event -> label.setText("Ouch"));

        JButton colorButton = new JButton("Change colors");
        colorButton.addActionListener(event -> frame.repaint());

        label = new JLabel("I'm a label");
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);


        frame.setSize(500, 400);
        frame.setVisible(true);
    }

}
