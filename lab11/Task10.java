import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Өрнек енгіз (мысалы: 2 + 3 * 4): ");
        double a = sc.nextDouble();
        String op = sc.next();
        double b = sc.nextDouble();

        double result = 0;

        switch (op) {
            case "+": result = a + b; break;
            case "-": result = a - b; break;
            case "*": result = a * b; break;
            case "/": result = a / b; break;
            default:
                System.out.println("Қате оператор");
                return;
        }

        System.out.println("Нәтиже: " + result);
    }
}





