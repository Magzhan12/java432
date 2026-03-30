import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Қосу: " + (a + b));
        System.out.println("Азайту: " + (a - b));
        System.out.println("Көбейту: " + (a * b));
        System.out.println("Бөлу: " + (a / b));
    }
}