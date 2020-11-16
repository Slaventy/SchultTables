package Action;

import Interfase.Resaults;
import Interfase.Settings;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * вызывает текущие результаты в сессии
 *
 * */
public class ActionActRecords implements ActionListener, Settings {


    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame("Records");
        frame.add(results.getActRecords());
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
