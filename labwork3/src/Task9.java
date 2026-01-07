import java.util.Random;
import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100);
        }

        System.out.println("Массив: " + Arrays.toString(arr));

        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }

        System.out.println("Минимальное значение: " + min);
        System.out.print("Индексы: ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                System.out.print(i + " ");
            }
        }
    }
}
