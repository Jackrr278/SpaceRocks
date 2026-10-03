package org.jackrr;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Initialise gamePanel
        GamePanel gamePanel = new GamePanel();

        // Initialise gameWindow
        JFrame gameWindow = new JFrame();
        gameWindow.setSize(500,500);
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.add(gamePanel);
        gameWindow.setVisible(true);

        Timer gameTimer = new Timer(5, e -> {
            gamePanel.updateUI();
        });
        gameTimer.start();
    }
}
