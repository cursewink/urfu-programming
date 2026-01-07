import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = Integer.parseInt(scanner.nextLine());
        int a = n - 1;
        int b = n;
        int c = n + 1;
        long d = (long) Math.pow(a + b + c, 2);
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}