package cardgen;

public enum Suit {
    CLUB("club"),
    DIAMOND("diamond"),
    HEART("heart"),
    SPADE("spade"),
    NONE("");

    private final String name;
    Suit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
