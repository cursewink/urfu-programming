public class Task1 {

    public static void main(String[] args) {
        CharWrapper charWrapper = new CharWrapper();
        charWrapper.setChar('A');
        charWrapper.printInfo(); // Символ: A, код: 65
    }
}

class CharWrapper {
    private char ch;

    public void setChar(char ch) {
        this.ch = ch;
    }

    public int getCode() {
        return (int) ch;
    }

    public void printInfo() {
        System.out.println("Символ: " + ch + ", код: " + (int) ch);
    }
}