import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Сан енгіз: ");
        double num = sc.nextDouble();

        System.out.println("Түбірі: " + Math.sqrt(num));
    }
}