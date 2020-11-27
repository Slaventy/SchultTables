package GUI;

import Interfase.Settings;

import javax.swing.*;
/**
 * окно текущих результатов сессии
 * */

public class ActRecordsFrame implements Settings {

    private JFrame frame = new JFrame("Records");

    public ActRecordsFrame(){
        frame.add(results.getActRecords());
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
