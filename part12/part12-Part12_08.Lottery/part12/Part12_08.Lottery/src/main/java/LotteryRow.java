
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful

        Random random = new Random();
        int i = 0;
        while (i < 7) {
            int number = random.nextInt(40) + 1;
            if (!containsNumber(number)) {
                numbers.add(number);
                i++;
            }
        }
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}

