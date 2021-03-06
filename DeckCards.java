public class DeckCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] Type = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] Position = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        for (int i = 0; i < 52; i++) {
            String suit = Type[deck[i] / 13];
            String rank = Position[deck[i] % 13];
            System.out.println(rank + " of " + suit);
        }
    }
}
