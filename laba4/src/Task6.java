import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random rand = new Random();

        int rows = 5;
        int cols = 6;

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

        int delRow = rand.nextInt(rows);
        int delCol = rand.nextInt(cols);

        System.out.println("\nУдаляем строку: " + delRow);
        System.out.println("Удаляем столбец: " + delCol);

        int[][] newArr = new int[rows - 1][cols - 1];

        int r = 0;
        for (int i = 0; i < rows; i++) {
            if (i == delRow) continue;
            int c = 0;
            for (int j = 0; j < cols; j++) {
                if (j == delCol) continue;
                newArr[r][c] = arr[i][j];
                c++;
            }
            r++;
        }

        System.out.println("\nНовый массив:");
        for (int[] row : newArr) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }
}
