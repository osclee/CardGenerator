package cardgen;

public enum Suit {
    CLUB("clubs"),
    DIAMOND("diamonds"),
    HEART("hearts"),
    SPADE("spades"),
    NONE("");

    private final String name;
    Suit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
