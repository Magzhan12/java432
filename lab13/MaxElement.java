import java.util.Arrays;
import java.util.List;

public class MaxElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 8, 3, 7, 9);

        // Ең үлкен элементті табу
        Integer max = numbers.stream()
                .max(Integer::compare)
                .orElseThrow();
        System.out.println(max);  // 9
    }
}