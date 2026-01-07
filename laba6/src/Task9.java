public class Task9 {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e'};

        ArrayUtils2.reverseArray(arr); // e d c b a

        // Печать результата
        for (char c : arr) {
            System.out.print(c + " "); // e d c b a
        }
    }
}

class ArrayUtils2 {
    public static void reverseArray(char[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }
}