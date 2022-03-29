import javax.swing.*;
import java.awt.*;

public class CircleIcon implements Icon {
    private int width;
    private int height;
    private Color color;

    public CircleIcon(int width, Color color) {
        this.width = width;
        this.height = width;
        this.color = color;
    }

    public int getIconWidth() {
        return width;
    }

    public int getIconHeight() {
        return height;
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
}
