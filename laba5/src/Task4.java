public class Task4 {
    public static void main(String[] args) {
        CharPair charIntPair = new CharPair(98, 'b');
        CharPair charDoublePair = new CharPair(98.98);

        System.out.println(charIntPair); // CharPair(98, b)
        System.out.println(charDoublePair); // CharPair(98, b)
    }
}

class CharPair {
    char ch;
    int number;

    public CharPair(int number, char ch) {
        this.number = number;
        this.ch = ch;
    }

    public CharPair(double value) {
        int code = (int) value;
        this.ch = (char) code;

        int fractional = (int) ((value - code) * 100);
        this.number = Math.abs(fractional);
    }

    @Override
    public String toString() {
        return "CharPair(" + number + ", " + ch + ")";
    }
}
