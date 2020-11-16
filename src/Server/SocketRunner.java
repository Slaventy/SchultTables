package Server;

import java.net.ServerSocket;

public class SocketRunner {
    public SocketRunner(){
        try(ServerSocket serverSocket = new ServerSocket(3345)) {
            serverSocket.accept();  // сервер готов к подключению
            if (serverSocket.isBound()){
                System.out.println("connect");
            }
//            while (true){}
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
