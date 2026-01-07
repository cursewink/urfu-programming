public class Task3 {
    public static void main(String[] args) {
        NumberPair numPair1 = new NumberPair();
        NumberPair numPair2 = new NumberPair(1);
        NumberPair numPair3 = new NumberPair(1,1);
    }
}

class NumberPair {
    int a;
    int b;

    public NumberPair() {
    }

    public NumberPair(int a) {
        this.a = a;
    }

    public NumberPair(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
