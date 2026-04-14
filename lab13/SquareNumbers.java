import java.util.Arrays;
import java.util.List;

public class SquareNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Сандардың квадратын табу
        numbers.stream()
                .map(n -> n * n)
                .forEach(System.out::println);  // 1, 4, 9, 16, 25
    }
}