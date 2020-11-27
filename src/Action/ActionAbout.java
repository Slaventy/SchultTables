package Action;

import GUI.AboutFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * обоработчик меню About
 * */
public class ActionAbout implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        new AboutFrame();
    }
}
