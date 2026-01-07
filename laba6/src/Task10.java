public class Task10 {
    public static void main(String[] args) {
        int[] result = MathUtil.findMaxMin(10, -3, 5, 7, 22, 1);

        System.out.println("Максимум: " + result[0]); // Максимум: 22
        System.out.println("Минимум: " + result[1]); // Минимум: -3
    }
}

class MathUtil {
    public static int[] findMaxMin(int... nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("Не передано ни одного числа");
        }

        int max = nums[0];
        int min = nums[0];

        for (int n : nums) {
            if (n > max) max = n;
            if (n < min) min = n;
        }

        return new int[]{max, min};
    }
}