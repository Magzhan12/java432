class Counter {
    static int count = 0;

    static void increment() {
        count++;
    }
}

public class Main4 {
    public static void main(String[] args) {
        Counter.increment();
        Counter.increment();
        System.out.println(Counter.count);
    }
}