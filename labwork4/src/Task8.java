import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текст для шифрования");
        String text = sc.nextLine();

        System.out.println("Введите ключ");
        int key = sc.nextInt();
        sc.nextLine();

        String encrypted = caesar(text, key);
        System.out.println("Текст после преобразования: " + encrypted);

        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String ans = sc.nextLine().trim().toLowerCase();

            if (ans.equals("y")) {
                String decrypted = caesar(encrypted, -key);
                System.out.println("Обратное преобразование: " + decrypted);
                break;
            } else if (ans.equals("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }

        sc.close();
    }

    public static String caesar(String text, int key) {
        StringBuilder sb = new StringBuilder();

        for (char c : text.toCharArray()) {
            int code = (int) c;
            code += key;
            sb.append((char) code);
        }

        return sb.toString();
    }
}
