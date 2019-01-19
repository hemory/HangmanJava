

public class Main {

    public static void main(String[] args) {

        Game game = new Game("treehouse");
        Prompter prompter = new Prompter(game);

        while (game.getRemainingTries() > 0 && !game.isWon()) {
            prompter.displayProgress();
            prompter.promptForGuess();
        }
        prompter.displayOutCome();

//        As a prompter, I should know the name of the guesser so that things can appear more friendly.
//        As a prompter, I should know the highest score, so that it can be used to encourage competition
        // Add a way for the user to create new words
        // Make away to continue the game.
    }
}
