package GUI;

import Client.Client;
import Interfase.Game;

import javax.swing.*;
import java.awt.*;

/**
 * Класс реализует графический интерфейс
 * для создания соединения с сервером
 *
 * */

public class ServerConnectFrame extends JPanel{

    private JTextField jTextField = new JTextField(20);

    public ServerConnectFrame(){
        JButton jButtonClose = new JButton("Close");
        jButtonClose.addActionListener(e -> Game.getGame().clearFrame());
        JButton jButtonConnect = new JButton("Connect");
        jButtonConnect.addActionListener(e -> Client.getClient());
        JLabel jLabel = new JLabel();
        jLabel.setText("Server connection interface");
        jLabel.setFont(new Font("Arial",Font.BOLD, 25));
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        setLayout(new BorderLayout());
        add(jLabel, BorderLayout.NORTH);
        JPanel jPanelUserName = new JPanel();

        jPanelUserName.add(jTextField);
        jTextField.setSize(20, 1);
        add(jPanelUserName, BorderLayout.CENTER);
        JPanel jPanel = new JPanel();
        jPanel.add(jButtonConnect);
        jPanel.add(jButtonClose);
        add(jPanel, BorderLayout.SOUTH);
    }

    public JTextField getjTextField(){
        return jTextField;
    }
}
