public class Task3 {
    public static void main(String[] args) {
        System.out.println(MathUtils.average(1,2,3,4,5)); // 3.0
        System.out.println(MathUtils.max(1,2,3,4,5)); // 5
        System.out.println(MathUtils.min(1,2,3,4,5)); // 1
    }
}

class MathUtils {

    static int max(int... nums) {
        int m = nums[0];
        for (int n : nums) if (n > m) m = n;
        return m;
    }

    static int min(int... nums) {
        int m = nums[0];
        for (int n : nums) if (n < m) m = n;
        return m;
    }

    static double average(int... nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return (double) sum / nums.length;
    }
}
