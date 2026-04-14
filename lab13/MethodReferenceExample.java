import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange");

        // Method Reference қолдану
        words.forEach(System.out::println);  // apple, banana, kiwi, orange
    }
}