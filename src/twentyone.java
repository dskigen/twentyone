import java.util.ArrayList;

public class twentyone {

    public static void main(String[] args) {
        Game game = new Game();
        ArrayList<Card> deck = game.getDeck();
        System.out.println("deck = ");
        for (Card card : deck) System.out.println(card.getValue());
    }
}
