package Interfase;

import javax.swing.*;
/**
 * Label с интегрированным таймером
 * */
public class LabelTimer extends JLabel{

    private int count = 0;
    private final Timer timer = new Timer(1000, e -> this.setText(String.valueOf(count++)));

    public LabelTimer(){
        timer.setInitialDelay(0);
    }

    public void startTimer(){
        if (timer.isRunning()){
            timer.restart();
            count = 0;
        } else {
            timer.start();
        }
    }

    public void resetTimer(){
        if (timer.isRunning()){
            timer.restart();
            count = 0;
        } else {
            timer.start();
        }
    }
    public int getCount(){
        return count;
    }

    public void stopTimer(){
        timer.stop();
    }
}
