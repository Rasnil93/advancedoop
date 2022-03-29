import javax.swing.*;
import java.awt.*;

public class ChangeCircleColor {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Change Circle Color");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(600, 600);
        frame.setVisible(true);

        JButton redButton = new JButton("Red");
        JButton greenButton = new JButton("Green");
        JButton blueButton = new JButton("Blue");
        JLabel circleLabel = new JLabel(new CircleIcon(50, Color.RED));

        frame.add(redButton);
        frame.add(greenButton);
        frame.add(blueButton);
        frame.add(circleLabel);

        redButton.addActionListener(e -> {
            circleLabel.setIcon(new CircleIcon(50, Color.RED));
            circleLabel.repaint();
        });

        greenButton.addActionListener(e -> {
            circleLabel.setIcon(new CircleIcon(50, Color.GREEN));
            circleLabel.repaint();
        });

        blueButton.addActionListener(e -> {
            circleLabel.setIcon(new CircleIcon(50, Color.BLUE));
            circleLabel.repaint();
        });
    }


}
