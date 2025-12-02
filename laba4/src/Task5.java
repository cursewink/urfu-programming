import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random rand = new Random();

        int rows = 3;
        int cols = 5;

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = rand.nextInt(100);
            }
        }

        System.out.println("Исходный массив:");
        for (int[] row : arr) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }

        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = arr[i][j];
            }
        }

        System.out.println("\nТранспонированный:");
        for (int[] row : transposed) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }
}
