package Task2;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("task2/source.txt"), "UTF-8"));

                PrintWriter pw = new PrintWriter("task2/result.txt", "UTF-8")
        ) {
            // читаем две строки
            String first = br.readLine();
            String second = br.readLine();

            // записываем вторую строку
            pw.println(second);

            // читаем 5 чисел double
            for (int i = 0; i < 5; i++) {
                double d = Double.parseDouble(br.readLine());
                if (d > 0) {
                    pw.println(d);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}