import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Введите второе число: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Сумма: " + (a + b));
    }
}