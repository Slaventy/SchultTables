package Server;

import java.net.ServerSocket;
import java.net.Socket;
/**
 * ожидание первого клиента
 * подключение первого клиента
 * перевод его в комнату
 * ожидание второго клиента
 * подключение второкго клиента
 * перевод в комнату
 * Два клиента в комнате - создание нового потока где создается игровое поле
 * поле пересылается обоим клиентам
 * по жребию выбирается кто будет ходить
 * ожидаем действия от первого ходока
 * бемем его поле и передаем второму ходоку
 * и так далее пока не закончатся поля
 * после окончания полей формируем таблицу с временем обоих игроков
 * пересылаем таблицу
 * ожидаем решения о продолжении игры или завершении
 * формируем новое поле или выходим из соединения
 * */
public class SocketRunner {
    public boolean runSocket(){
        try(ServerSocket serverSocket = new ServerSocket(3345)) {
            Socket socket = serverSocket.accept();  // сервер готов к подключению
            return socket.isConnected();
        }catch (Exception e){
            e.printStackTrace();
        }finally {

            return true;
        }
    }
}

//try(ServerSocket serverSocket = new ServerSocket(3345)) {
//        Socket socket = serverSocket.accept();  // сервер готов к подключению
//        InputStream inputStream = socket.getInputStream();
//        while (true){
//        byte[] buffer = new byte[4];
//        inputStream.read(buffer, 0, 4);
//        int len = ByteBuffer.wrap(buffer).getInt();
//        byte[] dataBuf = new byte[len];
//        inputStream.read(dataBuf, 0, len);
//
//        System.out.println(Arrays.toString(dataBuf));
//
//        }
//        }catch (Exception e){
//        e.printStackTrace();
//        }
