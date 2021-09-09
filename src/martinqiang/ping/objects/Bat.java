package martinqiang.ping.objects;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bat extends JPanel {

    private BufferedImage batImage;
    private int yPos = 0;

    public Bat() {
        try {
            batImage = ImageIO.read(new File("res/bat.png"));



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        int x = getWidth() - batImage.getWidth();
        g.drawImage(batImage, x, yPos, this);

    }
}
