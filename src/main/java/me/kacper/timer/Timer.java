package me.kacper.timer;

import me.kacper.timer.tasks.Counter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timer implements ActionListener {

    private final String title;
    private final int width;
    private final int height;
    private final JFrame frame;
    private final JPanel panel;
    private final JTextField textField;
    private final JButton start;
    private static int c;
    private final JLabel timerDisplay;

    public Timer(String title, int width, int height){
        this.title = title;
        this.width = width;
        this.height = height;
        this.frame = new JFrame();
        this.panel = new JPanel();
        this.textField = new JTextField();
        this.start = new JButton();
        this.timerDisplay = new JLabel();
    }

    public void init(){

        this.frame.setTitle(this.title);
        this.frame.setSize(this.width, this.height);
        this.panelEditor();
        this.timerDisplay.setBounds(250,200,200,50);
        this.timerDisplay.setOpaque(true);
        this.frame.add(this.timerDisplay);
        this.frame.add(this.panel);
        this.frame.setVisible(true);
    }

    public void panelEditor(){

        this.panel.setBackground(Color.BLACK);
        textField.setText("Enter Time (in minutes)");
        this.start.setText("Start Timer");
        this.start.addActionListener(this);
        this.start.setActionCommand("start_timer");
        this.panel.add(textField);
        this.panel.add(start);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equalsIgnoreCase("start_timer")) {

            c = Integer.parseInt(textField.getText());

            if (getC() > 0) {
                new Counter(this.timerDisplay);
            } else {
                System.out.println("[ERROR] Timer cannot be smaller or equals to 0");
            }
        }
    }

    public static int getC() {
        return c;
    }
}
