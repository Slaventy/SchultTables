package Action;

import GUI.ServerConnectFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;

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
                    serverConnectFrame.repaint();
                    Thread.sleep(1000);
                    serverConnectFrame.setVisible(false);
                } else {
                    serverConnectFrame.getJtextPane().setText("Connect is not been started\n");
                }
            } catch (IOException | InterruptedException ioException) {
                ioException.printStackTrace();
            }
        });
        serverConnectFrame.getjButtonConnect().addActionListener(ee -> {
            try {
                socket = new Socket("localhost", 3345);
                if (socket.isConnected()) {
                    serverConnectFrame.getJtextPane().setContentType("Connect is started\n");
                    OutputStream outputStream = socket.getOutputStream();
                    byte[] bytes = {10, 11, 15, 20};
                    int len = bytes.length;
                    byte[] lenbytes = ByteBuffer.allocate(4).putInt(len).array();
                    outputStream.write(lenbytes);
                    outputStream.write(bytes);
                    outputStream.flush();

                } else {
                    serverConnectFrame.getJtextPane().setText("Connect is not started\n");
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });
    }
}