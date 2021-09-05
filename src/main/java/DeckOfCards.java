import java.util.Random;

public class DeckOfCards {
    public static void main(String[] args) {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};

        String[] cards = new String[suits.length * ranks.length];
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                cards[suits.length * i + j] = ranks[i] + " of " + suits[j];
            }
        }


        for (int i = 0; i < suits.length * ranks.length; i++) {
            Random rand = new Random();
            int r = i + rand.nextInt(52 - i);

            String temp = cards[r];
            cards[r] = cards[i];
            cards[i] = temp;
        }

        System.out.println("For player 1");
        for (int i = 0; i < 9; i++) {
            System.out.println(cards[i]);
        }
        System.out.println("For player 2");
        for (int i = 9; i < 18; i++) {
            System.out.println(cards[i]);
        }
        System.out.println("For player 3");
        for (int i = 18; i < 27; i++) {
            System.out.println(cards[i]);
        }
        System.out.println("For player 4");
        for (int i = 27; i < 36; i++) {
            System.out.println(cards[i]);
        }

    }
}