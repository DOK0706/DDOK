package chap13;

import javax.swing.*;

class Swing extends JFrame {
    Swing() {
        setTitle("자바 스윙 발표");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(500, 500);
        setVisible(true);
    }
}
public class SwingTest {
    public static void main(String[] args) {
        new Swing();
    }
}
