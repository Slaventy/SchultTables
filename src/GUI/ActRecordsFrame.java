package GUI;

import javax.swing.*;
/**
 * окно текущих результатов сессии
 * */

public class ActRecordsFrame  {

    public ActRecordsFrame(JTextPane jPanel){
        JFrame frame = new JFrame("Records");
        frame.add(jPanel);
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
