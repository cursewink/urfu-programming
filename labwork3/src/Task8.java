public class Task8 {
    public static void main(String[] args) {
        char[] arr = new char[10];
        char letter = 'A';

        int index = 0;
        while (index < 10) {
            if ("AEIOU".indexOf(letter) == -1) {
                arr[index] = letter;
                index++;
            }
            letter++;
        }

        for (char c : arr) {
            System.out.print(c + " ");
        }
    }
}
