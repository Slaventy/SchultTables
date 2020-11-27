package Action;

import GUI.BestRecordsFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * вызывает лучшие результаты за все сессии
 *
 * */
public class ActionBestRecords implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        new BestRecordsFrame();
    }
}
