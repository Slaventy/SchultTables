package Server;

import Interfase.Game;
import Interfase.MakeRandomMassive;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.Random;

/**
 * формирование игрового поля
 * */
public class PlayingField extends JPanel implements Serializable {


    private int row, col;
    private int number = 0;
    private int correctlyPushedButtons = 0;
    private int goodDeal = 0;

    public PlayingField(int row, int col){
        this.row = row;
        this.col = col;
        setField();
    }
    public void setRow(int row){
        this.row = row;
    }
    public void setCol(int col){
        this.col = col;
    }


    public void setGoodDeal(int goodDeal){
        this.goodDeal = goodDeal;
    }
    public void setField(){
        correctlyPushedButtons = 0;
        number = 0;
        removeAll();
        setLayout(new GridLayout(row,col));   //сетка для полей
        // впоследствии необходимо заменить очередью
        int[] numbers = MakeRandomMassive.rnd(row * col);  //массив случайных неповторяющихся чисел

        for (int number : numbers) {
            addFieldNumber(String.valueOf(number), this::press); //добавим на поле кнопки
        }
    }

    public void press(ActionEvent e) {
        //если разница между числами нажатой и предыдущей кнопок есть 1
        if ((Integer.parseInt(e.getActionCommand()) - number) == 1) {
            number = Integer.parseInt(e.getActionCommand());    //пересохраняем номер кнопки
            JButton button = (JButton) e.getSource();       //берем нашу кнопку
//            button.setContentAreaFilled(false);     //изменяем ее состояние на нажато или ...
            button.setBackground(new Color(new Random().nextInt()));    // меняем цвет кнопки или ...
//            button.setIcon(new ImageIcon("icon.bmp"));    //заменяем картинку
            correctlyPushedButtons++;    //добавляю счетчик правильно нажатых кнопок
        }
        //когда количество правильно нажатых кнопок совпадет с общим количеством
        //кнопок, то заканчивается игра
        if (correctlyPushedButtons == (col * row) ){
            goodDeal++; //увеличение счетчика удачных раскладов
            if (goodDeal == 2){
                goodDeal = 0;
                row++;
                col++;
            }
            Game.getGame().setResult(col, row);
            Game.getGame().ResetGame();   //сброс поля и генерация нового с текущими настройками
        }

    }
    //создает кнопку и слушателя к ней
    private void addFieldNumber(String str, ActionListener listener){
        JButton button = new JButton(str);
        button.setFont(new Font("Arrial", Font.BOLD, 25));
        button.addActionListener(listener);
        add(button);
    }
}
