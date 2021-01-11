package GUI;

import javax.swing.*;
/**
 * окно наилучших результатов
 * */
public class BestRecordsFrame {

    public BestRecordsFrame(){
//        frame.add(new Resaults().getTextPane());
        JFrame frame = new JFrame("Records");
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
