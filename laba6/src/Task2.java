public class Task2 {
    public static void main(String[] args) {
        Counter.showAndIncrement(); // 0
        Counter.showAndIncrement(); // 1
        Counter.showAndIncrement(); // 2
        Counter.showAndIncrement(); // 3
        Counter.showAndIncrement(); // 4
        Counter.showAndIncrement(); // 5
        Counter.showAndIncrement(); // 6
        Counter.showAndIncrement(); // 7
        Counter.showAndIncrement(); // 8
        Counter.showAndIncrement(); // 9
    }
}
class Counter {
    private static int value = 0;

    static void showAndIncrement() {
        System.out.println("Текущее значение: " + value);
        value++;
    }
}
