import java.util.Arrays;
import java.util.List;

public class FilterOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Тақ сандарды сүзу
        numbers.stream()
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);  // 1, 3, 5, 7, 9
    }
}