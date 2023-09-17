import java.util.EnumSet;

public enum Suit {
    CLUBS("C"),
    DIAMONDS("D"),
    HEARTS("H"),
    SPADES("S");

    private String symbol;

    private Suit(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public static EnumSet<Suit> getAllSuits() {
        return EnumSet.allOf(Suit.class);
    }
}
