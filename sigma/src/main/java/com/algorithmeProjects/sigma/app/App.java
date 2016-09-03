package com.algorithmeProjects.sigma.app;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class App extends JFrame {

    public App() {

        initUI();
    }

    private void initUI() {
        
        setTitle("Simple example");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
        
            public void run() {
            	App ex = new App();
                ex.setVisible(true);
            }
        });
    }
}
