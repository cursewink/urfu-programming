public class Task3 {
    public static void main(String[] args) {
        C obj = new C(10, 'A', "Hello");
        System.out.println(obj);
    }
}

class A {
    public int x;

    public A(int x) {
        this.x = x;
    }

    public void set(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Class A: x = " + x;
    }
}

class B extends A {
    public char ch;

    public B(int x, char ch) {
        super(x);
        this.ch = ch;
    }

    public void set(int x, char ch) {
        this.x = x;
        this.ch = ch;
    }

    @Override
    public String toString() {
        return "Class B: x = " + x + ", ch = " + ch;
    }
}

class C extends B {
    public String text;

    public C(int x, char ch, String text) {
        super(x, ch);
        this.text = text;
    }

    public void set(int x, char ch, String text) {
        this.x = x;
        this.ch = ch;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Class C: x = " + x + ", ch = " + ch + ", text = \"" + text + "\"";
    }
}

