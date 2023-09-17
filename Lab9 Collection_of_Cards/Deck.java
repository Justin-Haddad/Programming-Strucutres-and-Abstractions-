import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private final List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public Card draw() {
        return cards.isEmpty() ? null : cards.remove(0);
    }

    public List<Card> draw(int count) {
        if (count < 0) {
            return new ArrayList<>();
        } else if (count > cards.size()) {
            List<Card> drawnCards = new ArrayList<>(cards);
            cards.clear();
            return drawnCards;
        } else {
            List<Card> drawnCards = new ArrayList<>(cards.subList(0, count));
            cards.subList(0, count).clear();
            return drawnCards;
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public int size() {
        return cards.size();
    }

    public List<Card> getCardsByRank(Rank rank) {
        List<Card> cardsByRank = new ArrayList<>();
        for (Card card : cards) {
            if (card.getRank() == rank) {
                cardsByRank.add(card);
            }
        }
        return cardsByRank;
    }

    @Override
    public String toString() {
        return cards.toString();
    }

}
