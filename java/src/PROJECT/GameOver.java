package PROJECT;

import javafx.scene.layout.BackgroundImage;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import PROJECT.*;

public class GameOver extends JFrame {
    private Image bufferImage;
    private Graphics screenGraphic;

    private Image backgroundImage = new ImageIcon("PROJECT/images/ss1.png").getImage();

    private ImageIcon exitButtonEnteredImages = new ImageIcon("PROJECT/images/exitButtonEntered.png");
    private ImageIcon exitButtonBasicImages = new ImageIcon("PROJECT/images/exitButtonBasic.png");
    private ImageIcon retryButtonEnteredImages = new ImageIcon("PROJECT/images/retryc.png");
    private ImageIcon retryButtonBasicImages = new ImageIcon("PROJECT/images/retry.png");
    private ImageIcon exitbuttonEnteredImages = new ImageIcon("PROJECT/images/exitc.png");
    private ImageIcon exitbuttonBasicImages = new ImageIcon("PROJECT/images/exit.png");
    private Image scoreImages = new ImageIcon("PROJECT/images/score.png").getImage();

    private JButton exitButton = new JButton(exitButtonBasicImages);
    private JButton retryButton = new JButton(retryButtonBasicImages);
    private JButton exitbutton = new JButton(exitbuttonBasicImages);
    private JLabel menuBar = new JLabel(new ImageIcon("PROJECT/images/menuBar.png"));

    Font BR;

    private int mouseX, mouseY;
    static int Score;


    public GameOver() {
        try {
            BR = Font.createFont(Font.TRUETYPE_FONT, new File("PROJECT/font/BRUSH.ttf")).deriveFont(200f);
            GraphicsEnvironment ie = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ie.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("PROJECT/font/BRUSH.ttf")));
        } catch (IOException | FontFormatException e) {
            System.out.println(e.getMessage());
        }
        Score = PLAY1.score;
        setUndecorated(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("틈새");
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

        exitbutton.setBounds(1600, 800, 250, 100);
        exitbutton.setBorderPainted(false);
        exitbutton.setContentAreaFilled(false);
        exitbutton.setFocusPainted(false);
        exitbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                exitbutton.setIcon(exitbuttonEnteredImages);
                exitbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                exitbutton.setIcon(exitbuttonBasicImages);
                exitbutton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.exit(0);
            }
        });
        add(exitbutton);

        retryButton.setBounds(800, 800, 250, 100);
        retryButton.setBorderPainted(false);
        retryButton.setContentAreaFilled(false);
        retryButton.setFocusPainted(false);
        retryButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                retryButton.setIcon(retryButtonEnteredImages);
                retryButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                retryButton.setIcon(retryButtonBasicImages);
                retryButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                restart();
            }
        });
        add(retryButton);

        menuBar.setBounds(0, 0, 2560, 50);
        menuBar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
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
        Music introMusic = new Music("Music.mp3", true);
        introMusic.start();
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            gif();
            break;
        }
    }
    public int gif = 0;

    public boolean gu = true;

    public void gif() {
        if (gif < 3 && gu) {
            gif++;
        } else if (gif == 1) {
            gu = true;
        } else {
            gu = false;
            gif--;
        }
        backgroundImage = new ImageIcon("PROJECT/images/ss" + gif + ".png").getImage();

    }
    public void paint(Graphics g) {
        bufferImage = createImage(2560, 1600);
        screenGraphic = bufferImage.getGraphics();
        screenDraw(screenGraphic);
        g.drawImage(bufferImage, 0, 0, null);
        repaint();
    }

    public void screenDraw(Graphics g) {
        g.setColor(Color.WHITE);
        g.setFont(BR);
        g.drawImage(backgroundImage, 0, 0, null);
        g.drawImage(scoreImages, 1200, 650, null);
        g.drawString(String.valueOf(Score), 1300, 800);
        paintComponents(g);
    }

    public void restart() {
        PLAY1 p = new PLAY1();
        Score = PLAY1.score;
    }
}
