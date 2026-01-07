import java.util.Arrays;

public class Task7 {
    public static void main(String args[]) {
        System.out.println(Arrays.toString(CharCodes.toCodes(new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'}))); // [65, 66, 67, 68, 69, 70, 71, 72]
    }
}
class CharCodes {

    static int[] toCodes(char[] chars) {
        int[] result = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            result[i] = chars[i];
        }
        return result;
    }
}
