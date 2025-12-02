import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 5;
        int[][] arr = new int[rows][cols];

        int num = 1;
        boolean reverse = false;

        for(int i = 0; i < rows; i++) {
            if (!reverse) {
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = num++;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    arr[i][j] = num++;
                }
            }
            reverse = !reverse;
        }

        // Вывод массива
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
