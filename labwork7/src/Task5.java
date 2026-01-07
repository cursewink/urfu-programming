public class Task5 {
    public static void main(String[] args) {
        Parent a = new Parent("Base");
        Parent b = new ChildInt("Number", 42);
        Parent c = new ChildChar("Symbol", 'Z');

        a.show();
        b.show();
        c.show();
    }
}

class Parent {
    private String text;

    public Parent(String text) {
        this.text = text;
    }

    protected String getText() {
        return text;
    }

    public void show() {
        System.out.println("Parent: text = " + text);
    }
}

class ChildInt extends Parent {
    protected int number;

    public ChildInt(String text, int number) {
        super(text);
        this.number = number;
    }

    @Override
    public void show() {
        System.out.println("ChildInt: text = " + getText() +
                ", number = " + number);
    }
}

class ChildChar extends Parent {
    protected char ch;

    public ChildChar(String text, char ch) {
        super(text);
        this.ch = ch;
    }

    @Override
    public void show() {
        System.out.println("ChildChar: text = " + getText() +
                ", ch = " + ch);
    }
}

