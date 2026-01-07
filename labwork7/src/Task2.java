public class Task2 {
    public static void main(String[] args) {
        ExtendedString obj = new ExtendedString(10, "Java");
        obj.setValue("Hello", 25);

        System.out.println(obj.getText());
        System.out.println(obj.number);
        System.out.println(obj.length());
    }
}

class BaseString {
    private String text;

    public BaseString(String text) {
        this.text = text;
    }

    public void setValue(String text) {
        this.text = text;
    }

    public int length() {
        return text.length();
    }

    protected String getText() {
        return text;
    }
}

class ExtendedString extends BaseString {
    public int number;

    public ExtendedString(int number, String text) {
        super(text);
        this.number = number;
    }

    public void setValue() {
        super.setValue("");
        number = 0;
    }

    @Override
    public void setValue(String text) {
        super.setValue(text);
    }

    public void setValue(int number) {
        this.number = number;
    }

    public void setValue(String text, int number) {
        super.setValue(text);
        this.number = number;
    }
}
