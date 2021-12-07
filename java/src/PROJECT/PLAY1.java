package PROJECT;

import javafx.stage.Screen;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Robot;

import java.io.File;
import java.io.IOException;
import java.sql.Wrapper;
import java.util.Arrays;

import PROJECT.*;


public class PLAY1 extends JFrame {
    private Image bufferImage;
    private Graphics screenGraphic;


    private Image roundImage = new ImageIcon("PROJECT/images/11.gif").getImage();
    private Image backgroundImage = new ImageIcon("PROJECT/images/background.png").getImage();
    private Image player = new ImageIcon("PROJECT/PlayerAnimation/moveR.gif").getImage();
    private Image Lplayer = new ImageIcon("PROJECT/PlayerAnimation/moveL.gif").getImage();
    private Image Rplayer = new ImageIcon("PROJECT/PlayerAnimation/moveR.gif").getImage();
    private Image heart = new ImageIcon("PROJECT/images/heart.gif").getImage();
    private Image redheart = new ImageIcon("PROJECT/images/redheart.gif").getImage();
    private Image brush = new ImageIcon("PROJECT/images/brush.png").getImage();
    private Image Countdown = new ImageIcon("PROJECT/images/Countdown.gif").getImage();
    private Image Coin = new ImageIcon("PROJECT/images/coin.gif").getImage();
    private ImageIcon exitButtonEnteredImages = new ImageIcon("PROJECT/images/exitButtonEntered.png");
    private ImageIcon exitButtonBasicImages = new ImageIcon("PROJECT/images/exitButtonBasic.png");

    private JButton exitButton = new JButton(exitButtonBasicImages);
    private JLabel menuBar = new JLabel(new ImageIcon("PROJECT/images/menuBar.png"));

    private int mouseX, mouseY, coinX, coinY = -8000, coinspeed = 40;

    private int playerX, playerY;
    public int playerWidth = player.getWidth(null);
    public int playerHeight = player.getHeight(null);
    public int coinWidth = Coin.getWidth(null);
    public int coinHeight = Coin.getHeight(null);

    public int wordX = 900, wordY = -7000;

    AffineTransform affineTransform = new AffineTransform();
    FontRenderContext frc = new FontRenderContext(affineTransform, true, true);

    Font JS;
    Font HH;
    Font BR;

    public int wordWidth;
    public int wordHeight;

    public boolean left, right;

    public boolean isWrong = false;

    public int fontSize = 800, rotate = 0;

    // 연우가 추천해준 곡 "아이유 금요일에 만나요" //
    static String str = "요일엔 아마 바쁘지 않을까 화요일도 성급해 보이지 안 그래 수요일은 뭔가 어정쩡한 느낌 목요일은 그냥 내가 왠지 싫어 우 이번 주 금요일 우 금요일에 시간 어때요 주말까지 기다리긴 힘들어 시간아 달려라 시계를 더 보채고 싶지만 (mind control) 일분 일초가 달콤해 이 남자 도대체 뭐야 사랑에 빠지지 않곤 못 배기겠어 온 종일 내 맘은 저기 시계바늘 위에 올라타 한 칸씩 그대에게 더 가까이 우 이번 주 금요일 우 금요일에 시간 어때요 딱히 보고 싶은 영화는 없지만 딱히 먹고 싶은 메뉴는 없지만 주말까지 기다리긴 힘들어 시간아 달려라 시계를 더 보채고 싶지만 (mind control) 일분 일초가 달콤해 이 남자 도대체 뭐야 사랑에 빠지지 않곤 못 배기겠어 온 종일 내 맘은 저기 시계바늘 위에 올라타 한 칸씩 그대에게 더 가까이 나 뭔가에 홀린 것 같아 이 여잔 도대체 뭐야 사랑해주지 않고는 못 배기겠어 돌아오는 이번 주 금요일에 만나요 그 날 내 맘을 더 가져가줘요 더 가까이 더 가까이 와요 더 가까이";
    static String restr = str.replaceAll("\\s+", "");
    static String[] cutstr = restr.split("");

    static String word = "월", word1 = "", word2 = "";
    static String Redword = "";
    static String stackString = "";
    static int j = 0, life = 5;
    static int score;

    static Color Wordcolor = new Color(232, 156, 149);
    static Color Wrongcolor = new Color(237, 111, 99);

    public PLAY1() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);

        try {
            HH = Font.createFont(Font.TRUETYPE_FONT, new File("PROJECT/font/HH.ttf")).deriveFont(800f);
            GraphicsEnvironment he = GraphicsEnvironment.getLocalGraphicsEnvironment();
            he.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("PROJECT/font/HH.ttf")));
        } catch (IOException | FontFormatException e) {

        }
        try {
            JS = Font.createFont(Font.TRUETYPE_FONT, new File("PROJECT/font/JSArirang.ttf")).deriveFont(200f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("PROJECT/font/JSArirang.ttf")));
        } catch (IOException | FontFormatException e) {

        }
        try {
            BR = Font.createFont(Font.TRUETYPE_FONT, new File("PROJECT/font/BRUSH.ttf")).deriveFont(100f);
            GraphicsEnvironment ie = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ie.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("PROJECT/font/BRUSH.ttf")));
        } catch (IOException | FontFormatException e) {

        }
        wordWidth = (int) (HH.getStringBounds(word, frc).getWidth());
        wordHeight = (int) (HH.getStringBounds(word, frc).getHeight());

        setTitle(":틈새");
        setVisible(true);
        setSize(2560, 1600);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(new Color(0, 0, 0, 0));
        setLayout(null);
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_A:
                        left = true;
                        break;
                    case KeyEvent.VK_D:
                        right = true;
                        break;
                    case KeyEvent.VK_S:
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
                    case KeyEvent.VK_S:
                        rotate = rotate + 2;
                        break;
                    case KeyEvent.VK_M:
                        life = 0;
                }
            }
        });
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
        Init();
        while (true) {
            KeyProcess();
            Crash1();
            MoveWord();
        }
    }

    public void Init() {
        playerX = (2560 - playerWidth) / 2;
        playerY = 1470;
        coinX = (int) (Math.random() * (750 - playerWidth) + 950);
    }

    public boolean direction;

    public void KeyProcess() {
        if (left && playerX - 1000 > 0) {
            playerX -= 20;
            player = Lplayer;
            direction = true;
        }
        if (right && playerX + playerWidth + 3 < 1600) {
            playerX += 20;
            player = Rplayer;
            direction = false;
        }
    }

    Robot s = null;

    public void Crash1() {
        Crash2();
        try {
            s = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        if (s.getPixelColor(playerX + 56, playerY - 20).getRGB() == Wordcolor.getRGB()) {
            wordY = -200;
            stackString = word;
            isWrong = true;
            ChageColor();
            ChangeWord();
        }
    }

    public void Crash2() {
        if (playerX + playerWidth > coinX && coinX + coinWidth > playerX && playerY + playerHeight > coinY && coinY + coinHeight > playerY) {
            coinY = -200;
            coinX = (int) (Math.random() * (750 - playerWidth) + 950);
            PLAY1.score += 1;
            coinspeed = (int) (Math.random() * 40 + 20);
            Music coinmusic = new Music("Coin.mp3", false);
            coinmusic.start();
        }
        if (coinY >= 1900) {
            coinY = -200;
            coinX = (int) (Math.random() * (750 - playerWidth) + 950);
            coinspeed = (int) (Math.random() * 40 + 20);
        }
    }

    public void MoveWord() {
//        wordBY += 30;
//        if (wordY >= 500)
//            ChangeWord();
        if (wordY >= 1500 && rotate == 0) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            wordY = -200;
            ChangeWord();
        }
        if (wordY >= 1700 && rotate == 2) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            wordY = -200;
            ChangeWord();
        }
    }


    public void ChangeWord() {
        word = cutstr[j];
        j++;

    }

    static int W;


    private void ChageColor() {
        ControlLife();
        if (direction) {
            player = new ImageIcon("PROJECT/PlayerAnimation/redmoveL.gif").getImage();
        }
        if (!direction) {
            player = new ImageIcon("PROJECT/PlayerAnimation/redmoveR.gif").getImage();
        }
    }

    public void ControlLife() {
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        life--;
    }

    public void paint(Graphics g) {
        bufferImage = createImage(2560, 1600);
        screenGraphic = bufferImage.getGraphics();
        screenDraw(screenGraphic);
        MoveWord(screenGraphic);
        LifeDraw(screenGraphic);
        WrongDraw(screenGraphic);
        CoinScore(screenGraphic);
        Count(screenGraphic);
        g.drawImage(bufferImage, 0, 0, null);
    }

    public void screenDraw(Graphics g) {
        g.drawImage(backgroundImage, 0, 0, null);
        g.drawImage(roundImage, 860, 50, null);
        this.repaint();
    }

    public void CoinScore(Graphics l) {
        l.setColor(Color.WHITE);
        l.setFont(BR);
        l.drawString("SCORE: " + score, 70, 400);
        this.repaint();
    }

    public void Count(Graphics h) {
        h.drawImage(Coin, coinX, coinY, null);
        h.drawImage(Countdown, 800, 500, null);
        if (wordY >= -200) Countdown = null;
    }

    public void LifeDraw(Graphics i) {
        i.drawImage(player, playerX, playerY, null);
        paintComponents(i);
        switch (life) {
            case 5:
                i.drawImage(heart, 450, 150, null);
            case 4:
                i.drawImage(heart, 350, 150, null);
            case 3:
                i.drawImage(heart, 250, 150, null);
            case 2:
                i.drawImage(heart, 150, 150, null);
            case 1:
                i.drawImage(heart, 50, 150, null);
                break;
        }
        switch (5 - life) {
            case 5:
                life--;
                dispose();
                new GameOver();
                break;
            case 4:
                i.drawImage(redheart, 150, 150, null);
            case 3:
                i.drawImage(redheart, 250, 150, null);
            case 2:
                i.drawImage(redheart, 350, 150, null);
            case 1:
                i.drawImage(redheart, 450, 150, null);
                break;
            case 0:
        }
    }

    static int WrongX = 2000, WrongY = 300;

    public void WrongDraw(Graphics j) {
        j.setFont(JS);
        j.setColor(Wrongcolor);
//        j.drawRect(WrongX - 30, WrongY - 200, 250, 250);
        j.drawImage(brush, WrongX - 350, WrongY - 300, null);
        j.drawString(stackString, WrongX, WrongY);
    }


    public void MoveWord(Graphics k) {
        coinY += coinspeed;
        super.paint(k);
        k.setColor(Wordcolor);
        k.setFont(HH);

        Graphics2D g2d = (Graphics2D) k;
        AffineTransform defaultAt = g2d.getTransform();

        AffineTransform at0 = AffineTransform.getQuadrantRotateInstance(rotate);
        g2d.setTransform(at0);

        switch (rotate) {
            case 0:
                g2d.drawString(word, wordX, wordY);
                wordY += 30;
                break;
            case 2:
                g2d.drawString(word, -wordX - 800, -wordY + 800);
                wordY += 30;
                break;
            case 4:
                rotate = 0;
                break;
        }

        g2d.setTransform(defaultAt);
    }


}
