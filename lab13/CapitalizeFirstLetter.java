import java.util.Arrays;
import java.util.List;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        // Жолдың бірінші әрпін бас әріпке айналдыру
        String str = "hello";
        String capitalized = str.substring(0, 1).toUpperCase() + str.substring(1);
        System.out.println(capitalized);  // Hello
    }
}