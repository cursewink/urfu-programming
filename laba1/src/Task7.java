import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age = Integer.parseInt(scanner.nextLine());
        int currentYear = 2025;
        int birthYear = currentYear - age;
        System.out.println("Год рождения: " + birthYear);
    }
}