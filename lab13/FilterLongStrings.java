import java.util.Arrays;
import java.util.List;

public class FilterLongStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "grape", "orange");

        // Ұзындығы 5-тен үлкен жолдарды сүзу
        words.stream()
                .filter(word -> word.length() > 5)
                .forEach(System.out::println);  // banana, orange
    }
}

