package Action;

import GUI.MainFrame;
import Interfase.PlayingField;
import Interfase.Settings;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionNewGame implements ActionListener, Settings {
    Timer timer;
    public ActionNewGame(Timer timer){
        this.timer = timer;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        MainFrame.goodDeal = 0;
        frame.getContentPane().removeAll(); //удаление предыдущего контента из панели
        frame.add(new PlayingField(timer, true)); //добавление нового контента на панель
        frame.setVisible(true); //перересовка окная
        if (timer.isRunning()){
            timer.restart();
            MainFrame.count = 0;
        }else {
            timer.start();
        }
    }
}
