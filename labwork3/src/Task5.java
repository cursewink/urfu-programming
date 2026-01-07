import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            boolean good = (i % 5 == 2) || (i % 3 == 1);
            if (good) {
                count++;
                sum += i;
            }
        }

        System.out.println("Количество: " + count);
        System.out.println("Сумма: " + sum);
    }
}
