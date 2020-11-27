package GUI;

import javax.swing.*;
/**
 * окно About
 * содержит информацию о программе
 * */

public class AboutFrame {
    //components
        String string = "" +
            "Привет пользователь!\n" +
            "Данная программа представляет таблицы Шульта\n" +
            "Цель игры - за как можно меньшее время прокликать цифры в порядке возрастания\n" +
            "от маньшей к большей.\n" +
            "Количество цафр на поле будет меняться в зависимости от Вашего навыка.";
        JFrame frame = new JFrame("About");
        JTextPane textPane = new JTextPane();

    public AboutFrame(){
        textPane.setText(string);
        textPane.setEditable(false);
        frame.add(textPane);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
