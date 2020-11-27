package GUI;

import Interfase.Settings;

import javax.swing.*;
/**
 * окно наилучших результатов
 * */
public class BestRecordsFrame implements Settings {
    private JFrame frame = new JFrame("Records");

    public BestRecordsFrame(){
//        frame.add(new Resaults().getTextPane());
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
