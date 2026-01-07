public class Task5 {
    public static void main(String[] args) {
        NumberField a = new NumberField();
        System.out.println(a.getValue()); // 0

        NumberField b = new NumberField(50);
        System.out.println(b.getValue()); // 50

        NumberField c = new NumberField(150);
        System.out.println(c.getValue()); // 100

        a.setValue(75);
        System.out.println(a.getValue()); // 75

        a.setValue(250);
        System.out.println(a.getValue()); // 100

        a.setValue();
        System.out.println(a.getValue()); // 0
    }
}

class NumberField {
    private int value;

    public NumberField() {
        setValue();
    }

    public NumberField(int value) {
        setValue(value);
    }

    public void setValue() {
        this.value = 0;
    }

    public void setValue(int value) {
        if (value > 100) {
            this.value = 100;
        } else {
            this.value = value;
        }
    }

    public int getValue() {
        return value;
    }
}
