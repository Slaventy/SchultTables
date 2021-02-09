import Interfase.Game;

/**
 * Точка старта - главный класс
 * */

public class Main1 {

    //Система логирования в разработке
//    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

//        new Thread(new PlayerMusic()).start();
        new Thread(Game.getGame()).start();

    }

}
