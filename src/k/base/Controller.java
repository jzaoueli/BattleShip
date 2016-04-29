package k.base;

public class Controller {
    private static Game game;

    // füllt das k.base.Spielfeld
    private static void createPlayField() {
        game = new Game(Field.getField());
    }

    public static void main(String[] args) {
        createPlayField();
        game.play();
    }
}
