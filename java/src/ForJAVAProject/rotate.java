package ForJAVAProject;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class rotate {
    public static void main(String[] args) {
        new rotate();
    }

    rotate() {
        JFrame frame = new JFrame();

        frame.add(new MyComponent());

        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }

}

class MyComponent extends JComponent {
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;

        g2d.drawString("시발존나카리스마있어", 100, 100);
        AffineTransform at = new AffineTransform();
        at.setToRotation(Math.PI / 2.0);
        g2d.setTransform(at);
        g2d.drawString("시발존나카리스마있어", 100, 100);

    }
}