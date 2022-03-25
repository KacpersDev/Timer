package me.kacper;

import me.kacper.timer.Timer;

public class Main {

    private final static Timer timer = new Timer("Timer", 500, 500);

    public static void main(String[] args) {

        timer.init();
    }
}
