package Server;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class SocketRunner {
    public SocketRunner(){
        try(ServerSocket serverSocket = new ServerSocket(3345)) {
            Socket socket = serverSocket.accept();  // сервер готов к подключению
            InputStream inputStream = socket.getInputStream();
            while (true){
                byte[] buffer = new byte[4];
                inputStream.read(buffer, 0, 4);
                int len = ByteBuffer.wrap(buffer).getInt();
                byte[] dataBuf = new byte[len];
                inputStream.read(dataBuf, 0, len);

                System.out.println(Arrays.toString(dataBuf));

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
