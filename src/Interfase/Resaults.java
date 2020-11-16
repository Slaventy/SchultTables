package Interfase;

import GUI.MainFrame;

import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * обработчик сведений о результатах
 *
 * */
public class Resaults {

    JTextPane textPane = new JTextPane();
    ArrayList<String> results = new ArrayList<>(); //теущие результаты за сессию
    Date date = new Date();

    //установка результатов текущей сессии текущего розыгрыша
    public void setResults(int count){
        String s = date.toString() + "..." + MainFrame.POLECOLS + "X" + MainFrame.POLEROWS + " " + count + " sec." + "\n";
        results.add(s);
    }

    //результаты текущей сессии
    public JTextPane getActRecords(){
        JTextPane gettextPane = new JTextPane();
        gettextPane.setEditable(false);
        StringBuilder stringBuilder = new StringBuilder();
        for (String s: results){
            stringBuilder.append(s);
        }
        gettextPane.setText(stringBuilder.toString());
        return gettextPane;
    }

    public JTextPane getTextPane(){
        textPane.setEditable(false);

        try {
            FileReader fileReader = new FileReader(new File("save.d"));
            int s;
            char[] buf = new char[256];

            while ((s = fileReader.read(buf)) > 0){
                if(s < 256){
                    buf = Arrays.copyOf(buf, s);
                }
            }
            textPane.setText(String.valueOf(buf));
        }catch (Exception exception){
            exception.printStackTrace();
            textPane.setText("File Not Found");
        }
        return textPane;
    }
}
