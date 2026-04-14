import java.util.Arrays;
import java.util.List;

public class StreamChainingExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Stream chaining қолдану: тақ сандарды алып, олардың квадратын есептеу
        numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .forEach(System.out::println);  // 1, 9, 25
    }
}

