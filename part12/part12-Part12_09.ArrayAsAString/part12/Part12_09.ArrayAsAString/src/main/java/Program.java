
public class Program {

    public static void main(String[] args) {
        // Test your method here
    }

    public static String arrayAsString(int[][] array) {
        StringBuilder arrayAsString = new StringBuilder();
        for (int[] row : array) {
            for (int number : row) {
                arrayAsString.append(number);
            }
            arrayAsString.append("\n");
        }
        return arrayAsString.toString();
    }
}
