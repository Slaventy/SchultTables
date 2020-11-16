package Action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;

public class ActionServerConnect implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        try (Socket socket = new Socket("localhost", 3345)){
            if (socket.isBound()){
                System.out.println("client connected");
            }
        }catch (Exception e1){
            e1.printStackTrace();
        }
    }
}
