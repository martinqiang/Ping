package martinqiang.ping.objects;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bat extends JPanel {

    private BufferedImage batImage;
    private int yPos;
    private int xPos;

    private int windowHeight;
    private int height = 0;

    public Bat(Window w) {
        yPos = 0;
        xPos = 0;
        windowHeight = w.getHeight();
        try {
            batImage = ImageIO.read(new File("res/bat.png"));
            height = batImage.getHeight();


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
    public void moveUp(){
        if (yPos > 0){
            yPos -= 1;
        }
    }
    public void moveDown(){
        if ((yPos + height) < windowHeight) {
            yPos += 1;
        }
    }
    public int getYPos(){
        return yPos;
    }

    public void setYPos(int yPos){
        this.yPos = yPos;
    }

    public int getXPos() {
        return xPos;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

}
