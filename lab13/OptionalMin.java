import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class OptionalMin {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 15, 7, 22, 9);

        // Минимумды табу
        Optional<Integer> min = numbers.stream()
                .min(Integer::compare);
        min.ifPresent(System.out::println);  // 7
    }
}