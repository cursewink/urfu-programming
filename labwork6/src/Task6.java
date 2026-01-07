import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1,2,3,4,5,6 };
        int[] arr_copied = ArrayUtils.take(arr, 4);

        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6]
        System.out.println(Arrays.toString(arr_copied)); // [1, 2, 3, 4]
    }
}

class ArrayUtils {

    static int[] take(int[] arr, int k) {
        if (k >= arr.length) {
            return arr.clone();
        }
        int[] result = new int[k];
        System.arraycopy(arr, 0, result, 0, k);
        return result;
    }
}
