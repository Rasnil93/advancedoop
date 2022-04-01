package ChangeCircleColor;

import javax.swing.*;
import java.awt.*;

class Circle extends JComponent {
    private int x;
    private int y;
    private int radius;
    private Color color;

    public Circle(int x, int y, int radius, Color color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillOval(x, y, radius, radius);
    }
}

class CircleCon extends JPanel {
    private int x, y, radius;
    private Color color;

    public CircleCon(int x, int y, int radius, Color color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius, radius);
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
