import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> getMessage = () -> "Hello from Supplier!";

        // Supplier қолдану
        System.out.println(getMessage.get());  // Hello from Supplier!
    }
}



