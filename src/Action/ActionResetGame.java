package Action;

import GUI.MainFrame;
import Interfase.PlayingField;
import Interfase.Settings;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionResetGame implements ActionListener, Settings {
    Timer timer;
    public ActionResetGame(Timer timer){
        this.timer = timer;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        frame.getContentPane().removeAll(); //удаление предыдущего контента из панели
        frame.add(new PlayingField(timer, false)); //добавление нового контента на панель
        frame.setVisible(true); //перересовка окная
        if (timer.isRunning()){
            timer.restart();
            MainFrame.count = 0;
        }else {
            timer.start();
        }
    }
}
