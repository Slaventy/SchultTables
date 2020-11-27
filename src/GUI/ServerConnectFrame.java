package GUI;

import javax.swing.*;
import java.awt.*;

public class ServerConnectFrame {
    private JFrame serverConnectFrame = new JFrame("ServerConnect");
    private JButton jButtonClose = new JButton("Close");
    private JButton jButtonConnect = new JButton("Connect");
    private JTextPane jtextPane = new JTextPane();
    private JPanel jpanel = new JPanel();

    public ServerConnectFrame(){
        //settings
            serverConnectFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            serverConnectFrame.setBounds(100, 100, 300, 200);
        //components
            jtextPane.setEditable(false);
        //adding elements on panel
            jpanel.add(jButtonConnect);
            jpanel.add(jButtonClose);
            serverConnectFrame.add(jtextPane, BorderLayout.CENTER);
            serverConnectFrame.add(jpanel, BorderLayout.SOUTH);
        //running frame
            serverConnectFrame.setVisible(true);
    }

    public JButton getjButtonClose(){
        return jButtonClose;
    }
    public JButton getjButtonConnect(){
        return jButtonConnect;
    }
    public JTextPane getJtextPane(){
        return jtextPane;
    }

}
