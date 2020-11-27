package Action;

import GUI.ServerConnectFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;

public class ActionServerConnect implements ActionListener {
    Socket socket;

    @Override
    public void actionPerformed(ActionEvent e) {
        ServerConnectFrame serverConnectFrame = new ServerConnectFrame();
        serverConnectFrame.getjButtonClose().addActionListener(ee -> {
            try {
                if (socket != null) {
                    if (socket.isConnected()) {
                        socket.close();
                    }
                    serverConnectFrame.getJtextPane().setText("Connect is closed\n");
                } else {
                    serverConnectFrame.getJtextPane().setText("Connect is not been started\n");
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
        serverConnectFrame.getjButtonConnect().addActionListener(ee -> {
            try {
                socket = new Socket("localhost", 3345);
                if (socket.isConnected()) {
                    serverConnectFrame.getJtextPane().setContentType("Connect is started\n");
                } else {
                    serverConnectFrame.getJtextPane().setText("Connect is not started\n");
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });
    }
}