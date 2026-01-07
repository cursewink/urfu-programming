package Task3;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        String consonants = "бвгджзйклмнпрстфхцчшщ";

        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("task3/text.txt"), "UTF-8"));
             PrintWriter pw = new PrintWriter("task3/result.txt", "UTF-8")) {

            String line;
            int lineNum = 0;

            while ((line = br.readLine()) != null) {
                lineNum++;
                String[] words = line.split("[\\s,.!?;:]+");
                int count = 0;
                StringBuilder sb = new StringBuilder();

                for (String w : words) {
                    if (!w.isEmpty() && consonants.indexOf(Character.toLowerCase(w.charAt(0))) >= 0) {
                        sb.append(w).append(" ");
                        count++;
                    }
                }

                if (count > 0) {
                    pw.println("Строка " + lineNum + ": " + sb.toString());
                    pw.println("Количество слов: " + count);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
