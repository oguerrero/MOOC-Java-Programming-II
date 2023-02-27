import java.util.ArrayList;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private final List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void sort() {
        cards.sort(null);
    }

    @Override
    public int compareTo(Hand hand) {
        return cards.stream()
                .map(Card::getValue)
                .reduce(0, Integer::sum) -
                hand.cards.stream()
                .map(Card::getValue)
                .reduce(0, Integer::sum);
    }

    public void sortBySuit() {
        cards.sort(new BySuitInValueOrder());
    }
}
