package GUI;

import javax.swing.*;
import java.awt.*;

public class ServerConnectFrame extends JFrame{

    private final JButton jButtonClose = new JButton("Close");
    private final JButton jButtonConnect = new JButton("Connect");
    private final JTextPane jtextPane = new JTextPane();

    public ServerConnectFrame(){
        //settings
        setTitle("ServerConnect");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 200);
        //components
        jtextPane.setEditable(false);
        //adding elements on panel
        JPanel jpanel = new JPanel();
        jpanel.add(jButtonConnect);
        jpanel.add(jButtonClose);
        add(jtextPane, BorderLayout.CENTER);
        add(jpanel, BorderLayout.SOUTH);
        //running frame
            setVisible(true);
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
