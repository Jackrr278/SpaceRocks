package org.jackrr;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private int posX = 0;
    private int posY = 0;

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        graphics.drawRect(posX,posY,50,50);

    }

    public void moveRect(int speed) {
        posX = posX + speed;
        repaint();
    }
}
