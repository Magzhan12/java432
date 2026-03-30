import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Сан енгіз: ");
            int num = sc.nextInt();
            System.out.println("Сен енгіздің: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Қате! Сан енгізу керек!");
        }
    }
}


