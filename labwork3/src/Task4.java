import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int start = Math.min(x, y);
        int end = Math.max(x, y);

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
    }
}
