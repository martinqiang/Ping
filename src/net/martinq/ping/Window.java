package net.martinq.ping;

import java.awt.*;
import javax.swing.*;

public class Window {
    JFrame frame;
    public static final int WIDTH = 256, HEIGHT = 256;
    public static final String NAME = "Ping Game";
    public Window() {
        // Initialisation of the game window
        frame = new JFrame(NAME);
        frame.setSize(WIDTH,HEIGHT);
        frame.setVisible(true);
        setGameIcon("res/ping.png");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit game on closing window
        frame.setResizable(false);
        frame.setLocationRelativeTo(null); // Open game in centre

    }
    public void setGameIcon(String fileName) {
        ImageIcon logoIcon = new ImageIcon(fileName);
        Image logo = logoIcon.getImage();
        frame.setIconImage(logo);
    }
}
