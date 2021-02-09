package Server;

import javax.swing.*;

public class MainServerFrame extends JFrame {
    private JTextPane jTextPane = new JTextPane();
    public MainServerFrame(){
        setTitle("Server Schult Table");
        setBounds(100, 100, 500, 300);
        jTextPane.setText("******User*****|*****Room*****|*****Port*****|********IP********|");
        jTextPane.setEditable(false);
        add(jTextPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void addNewNotation(String st){
        StringBuilder stringBuilder = new StringBuilder(jTextPane.getText());
        stringBuilder.append("\n");
        stringBuilder.append(st);
        jTextPane.setText(stringBuilder.toString());
    }
}
