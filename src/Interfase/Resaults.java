package Interfase;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * обработчик сведений о результатах
 *
 * */
public class Resaults {

    ArrayList<String> results = new ArrayList<>(); //теущие результаты за сессию
    Date date = new Date();

    //установка результатов текущей сессии текущего розыгрыша
    public void setResults(int count, int row, int col){
        String s = date.toString() + "..." + col + "X" + row + " " + count + " sec." + "\n";
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
}
