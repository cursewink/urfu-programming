public class Task1 {
    public static void main(String[] args) {
        SuperText a = new SuperText("Hello");
        SubText b = new SubText("Hello", "World");

        System.out.println(a);
        System.out.println(b);
    }
}

class SuperText {
    private String text;

    public SuperText(String text) {
        this.text = text;
    }

    protected String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "SuperText: text = \"" + text + "\"";
    }
}

class SubText extends SuperText {
    private String extraText;

    public SubText(String text) {
        super(text);
        this.extraText = "";
    }

    public SubText(String text, String extraText) {
        super(text);
        this.extraText = extraText;
    }

    @Override
    public String toString() {
        return "SubText: text = \"" + getText() +
                "\", extraText = \"" + extraText + "\"";
    }
}
