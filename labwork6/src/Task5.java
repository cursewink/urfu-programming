public class Task5 {
    public static void main(String[] args) {
        System.out.println(SquareSum.sumSquares(6)); // 91
    }
}

class SquareSum {

    static long sumSquares(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
}
