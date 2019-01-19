import java.util.Scanner;

public class Prompter {
    Scanner scanner = new Scanner(System.in);
    private Game game;

    public Prompter(Game game) {
        this.game = game;
    }

    public boolean promptForGuess() {
        boolean isHit = false;
        boolean isAcceptable = false;


        do {
            System.out.print("Enter a letter:  ");
            String guessInput = scanner.nextLine();

            try {
                isHit = game.applyGuess(guessInput);
                isAcceptable = true;
            } catch (IllegalArgumentException iae) {
                System.out.printf("%s.  Please try again. %n", iae.getMessage());
            }
        } while (!isAcceptable);
        return isHit;
    }


    public void displayProgress() {
        System.out.printf("You have %d tries left to solve: %s%n",
                game.getRemainingTries(),
                game.getCurrentProgress());

    }

    //(game.getRemainingTries() > 0 && !game.isWon())
    public void displayOutCome() {
            if (game.isWon()) {
                System.out.printf("Yo, good stuff! You won with %d remaining tries%n", game.getRemainingTries());
            } else {
                System.out.printf("Ahhh, not so good fam. The word you were looking for was:  %s%n ", game.getAnswer());
            }
        }
    }


