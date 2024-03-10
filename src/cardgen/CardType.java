package cardgen;

public enum CardType {
    CLUBS_ACE(Suit.CLUB, "ace"),
    CLUBS_TWO(Suit.CLUB, "two"),
    CLUBS_THREE(Suit.CLUB, "three"),
    CLUBS_FOUR(Suit.CLUB, "four"),
    CLUBS_FIVE(Suit.CLUB, "five"),
    CLUBS_SIX(Suit.CLUB, "six"),
    CLUBS_SEVEN(Suit.CLUB, "seven"),
    CLUBS_EIGHT(Suit.CLUB, "eight"),
    CLUBS_NINE(Suit.CLUB, "nine"),
    CLUBS_TEN(Suit.CLUB, "ten"),
    CLUBS_JACK(Suit.CLUB, "jack"),
    CLUBS_QUEEN(Suit.CLUB, "queen"),
    CLUBS_KING(Suit.CLUB, "king"),
    DIAMONDS_ACE(Suit.DIAMOND, "ace"),
    DIAMONDS_TWO(Suit.DIAMOND, "two"),
    DIAMONDS_THREE(Suit.DIAMOND, "three"),
    DIAMONDS_FOUR(Suit.DIAMOND, "four"),
    DIAMONDS_FIVE(Suit.DIAMOND, "five"),
    DIAMONDS_SIX(Suit.DIAMOND, "six"),
    DIAMONDS_SEVEN(Suit.DIAMOND, "seven"),
    DIAMONDS_EIGHT(Suit.DIAMOND, "eight"),
    DIAMONDS_NINE(Suit.DIAMOND, "nine"),
    DIAMONDS_TEN(Suit.DIAMOND, "ten"),
    DIAMONDS_JACK(Suit.DIAMOND, "jack"),
    DIAMONDS_QUEEN(Suit.DIAMOND, "queen"),
    DIAMONDS_KING(Suit.DIAMOND, "king"),
    HEARTS_ACE(Suit.HEART, "ace"),
    HEARTS_TWO(Suit.HEART, "two"),
    HEARTS_THREE(Suit.HEART, "three"),
    HEARTS_FOUR(Suit.HEART, "four"),
    HEARTS_FIVE(Suit.HEART, "five"),
    HEARTS_SIX(Suit.HEART, "six"),
    HEARTS_SEVEN(Suit.HEART, "seven"),
    HEARTS_EIGHT(Suit.HEART, "eight"),
    HEARTS_NINE(Suit.HEART, "nine"),
    HEARTS_TEN(Suit.HEART, "ten"),
    HEARTS_JACK(Suit.HEART, "jack"),
    HEARTS_QUEEN(Suit.HEART, "queen"),
    HEARTS_KING(Suit.HEART, "king"),
    SPADES_ACE(Suit.SPADE, "ace"),
    SPADES_TWO(Suit.SPADE, "two"),
    SPADES_THREE(Suit.SPADE, "three"),
    SPADES_FOUR(Suit.SPADE, "four"),
    SPADES_FIVE(Suit.SPADE, "five"),
    SPADES_SIX(Suit.SPADE, "six"),
    SPADES_SEVEN(Suit.SPADE, "seven"),
    SPADES_EIGHT(Suit.SPADE, "eight"),
    SPADES_NINE(Suit.SPADE, "nine"),
    SPADES_TEN(Suit.SPADE, "ten"),
    SPADES_JACK(Suit.SPADE, "jack"),
    SPADES_QUEEN(Suit.SPADE, "queen"),
    SPADES_KING(Suit.SPADE, "king"),
    CARD_BACK(Suit.NONE, "card_back");

    private final Suit suit;
    private final String name;

    CardType(Suit suit, String name) {
        this.suit = suit;
        this.name = name;
    }

    public Suit getSuit() {
        return suit;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return suit.getName() + "_" + name;
    }
}
