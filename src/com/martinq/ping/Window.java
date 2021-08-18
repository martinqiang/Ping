package com.martinq.ping;

import java.awt.*;
import javax.swing.*;

public class Window extends JFrame{
    public static final int WIDTH = 256, HEIGHT = 256;
    public static final String NAME = "Ping Game";
    public Window() {
        // Initialisation of the game window
        setTitle(NAME);
        setSize(WIDTH,HEIGHT);
        setVisible(true);
        setGameIcon("res/ping.png");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit game on closing window
        setResizable(false);
        setLocationRelativeTo(null); // Centre game in screen

    }
    public void setGameIcon(String fileName) {
        ImageIcon logoIcon = new ImageIcon(fileName);
        Image logo = logoIcon.getImage();
        setIconImage(logo);
    }
}
