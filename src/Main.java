import GUI.MainFrame;
import Music.PlayerMusic;

/**
 * Точка старта - главный класс
 * */
public class Main {

    //Система логирования в разработке
//    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        new Thread(new PlayerMusic()).start();
        new Thread(new MainFrame()).start();

    }

}
