public class Task4 {
    public static void main(String[] args) {
        Third original = new Third('X', "Copy", 100);
        Third copy = new Third(original);

        System.out.println(copy.ch);
        System.out.println(copy.text);
        System.out.println(copy.number);
    }
}


class First {
    public char ch;

    public First(char ch) {
        this.ch = ch;
    }

    public First(First other) {
        this.ch = other.ch;
    }
}

class Second extends First {
    public String text;

    public Second(char ch, String text) {
        super(ch);
        this.text = text;
    }

    public Second(Second other) {
        super(other);
        this.text = other.text;
    }
}

class Third extends Second {
    public int number;

    public Third(char ch, String text, int number) {
        super(ch, text);
        this.number = number;
    }

    public Third(Third other) {
        super(other);
        this.number = other.number;
    }
}