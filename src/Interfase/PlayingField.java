package Interfase;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.*;

import static GUI.MainFrame.POLECOLS;
import static GUI.MainFrame.POLEROWS;
/**
 * формирование игрового поля
 * */
public class PlayingField extends JPanel implements Settings{

    public ActionListener actionListener;
    Timer timer;


    public PlayingField(Timer extTimer, boolean backFild){
        if (backFild){
            POLEROWS = 2; //количество квадратов строки
            POLECOLS = 2; //количество квадратов столбцы
        }
        timer = extTimer;
        setLayout(new GridLayout(POLEROWS,POLECOLS));   //сетка для полей
        int[] numbers = rnd();  //массив случайных неповторяющихся чисел
        actionListener = new InsertAction(timer); //объект обработки нажатий
        for (int i = 0; i < (POLECOLS * POLEROWS); i++){
            addFieldNumber(String.valueOf(numbers[i]), actionListener); //добавим на поле
        }
    }

    //создает кнопку и слушателя к ней
    private void addFieldNumber(String str, ActionListener listener){
        JButton button = new JButton(str);
        button.setFont(new Font("Arrial", Font.BOLD, 25));
        button.addActionListener(listener);
        add(button);
    }

    private final Random random = new Random();

    //генератор случайных неповторяющихся чисел
    private int[] rnd(){
        int[] mass = new int[POLEROWS * POLECOLS];
        int tmp = 0;

        for (int i = 0; i < mass.length; i++){
            boolean flag = true;
            while (flag){
                assert random != null;
                tmp = random.nextInt(POLEROWS * POLECOLS + 1);
                flag = isHere(mass, tmp);
            }
            mass[i] = tmp;
        }
        return mass;
    }

    //проверка наличия нового числа в массиве
    private boolean isHere(int[] mas, int num){
        boolean is = false;
        for (int ma : mas) {
            if (ma == num) {
                is = true;
                break;
            }
        }
        return is;
    }
}
