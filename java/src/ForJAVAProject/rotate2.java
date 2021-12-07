package ForJAVAProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class rotate2 extends JFrame {

    public rotate2() {
        super("Vertical Text Drawing Example");

        setSize(1600, 1600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setFont(new Font("궁서체", Font.BOLD, 800));
        g.setColor(Color.BLUE);
//        g.drawString("와", 800, 800);

        Graphics2D g2d = (Graphics2D) g;
        AffineTransform defaultAt = g2d.getTransform();

        AffineTransform at0 = AffineTransform.getQuadrantRotateInstance(0);
        g2d.setTransform(at0);

        g2d.drawString("와", 800, 800);

        g2d.setTransform(defaultAt);

        // rotates the coordinate by 90 degree counterclockwise
        AffineTransform at1 = AffineTransform.getQuadrantRotateInstance(1);
        g2d.setTransform(at1);

        g2d.drawString("와", 0, -800);

        g2d.setTransform(defaultAt);


        AffineTransform at2 = AffineTransform.getQuadrantRotateInstance(2);
        g2d.setTransform(at2);

        g2d.drawString("와", -1600, 0);

        g2d.setTransform(defaultAt);

        AffineTransform at3 = AffineTransform.getQuadrantRotateInstance(3);
        g2d.setTransform(at3);

        g2d.drawString("와", -800, 1600);

        g2d.setTransform(defaultAt);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new rotate2().setVisible(true);
            }
        });
    }

}