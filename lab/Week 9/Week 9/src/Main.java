public class Main {
    public static void main(String[] args) {
        DiceGame game = new DiceGame("Player 1", "Player 2");

        while (!game.playTurn()) {
            System.out.println("Game continues...");
        }

        System.out.println("Game Over!");
    }
}