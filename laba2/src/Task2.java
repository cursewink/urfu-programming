import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 5 == 2 && n % 7 == 1) {
            System.out.println("Число удовлетворяет условиям");
        } else {
            System.out.println("Число НЕ удовлетворяет условиям");
        }
    }
}
