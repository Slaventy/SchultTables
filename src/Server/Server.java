package Server;

public class Server implements Runnable{
    MainServerFrame mainServerFrame = new MainServerFrame();

    @Override
    public void run() {
        mainServerFrame.addNewNotation("server connect is " + new SocketRunner().runSocket());
    }
}
