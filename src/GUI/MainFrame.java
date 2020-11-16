package GUI;

import Action.*;
import Interfase.Settings;
import Music.PlayerMusic;

import javax.swing.*;
import java.io.File;

public class MainFrame extends JFrame implements Settings {

    Timer timer;    //таймер
    public static int count = 0; //счетчик праильно нажатых чисел
    public static int goodDeal = 0; //счетчик оконченых игр
    public static int POLEROWS = 2; //количество квадратов строки
    public static int POLECOLS = 2; //количество квадратов столбцы

    public MainFrame(){
        File f = new File("bensound-ukulele.wav");
        new Thread(new PlayerMusic(f)).start();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //меню бар
        JMenuBar jMenuBar = new JMenuBar();
            //подменю бара
        JMenu JMFile = new JMenu("File");
        JMenu JMHelp = new JMenu("Help");
        JLabel label = new JLabel();  //поле вывода счетчика времени
        jMenuBar.add(JMFile);
        jMenuBar.add(JMHelp);
        jMenuBar.add(label);

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


        //таймер
        timer = new Timer(1000, e -> label.setText(String.valueOf(count++)));
        timer.setInitialDelay(0);

        //Слушатели
        JMFileExit.addActionListener(e -> System.exit(0));
        JMFileNewGame.addActionListener(new ActionNewGame(timer));
        JMFileResetGame.addActionListener(new ActionResetGame(timer));
        JMHelpAbout.addActionListener(new ActionAbout());
        JMActRecords.addActionListener(new ActionActRecords());
        JMBestRecords.addActionListener(new ActionBestRecords());
        JMServerConnect.addActionListener(new ActionServerConnect());


        //установка меню бар
        frame.setJMenuBar(jMenuBar);

        //установки окна
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
