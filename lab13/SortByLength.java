import java.util.Arrays;
import java.util.List;

public class SortByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange");

        // Жолдарды ұзындығына қарай сұрыптау
        words.stream()
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .forEach(System.out::println);  // kiwi, apple, orange, banana
    }
}