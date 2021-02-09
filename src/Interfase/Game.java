package Interfase;

import GUI.ActRecordsFrame;
import GUI.MainFrame;
import GUI.ServerConnectFrame;


public class Game implements Runnable {
    private MainFrame mainFrame;    //главное окно

    private final int POLEROWS = 2; //начальное количество квадратов строки
    private final int POLECOLS = 2; //начальное количество квадратов столбцы


    private static Game instance;

    private final PlayingField playingField = new PlayingField(POLEROWS, POLECOLS);
    private final ServerConnectFrame serverConnectFrame = new ServerConnectFrame();

    private Game(){}

    public static Game getGame(){
        if (instance == null){
            instance = new Game();
        }
        return instance;
    }

    @Override
    public void run() {
        mainFrame = new MainFrame();
    }

    public void NewGame(){
        mainFrame.getLabelTimer().startTimer();    //запуск тймера
        mainFrame.getContentPanel().removeAll();    //удаление предыдущего контента из панели
        playingField.setGoodDeal(0);
        playingField.setCol(POLECOLS);
        playingField.setRow(POLEROWS);
        playingField.setField();    //активация поля
        mainFrame.setPlayingField(playingField);

    }
    // сброс поля
    public void ResetGame(){
        mainFrame.getLabelTimer().resetTimer();
        mainFrame.getContentPanel().removeAll();
        playingField.setField();
        mainFrame.setPlayingField(playingField);
    }
    Resaults resaults = new Resaults();
    //результаты сохраняем
    public void setResult(int col, int row){
        int count = mainFrame.getLabelTimer().getCount();
        resaults.setResults(count, row, col);
    }
    public void actRecords(){
        new ActRecordsFrame(resaults.getActRecords());
    }

    public void server(){
        mainFrame.getLabelTimer().startTimer();
        mainFrame.getContentPanel().removeAll();
        mainFrame.getContentPanel().repaint();
        mainFrame.setPlayingField(serverConnectFrame);
    }
}
