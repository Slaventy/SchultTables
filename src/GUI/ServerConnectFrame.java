package GUI;

import Client.Client;
import javax.swing.*;
import java.awt.*;

/**
 * Класс реализует графический интерфейс
 * для создания соединения с сервером
 *
 * */

public class ServerConnectFrame extends JPanel{


    public ServerConnectFrame(){
        JButton jButtonClose = new JButton("Close");
        jButtonClose.addActionListener(e -> Client.getClient());
        JButton jButtonConnect = new JButton("Connect");
        jButtonConnect.addActionListener(e -> Client.getClient());
        JLabel jLabel = new JLabel();
        jLabel.setText("Server connection interface");
        jLabel.setFont(new Font("Arial",Font.BOLD, 25));
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        setLayout(new BorderLayout());
        add(jLabel, BorderLayout.NORTH);
        JPanel jPanelUserName = new JPanel();
        JTextField jTextField = new JTextField(20);
        jPanelUserName.add(jTextField);
        jTextField.setSize(20, 1);
        add(jPanelUserName, BorderLayout.CENTER);
        JPanel jPanel = new JPanel();
        jPanel.add(jButtonConnect);
        jPanel.add(jButtonClose);
        add(jPanel, BorderLayout.SOUTH);
    }

}
