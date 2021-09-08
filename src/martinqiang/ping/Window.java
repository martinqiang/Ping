package martinqiang.ping;

import java.awt.*;
import javax.swing.*;

public class Window {

    JFrame frame;
    private static final int WIDTH = 512, HEIGHT = 512;
    private static final String NAME = "Ping";

    private int player1Score = 0;
    private int player2Score = 0;

    // Constructor
    public Window() {
        // Initialisation of the game window
        initScreen();
        initGUI();

    }

    private void initScreen(){

        frame = new JFrame(NAME);

        Dimension mSize = new Dimension(WIDTH,HEIGHT);

        frame.setMinimumSize(mSize);
        setGameIcon("res/ping.png");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit game on closing window
        frame.setResizable(false);
        frame.setLocationRelativeTo(null); // Open game in centre
        frame.setVisible(true);
    }

    private void initGUI() {
        JPanel gamePanel = new JPanel();
        gamePanel.setBackground(new Color(69,69,69));
        gamePanel.setLayout(null);
        frame.add(gamePanel);

        JLabel p1ScoreLabel = new JLabel(String.valueOf(player1Score));
        p1ScoreLabel.setForeground(Color.WHITE);
        p1ScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        p1ScoreLabel.setFont(new Font("Osaka",Font.BOLD,40));
        p1ScoreLabel.setBounds(0, 0, frame.getWidth()-60, 60);
        gamePanel.add(p1ScoreLabel);

        JLabel p2ScoreLabel = new JLabel(String.valueOf(player2Score));
        p2ScoreLabel.setForeground(Color.WHITE);
        p2ScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        p2ScoreLabel.setFont(new Font("Osaka",Font.BOLD,40));
        p2ScoreLabel.setBounds(0, 0, frame.getWidth()+60, 60);
        gamePanel.add(p2ScoreLabel);
    }
    public void setGameIcon(String fileName) {
        ImageIcon logoIcon = new ImageIcon(fileName);
        Image logo = logoIcon.getImage();
        frame.setIconImage(logo);
    }
}
