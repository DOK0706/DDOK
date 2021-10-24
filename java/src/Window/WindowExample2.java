package Window;

import javax.swing.*;
import java.awt.*;

public class WindowExample2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Program");
        frame.setPreferredSize(new Dimension(200, 70));
        frame.setLocation(500, 400);
        Container contentPane = frame.getContentPane();
        JTextField text = new JTextField();
        JButton button = new JButton("확인");
        JLabel label = new JLabel("Hello");
        contentPane.add(text, BorderLayout.CENTER);
        contentPane.add(button, BorderLayout.EAST);
        contentPane.add(label, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
