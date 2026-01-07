public class Task4 {
    public static void main(String[] args) {
        System.out.println(DoubleFactorial.doubleFactorial(6)); // 48
    }
}

class DoubleFactorial {

    static long doubleFactorial(int n) {
        long result = 1;
        for (int i = n; i > 1; i -= 2) {
            result *= i;
        }
        return result;
    }
}
