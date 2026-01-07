import java.util.Scanner;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        char[] arr = new char[size];
        char ch = 'a';

        for (int i = 0; i < size; i++) {
            arr[i] = ch;
            ch += 2;
        }

        System.out.println("Прямой порядок: " + Arrays.toString(arr));

        // обратный порядок
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
