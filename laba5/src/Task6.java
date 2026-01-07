public class Task6 {
    public static void main(String[] args) {
        MinMax minMaxEmpty = new MinMax();
        MinMax minMaxOneValue = new MinMax(4);
        MinMax minMaxTwoValues = new MinMax(42, 52);
        minMaxEmpty.printValues();
        minMaxOneValue.printValues();
        minMaxTwoValues.printValues();
        minMaxTwoValues.assign(22, 67);
        minMaxTwoValues.printValues();
        minMaxTwoValues.assign(33, 65);
        minMaxTwoValues.printValues();
    }
}

class MinMax {
    private int min;
    private int max;

    public MinMax() {
        this.min = 0;
        this.max = 0;
    }

    public MinMax(int value) {
        min = value;
        max = value;
    }

    public MinMax(int a, int b) {
        min = Math.min(a, b);
        max = Math.max(a, b);
    }

    public void assign(int value) {
        int smallest = Math.min(Math.min(min, max), value);
        int largest = Math.max(Math.max(min, max), value);

        min = smallest;
        max = largest;
    }

    public void assign(int a, int b) {
        int smallest = Math.min(Math.min(min, max), Math.min(a, b));
        int largest = Math.max(Math.max(min, max), Math.max(a, b));

        min = smallest;
        max = largest;
    }

    public void printValues() {
        System.out.println("min = " + min + ", max = " + max);
    }
}
