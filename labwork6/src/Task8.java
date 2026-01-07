import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String args[]) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
        System.out.println(ArrayAverage.average(arr)); // 5.0
    }
}
class ArrayAverage {
    static double average(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return (double) sum / arr.length;
    }
}
