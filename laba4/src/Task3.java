public class Task3 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 8;

        int[][] arr = new int[rows][cols];

        // заполнение 2
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = 2;
            }
        }

        // вывод массива
        for (int[] row : arr) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }
}
