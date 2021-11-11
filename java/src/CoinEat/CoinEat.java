package CoinEat;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CoinEat extends JFrame {
    private Image bufferImage;
    private Graphics screenGraphic;

    private Image backgroundImage = new ImageIcon("CoinEat/images/MainScreen.jpg").getImage();
    private Image player = new ImageIcon("CoinEat/images/player.png").getImage();
    private Image coin = new ImageIcon("CoinEat/images/coin .png").getImage();

    private int playerX, playerY;
    private int playerWidth = player.getWidth(null);
    private int playerHeight = player.getHeight(null);
    private int coinX, coinY;
    private int coinWidth = coin.getWidth(null);
    private int coinrHeight = coin.getHeight(null);

    private int score;

    public boolean up, down, left, right;

    public CoinEat() {
        setTitle("동전 먹기 게임");
        setVisible(true);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_W:
                        up = true;
                        break;
                    case KeyEvent.VK_S:
                        down = true;
                        break;
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
                    case KeyEvent.VK_W:
                        up = false;
                        break;
                    case KeyEvent.VK_S:
                        down = false;
                        break;
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
            crashCheck();
        }
    }

    public void Init() {
        score = 0;
        playerX = (500 - playerWidth) / 2;
        playerY = (500 - playerHeight) / 2;

        coinX = (int) (Math.random() * (501 - playerWidth));
        coinY = (int) (Math.random() * (501 - playerHeight - 30)) + 30;
    }

    public void KeyProcess() {
        if (up && playerY - 3 > 30) playerY -= 3;
        if (down && playerY + playerHeight + 3 < 500) playerY += 3;
        if (left && playerX - 3 > 0) playerX -= 3;
        if (right && playerX + playerWidth + 3 < 500) playerX += 3;
    }

    public void crashCheck() {
        if (playerX+playerWidth > coinX && coinX + coinWidth > playerX && playerY + playerHeight > coinY && coinY + coinrHeight > playerY) {
            score+=100;
            coinX = (int) (Math.random() * (501 - playerWidth));
            coinY = (int) (Math.random() * (501 - playerHeight - 30)) + 30;
        }
    }

    public void paint(Graphics g) {
        bufferImage = createImage(500, 500);
        screenGraphic = bufferImage.getGraphics();
        screenDraw(screenGraphic);
        g.drawImage(bufferImage, 0, 0, null);
    }


    public void screenDraw(Graphics g) {
        g.drawImage(backgroundImage, 0, 0, null);
        g.drawImage(coin, coinX, coinY, null);
        g.drawImage(player, playerX, playerY, null);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString("SCORE : " + score, 30, 80);
        this.repaint();
    }

    public static void main(String[] args) {
        new CoinEat();
    }
}
