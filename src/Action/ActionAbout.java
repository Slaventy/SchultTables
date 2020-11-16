package Action;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * обоработчик меню About
 * */
public class ActionAbout implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame("About");
        JTextPane textPane = new JTextPane();
        textPane.setText("Привет пользователь!\n" +
                "Данная программа представляет теблицы Шульта\n" +
                "Цель игры - за как можно меньшее время прокликать цыфры\n в порядке возрастания" +
                "от маньшей к большей.\n" +
                "Количество цафр на поле будет меняться в зависимости от Вашего навыка.");
        textPane.setEditable(false);
        frame.add(textPane);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
