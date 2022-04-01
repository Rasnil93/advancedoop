package ChangeCircleColor;

import javax.swing.*;
import java.awt.*;

public class ChangeCircleColor {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Change Circle Color");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JButton redButton = new JButton("Red");
        JButton greenButton = new JButton("Green");
        JButton blueButton = new JButton("Blue");

        Circle circle = new Circle(10,10,50, Color.BLACK);
        frame.add(circle);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        buttonPanel.add(redButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(blueButton);
        frame.add(buttonPanel, BorderLayout.NORTH);
        frame.add(circle);


        redButton.addActionListener(e -> {
            circle.setColor(Color.RED);
            circle.repaint();
        });

        greenButton.addActionListener(e -> {
            circle.setColor(Color.GREEN);
            circle.repaint();
        });

        blueButton.addActionListener(e -> {
            circle.setColor(Color.BLUE);
            circle.repaint();
        });

        frame.setVisible(true);
    }


}
