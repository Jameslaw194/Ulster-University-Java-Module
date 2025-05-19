public class Player {
    private String name;
    private DicePair dicePair;

    public Player(String name) {
        this.name = name;
        this.dicePair = new DicePair();
    }

    public void rollDice() {
        dicePair.roll();
    }

    public int getCurrentTotal() {
        return dicePair.getTotal();
    }

    public String getName() {
        return name;
    }
}