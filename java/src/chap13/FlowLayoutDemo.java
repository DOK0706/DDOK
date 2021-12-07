package chap13;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {
    FlowLayoutDemo() {
        setTitle("플로우 레이아웃");

        JPanel p = new JPanel(new FlowLayout());

        JButton b1 = new JButton("독 ");
        JButton b2 = new JButton("민준");
        JButton b3 = new JButton("성훈");
        JButton b4 = new JButton("지예");
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        add(p);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 110);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}



