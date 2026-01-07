import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 5 && n <= 10) {
            System.out.println("Число в диапазоне");
        } else {
            System.out.println("Число вне диапазона");
        }
    }
}