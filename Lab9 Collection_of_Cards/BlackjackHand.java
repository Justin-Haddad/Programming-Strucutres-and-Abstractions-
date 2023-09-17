import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlackjackHand {
    private List<Card> cards;

    private static final Map<Rank, Integer> CARD_VALUES = new HashMap<>();

    static {
        CARD_VALUES.put(Rank.TWO, 2);
        CARD_VALUES.put(Rank.THREE, 3);
        CARD_VALUES.put(Rank.FOUR, 4);
        CARD_VALUES.put(Rank.FIVE, 5);
        CARD_VALUES.put(Rank.SIX, 6);
        CARD_VALUES.put(Rank.SEVEN, 7);
        CARD_VALUES.put(Rank.EIGHT, 8);
        CARD_VALUES.put(Rank.NINE, 9);
        CARD_VALUES.put(Rank.TEN, 10);
        CARD_VALUES.put(Rank.JACK, 10);
        CARD_VALUES.put(Rank.QUEEN, 10);
        CARD_VALUES.put(Rank.KING, 10);
        CARD_VALUES.put(Rank.ACE, 11);
    }

    public BlackjackHand(Card card1, Card card2) {
        cards = new ArrayList<>();
        cards.add(card1);
        cards.add(card2);
    }

    public List<Card> getCards() {
        return new ArrayList<>(cards);
    }

    public int size() {
        return cards.size();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int getValue() {
        int value = cards.stream()
                .mapToInt(card -> CARD_VALUES.get(card.getRank()))
                .sum();
        int aces = countAces();
        while (value > 21 && aces > 0) {
            value -= 10;
            aces--;
        }
        return value;
    }

    
    


    private int countAces() {
        return (int) cards.stream()
                .filter(card -> card.getRank() == Rank.ACE)
                .count();
    }

    @Override
    public String toString() {
        return cards.toString();
    }

    public static Map<Rank, Integer> getCardValues() {
        return new HashMap<>(CARD_VALUES);
    }
} 

