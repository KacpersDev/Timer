package me.kacper.timer.tasks;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class Counter {

    private final Timer counter = new Timer();
    private int count = me.kacper.timer.Timer.getC();

    public Counter(JLabel label){

        count(label);
    }

    public void count(JLabel label){

        counter.schedule(new TimerTask() {

            int i = 2;
            int seconds = 60;
            int minutes = count;

            @Override
            public void run() {

                i--;

                if (i <= 1) {
                    i = 2;
                    seconds--;
                    if (seconds == 0) {
                        seconds = 60;
                        minutes--;

                    }
                    label.setText("Minutes " + minutes + " Seconds " + seconds);
                }

            }
        },100L,1000L);
    }
}
