import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите возраст: ");
        String age = scanner.nextLine();
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}