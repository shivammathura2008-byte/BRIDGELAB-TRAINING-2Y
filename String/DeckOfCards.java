package String;

import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int numPlayers = scanner.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = scanner.nextInt();

        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);

        String[][] players = distributeCards(deck, numPlayers, cardsPerPlayer);

        if (players != null) {
            printPlayerCards(players);
        }

        scanner.close();
    }

    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        String[] deck = new String[suits.length * ranks.length];
        int index = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        if (players * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return null;
        }

        String[][] playerHands = new String[players][cardsPerPlayer];
        int cardIndex = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerHands[i][j] = deck[cardIndex];
                cardIndex++;
            }
        }
        return playerHands;
    }

    public static void printPlayerCards(String[][] playerHands) {
        for (int i = 0; i < playerHands.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + " Cards:");
            System.out.println("--------------------");
            for (int j = 0; j < playerHands[i].length; j++) {
                System.out.println(playerHands[i][j]);
            }
        }
    }
}
