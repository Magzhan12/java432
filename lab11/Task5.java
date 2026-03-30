import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 – қосу");
        System.out.println("2 – азайту");
        System.out.println("3 – көбейту");
        System.out.println("4 – бөлу");

        int choice = sc.nextInt();

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        switch (choice) {
            case 1: System.out.println(a + b); break;
            case 2: System.out.println(a - b); break;
            case 3: System.out.println(a * b); break;
            case 4: System.out.println(a / b); break;
            default: System.out.println("Қате таңдау");
        }
    }
}








