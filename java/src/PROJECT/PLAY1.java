package PROJECT;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Robot;


public class PLAY1 extends JFrame {
    private Image bufferImage;
    private Graphics screenGraphic;

    private Image backgroundImage = new ImageIcon("PROJECT/images/background.jpg").getImage();
    static Image player = new ImageIcon("PROJECT/PlayerAnimation/MoveR.png").getImage();

    private int playerX, playerY;
    private int playerWidth = player.getWidth(null);
    private int playerHeight = player.getHeight(null);

    private int wordX = 950, wordY = 200;

    static String word = "최형우";
    AffineTransform affineTransform = new AffineTransform();
    FontRenderContext frc = new FontRenderContext(affineTransform, true, true);
    Font font = new Font("Nanum", Font.BOLD, 200);
    int wordWidth = (int) (font.getStringBounds(word, frc).getWidth());
    int wordHeight = (int) (font.getStringBounds(word, frc).getHeight());
    Color judgement = new Color(12, 12, 12, 0);

    public boolean left, right;

    public PLAY1() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);


        setTitle("프로젝트 게임");
        setVisible(true);
        setSize(2560, 1600);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_A:
                        left = true;
                        break;
                    case KeyEvent.VK_D:
                        right = true;
                        break;
                }
            }

            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_A:
                        left = false;
                        break;
                    case KeyEvent.VK_D:
                        right = false;
                        break;
                }
            }
        });
        Init();
        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            KeyProcess();
            MoveWord();
//            crashCheck();
        }
    }

    public void Init() {
        playerX = (2560 - playerWidth) / 2;
        playerY = 1400;
    }

    public void KeyProcess() {
        if (left && playerX - 3 > 0) {
            playerX -= 20;
            player = new ImageIcon("PROJECT/PlayerAnimation/MoveL.png").getImage();
        }
        if (right && playerX + playerWidth + 3 < 2560) {
            playerX += 20;
            player = new ImageIcon("PROJECT/PlayerAnimation/MoveR.png").getImage();
        }
    }

    public void MoveWord() {
        wordY += 10;
        try {
            Robot s = new Robot();
            System.out.println(s.getPixelColor(playerX + 80, playerY + 15).getRGB());
        System.out.println(Color.WHITE.getRGB());
            if (s.getPixelColor(playerX + 80, playerY+15).getRGB() == Color.WHITE.getRGB()) {
                wordY = 200;
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void paint(Graphics g) {
        bufferImage = createImage(2560, 1600);
        screenGraphic = bufferImage.getGraphics();
        screenDraw(screenGraphic);
        g.drawImage(bufferImage, 0, 0, null);
    }


    public void screenDraw(Graphics g) {
        g.drawImage(backgroundImage, 0, 0, null);
        g.drawImage(player, playerX, playerY, null);
        g.setColor(Color.WHITE);

        g.setFont(font);
        g.drawString(word, 1280, wordY);
        this.repaint();
//        g.drawRect(playerX + 80, playerY + 15, 1, 1);
    }

    public static void main(String[] args) {
        new PLAY1();
    }


}
