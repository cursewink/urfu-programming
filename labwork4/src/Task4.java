public class Task4 {
    public static void main(String[] args) {
        int size = 7;  // высота треугольника

        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = 1;
            }
        }

        // вывод треугольника
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i][j] == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
