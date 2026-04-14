import java.util.function.BiFunction;

public class LambdaAddition {
    public static void main(String[] args) {
        // Лямбда-өрнек арқылы екі санды қосу
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(5, 7));  // 12
    }
}
