package ru.vsu.garaba.gui;

import ru.vsu.garaba.SimpleLinkedListStack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel
{
    private JTextField pushTextField = new JTextField();
    private JLabel pushLabel = new JLabel("Input element:");
    private JButton pushButton = new JButton("Push in stack");
    private JButton solutionButton = new JButton("Solution");
    private JButton clearButton = new JButton("Clear");
    private JTextArea resultTextArea = new JTextArea();

    private final Color backgroundColor = new Color(230, 126, 253);

    private SimpleLinkedListStack<String> stack = new SimpleLinkedListStack<>();


    public MainPanel()
    {
        setLayout(null);
        setBackground(backgroundColor);

        pushTextField.setBounds(120, 30, 520, 30);
        add(pushTextField);
        pushLabel.setBounds(30, 30, 80, 30);
        add(pushLabel);

        pushButton.setBounds(90, 90, 120, 30);
        pushButton.addActionListener(pushButtonListener);
        add(pushButton);

        solutionButton.setBounds(270, 90, 120, 30);
        solutionButton.addActionListener(solutionButtonListener);
        add(solutionButton);

        clearButton.setBounds(450, 90, 120, 30);
        clearButton.addActionListener(clearButtonListener);
        add(clearButton);

        resultTextArea.setBounds(30, 150, 610, 220);
        add(resultTextArea);
    }

    ActionListener pushButtonListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            stack.push(pushTextField.getText());
            pushTextField.setText(null);
        }
    };

    ActionListener clearButtonListener = e -> {
        pushTextField.setText(null);
        resultTextArea.setText(null);
    };

    ActionListener solutionButtonListener = e -> {
        try {
            stack.solution();
            while (!stack.isEmpty()) {
                resultTextArea.append(stack.pop() + "\n");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    };
}

