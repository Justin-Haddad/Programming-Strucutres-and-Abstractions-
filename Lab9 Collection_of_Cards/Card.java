import java.util.Objects;

public class Card implements Comparable<Card> {

    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = Objects.requireNonNull(rank);
        this.suit = Objects.requireNonNull(suit);
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

   

    public int compareTo(Card other) {
        int suitCompare = this.suit.compareTo(other.suit);
        if (suitCompare != 0) {
            return suitCompare;
        }
        return this.rank.compareTo(other.rank);
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Card)) {
            return false;
        }
        Card other = (Card) obj;
        return rank == other.rank && suit == other.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }

    
    @Override
    public String toString() {
        return rank.toString() + suit.toString();
    }

}
