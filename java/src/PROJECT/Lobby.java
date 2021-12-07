package PROJECT;

import javafx.scene.layout.BackgroundImage;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import PROJECT.*;

public class Lobby extends JFrame {
    private Image bufferImage;
    private Graphics screenGraphic;

    private Image backgroundImage = new ImageIcon("PROJECT/images/s1.png").getImage();

    private ImageIcon exitButtonEnteredImages = new ImageIcon("PROJECT/images/exitButtonEntered.png");
    private ImageIcon exitButtonBasicImages = new ImageIcon("PROJECT/images/exitButtonBasic.png");

    private JButton exitButton = new JButton(exitButtonBasicImages);
    private JLabel menuBar = new JLabel(new ImageIcon("PROJECT/images/menuBar.png"));
    private JLabel click = new JLabel(new ImageIcon("PROJECT/images/click.png"));
    private int mouseX, mouseY;

    public boolean START = false;

    public Lobby() {
        setUndecorated(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle(":틈새");
        setVisible(true);
        setSize(2560, 1600);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(new Color(0, 0, 0, 0));
        setLayout(null);
        exitButton.setBounds(2500, 0, 40, 40);
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setFocusPainted(false);
        exitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                exitButton.setIcon(exitButtonEnteredImages);
                exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                exitButton.setIcon(exitButtonBasicImages);
                exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.exit(0);
            }
        });
        add(exitButton);

        menuBar.setBounds(0, 0, 2560, 50);
        click.setBounds(0, 0, 2560, 1600);
        menuBar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
            }
        });
        click.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                START = true;
            }
        });
        menuBar.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen();
                int y = e.getYOnScreen();
                setLocation(x - mouseX, y - mouseY);
            }
        });


        add(menuBar);
        add(click);

        Music introMusic = new Music("Music.mp3", true);
        introMusic.start();
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            gif();
            if (START) {
                dispose();
                introMusic.close();
                new PLAY1();
                break;
            }
        }
    }

    public int gif = 0;
    public boolean gu = true;

    public void gif() {
        if (gif < 12 && gu) {
            gif++;
        } else if (gif == 1 && !gu) {
            gu = true;
        } else {
            gu = false;
            gif--;
        }
        backgroundImage = new ImageIcon("PROJECT/images/s" + gif + ".png").getImage();
    }

    public void paint(Graphics g) {
        bufferImage = createImage(2560, 1600);
        screenGraphic = bufferImage.getGraphics();
        screenDraw(screenGraphic);
        g.drawImage(bufferImage, 0, 0, null);
    }


    public void screenDraw(Graphics g) {
        g.drawImage(backgroundImage, 0, 0, null);
        paintComponents(g);
        this.repaint();
    }

    public static void main(String[] args) {
        new Lobby();
    }
}
