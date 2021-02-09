package GUI;
/**
 * Класс реализует графический интерфейс
 * для создания соединения с сервером
 *
 * */
import Client.Client;

import javax.swing.*;
import java.awt.*;

public class ServerConnectFrame extends JPanel{


    private final JTextPane jTextPane = new JTextPane();

    public ServerConnectFrame(){
        JButton jButtonClose = new JButton("Close");
        jButtonClose.addActionListener(e -> Client.getClient());
        JButton jButtonConnect = new JButton("Connect");
        jButtonConnect.addActionListener(e -> Client.getClient());
        jTextPane.setEditable(false);
        jTextPane.setText("Server connection interface");
        setLayout(new GridLayout(2, 2));
        add(jTextPane);
        add(jButtonConnect);
        add(jButtonClose);
    }

    public JTextPane getJTextPane(){
        return jTextPane;
    }
}
