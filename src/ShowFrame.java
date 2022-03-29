import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;


public class ShowFrame extends JFrame{
    static JFrame window = new JFrame(); //STATIC: We can only have one window.

    class GPanel extends JPanel {
        public GPanel() {
            window.setPreferredSize(new Dimension(300, 300));
        }

        @Override
        public void paintComponent(Graphics g) {
            //rectangle originates at 10,10 and ends at 240,240
            g.drawRect(10, 10, 240, 240);
            //filled Rectangle with rounded corners.
            g.fillRoundRect(50, 50, 100, 100, 80, 80);
        }
    }


    public void main(String[] args) {
        setWindowsSettings();
        window.add(new GPanel());

    }

    public static void setWindowsSettings()
    {
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,400);
        window.setVisible(true);
    }
}