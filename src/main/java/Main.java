import dev.spruce.game.Game;

public class Main {

    public static void main(String[] args) {
        Game.getInstance().init();
        Game.getInstance().run();
    }
}
