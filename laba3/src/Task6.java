import java.util.Scanner;
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Некорректный размер");
            return;
        }

        int[] arr = new int[size];

        int value = 2;
        for (int i = 0; i < size; i++) {
            arr[i] = value;
            value += 5;
        }

        System.out.println(Arrays.toString(arr));
    }
}
