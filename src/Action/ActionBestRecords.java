package Action;

import Interfase.Resaults;
import Interfase.Settings;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * вызывает лучшие результаты за все сессии
 *
 * */
public class ActionBestRecords implements ActionListener, Settings {
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame("Records");

//        frame.add(new Resaults().getTextPane());

        frame.setSize(300,400);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
