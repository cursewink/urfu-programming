import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int thousands = (n / 1000) % 10;
        System.out.println("Тысяч: " + thousands);
    }
}
