package Action;

import GUI.ActRecordsFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * вызывает текущие результаты в сессии
 *
 * */
public class ActionActRecords implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        new ActRecordsFrame();
    }
}
