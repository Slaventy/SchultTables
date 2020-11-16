package Interfase;

import GUI.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static GUI.MainFrame.*;

/**
 * обработчик нажатий на поля
 * */
public class InsertAction implements ActionListener, Settings {

    int number = 0; //цифра нажатой кнопки
    int wrightButtons = 0;  //количество правильно нажатых кнопок
    Timer timer;

    public InsertAction(Timer extTimer){
        timer = extTimer;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //если разница между числами нажатой и предыдущей кнопок есть 1
        if ((Integer.parseInt(e.getActionCommand()) - number) == 1){
            number = Integer.parseInt(e.getActionCommand());    //пересохраняем номер кнопки
            JButton button = (JButton) e.getSource();       //берем нашу кнопку
//            button.setContentAreaFilled(false);     //изменяем ее состояние на нажато
            button.setBackground(new Color(new Random().nextInt()));
//            button.setIcon(new ImageIcon("icon.bmp"));
            wrightButtons++;    //добавляю счетчик правильно нажатых кнопок
        }

        //когда количество правильно нажатых кнопок совпадет с общим количеством
        //кнопок, то заканчивается игра
        if (wrightButtons == (POLECOLS * POLEROWS) ){
            MainFrame.goodDeal++;   //увеличение счетчика удачных раскладов
            if (MainFrame.goodDeal == 3){
                //обнуление серии удачных раскладов
                MainFrame.goodDeal = 0;
                //увеличение поля
                POLECOLS = POLECOLS + 1;
                POLEROWS = POLEROWS + 1;
            }
            results.setResults(count);  //сохранение результата
            timer.restart();        //перезапуск таймера
            MainFrame.count = 0;    //обнуление секундомера
            frame.getContentPane().removeAll(); //удаление предыдущего контента из панели
            frame.add(new PlayingField(timer, false));  //добавление нового контента на панель
            frame.setVisible(true); //перерисовка окна.
        }

    }
}
