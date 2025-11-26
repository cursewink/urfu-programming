import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 4 == 0 && n >= 10) {
            System.out.println("Число подходит");
        } else {
            System.out.println("Число не подходит");
        }
    }
}