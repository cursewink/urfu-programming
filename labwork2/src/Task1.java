import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 3 == 0) {
            System.out.println("Число делится на 3");
        } else {
            System.out.println("Число НЕ делится на 3");
        }
    }
}
