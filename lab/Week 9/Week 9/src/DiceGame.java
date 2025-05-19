public class DiceGame {
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public DiceGame(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
        this.currentPlayer = player1;
    }

    public boolean playTurn() {
        currentPlayer.rollDice();
        int currentTotal = currentPlayer.getCurrentTotal();

        Player otherPlayer = (currentPlayer == player1) ? player2 : player1;
        otherPlayer.rollDice();
        int otherTotal = otherPlayer.getCurrentTotal();

        System.out.println(currentPlayer.getName() + " rolled: " + currentTotal);
        System.out.println(otherPlayer.getName() + " rolled: " + otherTotal);

        if (currentTotal == 7 && otherTotal != 7) {
            return true; // Current player wins
        }

        currentPlayer = (currentPlayer == player1) ? player2 : player1;
        return false; // Game continues
    }
}