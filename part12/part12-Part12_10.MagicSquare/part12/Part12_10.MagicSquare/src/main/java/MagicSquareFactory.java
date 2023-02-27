
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int row = 0;
        int col = size / 2;

        for (int i = 1; i <= size * size; i++) {
            square.placeValue(row, col, i);

            if (i % size == 0) {
                row++;
            } else {
                row--;
                col++;

                if (row < 0) {
                    row = size - 1;
                }

                if (col > size - 1) {
                    col = 0;
                }
            }
        }

        return square;
    }

}
