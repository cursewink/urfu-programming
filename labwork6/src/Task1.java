public class Task1 {
    public static void main(String[] args) {
        ClassWithOverload classWithOverload1 = new ClassWithOverload();
        classWithOverload1.setValue('A');
        classWithOverload1.show();

        ClassWithOverload classWithOverload2 = new ClassWithOverload();
        classWithOverload2.setValue("Hello");
        classWithOverload2.show();

        ClassWithOverload classWithOverload3 = new ClassWithOverload();
        classWithOverload3.setValue(new char[] {'A', 'B', 'C'});
        classWithOverload3.show();

    }
}

class ClassWithOverload {
    private char charField;
    private String textField;

    // Метод для присваивания символа
    void setValue(char c) {
        this.charField = c;
    }

    // Метод для присваивания строки
    void setValue(String s) {
        this.textField = s;
    }

    // Метод для массива символов
    void setValue(char[] arr) {
        if (arr.length == 1) {
            this.charField = arr[0];
        } else {
            this.textField = new String(arr);
        }
    }

    void show() {
        System.out.println("charField = " + charField);
        System.out.println("textField = " + textField);
    }
}
