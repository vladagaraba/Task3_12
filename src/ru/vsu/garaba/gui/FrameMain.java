package ru.vsu.garaba.gui;

import javax.swing.*;

public class FrameMain extends JFrame
{

    public FrameMain()
    {
        setTitle("Stack");
        setSize(670, 430);
        add(new MainPanel());
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new FrameMain();
    }
}
