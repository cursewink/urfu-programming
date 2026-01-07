public class Task2 {
    public static void main(String[] args) {
        CharRangePrinter charRangePrinterJV = new CharRangePrinter('J', 'V');
        CharRangePrinter charRangePrinterAF = new CharRangePrinter('A', 'F');
        charRangePrinterJV.printRange(); // J K L M N O P Q R S T U V
        charRangePrinterAF.printRange(); // A B C D E F
    }
}

class CharRangePrinter {
    private char start;
    private char end;

    public CharRangePrinter(char start, char end) {
        this.start = start;
        this.end = end;
    }

    public void printRange() {
        char from = (char) Math.min(start, end);
        char to = (char) Math.max(start, end);

        for (char c = from; c <= to; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
