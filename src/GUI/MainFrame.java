package GUI;

import Interfase.Game;
import Interfase.LabelTimer;

import javax.swing.*;
import java.awt.*;

/**
 * Главное окно
 * */
public class MainFrame{
    private final JFrame frame;
    private final LabelTimer labelTimer = new LabelTimer();

    public MainFrame(){

        //окно
        frame = new JFrame("ShouldTables");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //меню бар
        JMenuBar jMenuBar = new JMenuBar();

        //подменю бара
        JMenu JMFile = new JMenu("File");
        JMenu JMHelp = new JMenu("Help");
        jMenuBar.add(JMFile);
        jMenuBar.add(JMHelp);
        jMenuBar.add(labelTimer);


        //содержимое менюбар File
        JMenuItem JMFileNewGame = new JMenuItem("New_Game");
        JMFile.add(JMFileNewGame);
        JMenuItem JMFileResetGame = new JMenuItem("ResetGame");
        JMFile.add(JMFileResetGame);
        JMenuItem JMServerConnect = new JMenuItem("ServerCon");
        JMFile.add(JMServerConnect);
        JMenuItem JMFileExit = new JMenuItem("Exit");
        JMFile.add(JMFileExit);

        //содержимое менюбар help
        JMenuItem JMActRecords = new JMenuItem("ActRecords");
        JMHelp.add(JMActRecords);
        JMenuItem JMBestRecords = new JMenuItem("BestRecords");
        JMHelp.add(JMBestRecords);
        JMenuItem JMHelpAbout = new JMenuItem("About");
        JMHelp.add(JMHelpAbout);
        //установка меню бар
        frame.setJMenuBar(jMenuBar);

        //установки окна
        frame.setSize(500,500);
        frame.setVisible(true);

        //Слушатели
        JMFileExit.addActionListener(e -> System.exit(0));
        JMFileNewGame.addActionListener(e -> Game.getGame().NewGame());
        JMFileResetGame.addActionListener(e -> Game.getGame().ResetGame());
        JMHelpAbout.addActionListener(e -> new AboutFrame());
        JMActRecords.addActionListener(e -> Game.getGame().actRecords());
        JMBestRecords.addActionListener(e -> new BestRecordsFrame());
        JMServerConnect.addActionListener(e -> Game.getGame().server());
    }

    //возвращает лейбл с интегрированным таймером

    public LabelTimer getLabelTimer() {
        return labelTimer;
    }

    //устанавливает игровое поле для новой игры
    public void setPlayingField(JPanel panel){
        frame.add(panel);
    }

    //вызов текущего игрового поля
    public Container getContentPanel(){
        return frame.getContentPane();
    }
}
