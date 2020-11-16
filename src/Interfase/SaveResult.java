package Interfase;

import GUI.MainFrame;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;
/**
 * сохранение лучших результатов за сессию в файл
 * */
public class SaveResult {

    Date date = new Date();
    File file = new File("save.d");

    public void save(int count) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(date.toString() + "....." + MainFrame.POLECOLS + "X" + MainFrame.POLEROWS + " " + count + " sec." + "\n");
            fileWriter.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
