package String;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of games to play: ");
        int numGames = scanner.nextInt();

        String[][] gameResults = new String[numGames][3];
        int userWins = 0;
        int compWins = 0;

        for (int i = 0; i < numGames; i++) {
            System.out.print("Game " + (i + 1) + " - Choose (Rock/Paper/Scissors): ");
            String userChoice = scanner.next();
            String compChoice = getComputerChoice();
            String winner = getWinner(userChoice, compChoice);

            gameResults[i][0] = userChoice;
            gameResults[i][1] = compChoice;
            gameResults[i][2] = winner;

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
        }

        String[][] stats = calculateStats(userWins, compWins, numGames);
        displayResults(gameResults, stats);

        scanner.close();
    }

    public static String getComputerChoice() {
        int rand = (int) (Math.random() * 3);
        if (rand == 0) return "Rock";
        if (rand == 1) return "Paper";
        return "Scissors";
    }

    public static String getWinner(String user, String comp) {
        user = user.toLowerCase();
        comp = comp.toLowerCase();

        if (user.equals(comp)) return "Tie";

        if ((user.equals("rock") && comp.equals("scissors")) ||
                (user.equals("paper") && comp.equals("rock")) ||
                (user.equals("scissors") && comp.equals("paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static String[][] calculateStats(int userWins, int compWins, int totalGames) {
        double userWinPct = (userWins * 100.0) / totalGames;
        double compWinPct = (compWins * 100.0) / totalGames;

        return new String[][]{
                {"User", String.valueOf(userWins), String.format("%.2f", userWinPct) + "%"},
                {"Computer", String.valueOf(compWins), String.format("%.2f", compWinPct) + "%"}
        };
    }

    public static void displayResults(String[][] games, String[][] stats) {
        System.out.println("\nUser\t\tComputer\tWinner");
        System.out.println("----------------------------------------");
        for (int i = 0; i < games.length; i++) {
            System.out.println(games[i][0] + "\t\t" + games[i][1] + "\t\t" + games[i][2]);
        }

        System.out.println("\nPlayer\t\tWins\t\tWin %");
        System.out.println("----------------------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t\t" + stats[i][1] + "\t\t" + stats[i][2]);
        }
    }
}