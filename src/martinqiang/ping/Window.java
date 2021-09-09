package martinqiang.ping;

import martinqiang.ping.objects.Bat;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Window extends JFrame{

    private static final int WIDTH = 512, HEIGHT = 512;
    private static final String NAME = "Ping";

    private int player1Score = 0;
    private int player2Score = 0;

    // Constructor
    public Window(){
        // Initialisation of the game window
        initScreen();
        //initGUI();
        //updateWindow();
        add(new Bat());
        setVisible(true);
    }

    private void initScreen(){

        Dimension minSize = new Dimension(WIDTH,HEIGHT);
        setTitle(NAME);
        setMinimumSize(minSize);
        setGameIcon();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit game on closing window
        setResizable(false);
        setLocationRelativeTo(null); // Open game in centre
        setBackground(new Color(69,69,69));
    }

    private void initGUI(){
        // Initialise game panel
        JPanel gamePanel = new JPanel();
        gamePanel.setLayout(null);
        add(gamePanel);

        //initialise scores
        JLabel p1ScoreLabel = new JLabel(String.valueOf(player1Score));
        p1ScoreLabel.setForeground(Color.WHITE);
        p1ScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        p1ScoreLabel.setFont(new Font("Osaka",Font.BOLD,40));
        p1ScoreLabel.setBounds(0, 0, this.getWidth()-60, 60);
        gamePanel.add(p1ScoreLabel);

        JLabel p2ScoreLabel = new JLabel(String.valueOf(player2Score));
        p2ScoreLabel.setForeground(Color.WHITE);
        p2ScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        p2ScoreLabel.setFont(new Font("Osaka",Font.BOLD,40));
        p2ScoreLabel.setBounds(0, 0, this.getWidth()+60, 60);
        gamePanel.add(p2ScoreLabel);



    }
    private void setGameIcon() {
        ImageIcon logoIcon = new ImageIcon("res/ping.png");
        Image logo = logoIcon.getImage();
        setIconImage(logo);
    }


//    public void updateWindow() {
//        validate();
//        repaint();
//    }


}
