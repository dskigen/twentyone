import java.util.ArrayList;
import java.util.Collections;

public class Game {

    public ArrayList<Card> deck;
    public Player player, bot;

    public Game() {
        deck = newDeck();
    }

    public ArrayList<Card> newDeck() {
        ArrayList<Card> nDeck = new ArrayList<>();
        for(int i = 1; i <= 11; i++)
            nDeck.add(new Card(i));
        Collections.shuffle(nDeck);
        return nDeck;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }
}
