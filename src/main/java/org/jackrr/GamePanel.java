package org.jackrr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GamePanel extends JPanel {

    private int posX = 0;
    private int posY = 0;

    public GamePanel() {
        setupKeys();
    }

    private void setupKeys() {

        // Up Arrow
        getInputMap().put(KeyStroke.getKeyStroke("W"), "moveUp");
        getActionMap().put("moveUp", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveRect(0,-5);
            }
        });

        // Down Arrow
        getInputMap().put(KeyStroke.getKeyStroke("S"), "moveDown");
        getActionMap().put("moveDown", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveRect(0,5);
            }
        });

    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        graphics.drawRect(posX,posY,50,50);

    }

    public void moveRect(int x, int y) {
        posX = posX + x;
        posY = posY + y;
        repaint();
    }
}
