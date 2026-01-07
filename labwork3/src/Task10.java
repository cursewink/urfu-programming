import java.util.Arrays;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int size = 25;
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100);
        }

        System.out.println("Исходный массив:");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();

        Arrays.sort(arr);

        reverseArray(arr, size);

        System.out.println("Отсортированный по убыванию:");
        for (int x : arr) System.out.print(x + " ");
    }

    public static void reverseArray(int[] arr, int arr_size) {
        for (int i = 0; i < arr_size / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr_size - 1 - i];
            arr[arr_size - 1 - i] = temp;
        }
    }
}
